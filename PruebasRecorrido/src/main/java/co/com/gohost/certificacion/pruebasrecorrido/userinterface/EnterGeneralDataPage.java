package co.com.gohost.certificacion.pruebasrecorrido.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterGeneralDataPage {

    public static final Target INPUT_EMAIL = Target.the("")
            .located(By.id("recfacelec--emailAcr-inner"));
    public static final Target INPUT_NFACTURA = Target.the("")
            .located(By.id("recfacelec--noFactura-inner"));
    public static final Target INPUT_TIPODOC = Target.the("")
            .located(By.id("recfacelec--tipoDoc-inner"));
    public static final Target INPUT_ORDEN = Target.the("")
            .located(By.id("recfacelec--esOrdenCompra-handle"));
    public static final Target INPUT_DESTINO = Target.the("")
            .located(By.id("recfacelec--destino-inner"));
    public static final Target INPUT_SUBTOTAL= Target.the("")
            .located(By.id("recfacelec--valorSubtotal-inner"));
    public static final Target INPUT_IVA= Target.the("")
            .located(By.id("recfacelec--valorTotalIVA-inner"));
    public static final Target INPUT_IPOCONSUMO= Target.the("")
            .located(By.id("recfacelec--valorTotalIC-inner"));
    public static final Target INPUT_TOTAL= Target.the("")
            .located(By.id("recfacelec--valorTotal-inner"));






}
