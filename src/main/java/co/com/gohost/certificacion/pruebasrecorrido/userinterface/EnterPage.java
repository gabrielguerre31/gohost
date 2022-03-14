package co.com.gohost.certificacion.pruebasrecorrido.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterPage {
    public static final Target FINANZAS_BUTTON = Target.the("")
            .located(By.id("MenuModulos_lkbMisFinanzas2"));
    public static final Target RADICAR_FACTURA_BUTTON = Target.the("")
            .located(By.id("SpryMenu1_dlstRoles_dtListNivel2_1_LinkPaginas_5"));

}
