package co.com.gohost.certificacion.pruebasrecorrido.tasks;

import co.com.gohost.certificacion.pruebasrecorrido.models.TransarData;
import co.com.gohost.certificacion.pruebasrecorrido.utils.Utilidades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilBuilder;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static co.com.gohost.certificacion.pruebasrecorrido.userinterface.EnterGeneralDataPage.*;

public class EnterTheGeneralData implements Task {
    Utilidades utilidades = new Utilidades();
    WebDriver driver;
    String xpath = "//input[@id='recfacelec--emailAcr-inner']" ;

    private List<TransarData> transarData;

    public EnterTheGeneralData(List<TransarData> transarData, WebDriver driver) {
        this.transarData =  transarData;
        this.driver =  driver;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_TOTAL, WebElementStateMatchers.isVisible()),
                Scroll.to(INPUT_TOTAL),
                WaitUntil.the(INPUT_SUBTOTAL, WebElementStateMatchers.isVisible()),
                WaitUntil.the(INPUT_EMAIL, WebElementStateMatchers.isVisible()),
                WaitUntil.the(INPUT_TIPODOC, WebElementStateMatchers.isVisible()),
                WaitUntil.the(INPUT_ORDEN, WebElementStateMatchers.isClickable()),
                Click.on(INPUT_ORDEN),
                WaitUntil.the(INPUT_DESTINO, WebElementStateMatchers.isVisible())

        );

        actor.attemptsTo(

                Enter.theValue(transarData.get(0).getEmail()).into(INPUT_EMAIL),
                Enter.theValue(transarData.get(0).getDestino()).into(INPUT_DESTINO).thenHit(Keys.TAB),
                Enter.theValue(transarData.get(0).getTipoDocumento()).into(INPUT_TIPODOC),
                Enter.theValue(transarData.get(0).getnFactura()).into(INPUT_NFACTURA),
                Enter.theValue(transarData.get(0).getSubTotal()).into(INPUT_SUBTOTAL),
                Enter.theValue(transarData.get(0).getIva()).into(INPUT_IVA),
                Enter.theValue(transarData.get(0).getValoIpoConsu()).into(INPUT_IPOCONSUMO),
                Enter.theValue(transarData.get(0).getTotal()).into(INPUT_TOTAL)
        );

    }


    public static EnterTheGeneralData onTheGeneralPage(List<TransarData> transarData,WebDriver driver) {
        return Tasks.instrumented(EnterTheGeneralData.class,transarData,driver);
    }


}
