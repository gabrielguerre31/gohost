package co.com.gohost.certificacion.pruebasrecorrido.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterAdjuntosDataPage {
    public static final Target ADJUNTOS_PAGE = Target.the("")
            .located(By.id("recfacelec--adjuntosTab-icon"));
    public static final Target ADJUNTAR_ARCHIVO = Target.the("")
            .located(By.id("recfacelec--fileUploader-fu"));
    public static final Target NOMBRE_ARCHIVO = Target.the("")
            .located(By.id("recfacelec--nombreArchivo-inner"));
    public static final Target TIPO_ARCHIVO = Target.the("")
            .located(By.id("recfacelec--idTipoArchivo-inner"));
    public static final Target AGREGAR = Target.the("")
            .located(By.id("__button8-content"));
    public static final Target ACEPTAR = Target.the("")
            .located(By.id("recfacelec--botonAceptar"));
    public static final Target ENVIAR = Target.the("")
            .located(By.id("__button9"));
    public static final Target MENSAJECORRECTO = Target.the("")
            .located(By.id("__alert0-title-inner"));










}
