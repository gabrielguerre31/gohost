package co.com.gohost.certificacion.pruebasrecorrido.stepdefinitions;

import co.com.gohost.certificacion.pruebasrecorrido.models.TransarData;
import co.com.gohost.certificacion.pruebasrecorrido.tasks.Enter;
import co.com.gohost.certificacion.pruebasrecorrido.tasks.EnterTheGeneralData;
import co.com.gohost.certificacion.pruebasrecorrido.tasks.Login;
import co.com.gohost.certificacion.pruebasrecorrido.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class PruebasDeRecorridoStepDefinitions {


    @Managed
    WebDriver driver;
    Actor gabriel = Actor.named("Gabriel");

    @Before
    public void setUp(){
        gabriel.can(BrowseTheWeb.with(driver));
    }


    @Dado("^que el usuario ingresa al modulo radicar factura$")
    public void queElUsuarioIngresaAlModuloRadicarFactura(List<TransarData> transarData) {
        gabriel.wasAbleTo(OpenUp.thePage(),
                Login.onThePage(transarData), Enter.theModule(driver));

    }


    @Cuando("^ingresa los datos necesarios de la radicacion$")
    public void ingresaLosDatosNecesariosDeLaRadicacion(List<TransarData> transarData) {
        gabriel.attemptsTo(
                EnterTheGeneralData.onTheGeneralPage(transarData,driver)
        );


    }

    @Entonces("^el valida que la transaccion no es valida$")
    public void elValidaQueLaTransaccionNoEsValida() {

    }


}
