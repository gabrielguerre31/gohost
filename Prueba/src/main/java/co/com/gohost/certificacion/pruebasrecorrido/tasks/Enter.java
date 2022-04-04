package co.com.gohost.certificacion.pruebasrecorrido.tasks;

import co.com.gohost.certificacion.pruebasrecorrido.utils.Utilidades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;



import static co.com.gohost.certificacion.pruebasrecorrido.userinterface.EnterPage.*;


public class Enter implements Task {
    Utilidades utilidades = new Utilidades();
    WebDriver driver;

    public Enter(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(FINANZAS_BUTTON),
                Click.on(RADICAR_FACTURA_BUTTON)
        );
        utilidades.cambiarPestana(driver);

    }

    public static Enter theModule(WebDriver driver){return Tasks.instrumented(Enter.class,driver);}

}
