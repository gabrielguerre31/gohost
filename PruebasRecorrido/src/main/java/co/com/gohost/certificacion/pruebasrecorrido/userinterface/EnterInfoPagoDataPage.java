package co.com.gohost.certificacion.pruebasrecorrido.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterInfoPagoDataPage {
    public static final Target PAGO_PAGE = Target.the("")
            .located(By.id("recfacelec--infoPagoTab-icon"));
    public static final Target FORMA_PAGO = Target.the("")
            .located(By.id("recfacelec--mediosPago-inner"));
    public static final Target INPUT_OBSERVACIONES = Target.the("")
            .located(By.id("recfacelec--observacionesPago-inner"));


}
