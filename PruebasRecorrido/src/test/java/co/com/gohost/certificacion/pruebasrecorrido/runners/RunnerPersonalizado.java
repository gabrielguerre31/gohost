package co.com.gohost.certificacion.pruebasrecorrido.runners;

import co.com.gohost.certificacion.pruebasrecorrido.utils.BeforeSuite;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RunnerPersonalizado extends Runner {

    public Class<CucumberWithSerenity> classValue;
    public CucumberWithSerenity cucumberWithSerenity;
    public static final Logger LOGGER = Logger.getAnonymousLogger();
       
        
        public RunnerPersonalizado(Class<CucumberWithSerenity> classValue) {
            try {
               this.classValue = classValue;
               cucumberWithSerenity = new CucumberWithSerenity(classValue);
            } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "an exception was thrown",e);
            }
           }
       
         @Override
           public Description getDescription() {
               return cucumberWithSerenity.getDescription();
           }
         
         private void runAnnotatedMethods(Class<?> annotation)  {

             try {
            if (!annotation.isAnnotation()) {
                   return;
               }
               Method[] methods = this.classValue.getMethods();
               for (Method method : methods) {
                   Annotation[] annotations = method.getAnnotations();
                   for (Annotation item : annotations) {
                       if (item.annotationType().equals(annotation)) {
                           method.invoke(null);
                           break;
                       }
                   }
               }
             } catch (Exception e) {
                 LOGGER.log(Level.SEVERE, "an exception was thrown",e);
             }
         }
         
         @Override
           public void run(RunNotifier notifier) {
               try {
                   runAnnotatedMethods(BeforeSuite.class);
                   cucumberWithSerenity = new CucumberWithSerenity(classValue);
               } catch (Exception e) {
                   LOGGER.log(Level.SEVERE, "an exception was thrown",e);
               }
               cucumberWithSerenity.run(notifier);
           }
}
