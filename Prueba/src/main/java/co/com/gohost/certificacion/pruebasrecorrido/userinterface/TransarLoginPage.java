package co.com.gohost.certificacion.pruebasrecorrido.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TransarLoginPage {
    public static final Target INPUT_TIPO_DOCUMENTO = Target.the("Campo tipo Doc")
            .located(By.id("DocumentType"));
    public static final Target INPUT_USER = Target.the(" Campo usuario")
            .located(By.id("DocumentID"));
    public static final Target INPUT_PASSWORD = Target.the("Campo contraseña ")
            .located(By.id("Password"));
    public static final Target ENTER_BUTTON = Target.the("")
            .located(By.id("btnSubmit"));

}
