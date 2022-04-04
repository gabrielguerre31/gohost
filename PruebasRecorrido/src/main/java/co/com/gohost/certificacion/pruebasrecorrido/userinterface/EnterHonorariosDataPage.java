package co.com.gohost.certificacion.pruebasrecorrido.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterHonorariosDataPage {

    public static final Target HONORARIOS_PAGE = Target.the("")
            .located(By.id("recfacelec--honorarios-icon"));
    public static final Target LIST_YEAR = Target.the("")
            .located(By.id("recfacelec--ejercicio-arrow"));
    public static final Target LIST_MONTH = Target.the("")
            .located(By.id("recfacelec--periodo-arrow"));
    public static final Target BUTTON_HONORARIOS = Target.the("")
            .located(By.id("__button4"));
    public static final Target MENSAJE = Target.the("")
            .located(By.id("__text45"));


}
