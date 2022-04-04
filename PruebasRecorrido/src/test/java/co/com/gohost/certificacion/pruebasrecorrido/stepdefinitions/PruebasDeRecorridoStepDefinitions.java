package co.com.gohost.certificacion.pruebasrecorrido.stepdefinitions;

import co.com.gohost.certificacion.pruebasrecorrido.models.TransarData;
import co.com.gohost.certificacion.pruebasrecorrido.questions.AnswerCorrecto;
import co.com.gohost.certificacion.pruebasrecorrido.questions.AnswerNoDisponible;
import co.com.gohost.certificacion.pruebasrecorrido.questions.AnswerObligados;
import co.com.gohost.certificacion.pruebasrecorrido.questions.AnswerYaRadicado;
import co.com.gohost.certificacion.pruebasrecorrido.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

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

    @Cuando("^ingresa los datos necesarios de la radicacion honorarios$")
    public void ingresaLosDatosNecesariosDeLaRadicacionHonorarios(List<TransarData> transarData) {
        gabriel.attemptsTo(
                EnterTheGeneralData.onTheGeneralPage(transarData),
                EnterHonorariosData.onTheHonorariosPage(transarData)
        );

    }

    @Cuando("^ingresa los datos necesarios de la radicacion exitosa$")
    public void ingresaLosDatosNecesariosDeLaRadicacionExitosa(List<TransarData> transarData) {
        gabriel.attemptsTo(
                EnterTheGeneralData.onTheGeneralPage(transarData),
                EnterHonorariosData.onTheHonorariosPage(transarData),
                EnterInfoPagoData.onTheInfoPaggoPage(transarData),
                EnterAdjuntosData.onTheAdjuntosPage(transarData)
        );
    }




    @Entonces("^el valida que la transaccion no es valida$")
    public void elValidaQueLaTransaccionNoEsValida(List<TransarData> transarData) {
        gabriel.should(seeThat(AnswerObligados.toThe(transarData)));
    }

    @Entonces("^el valida que la transaccion ya fue radicada$")
    public void elValidaQueLaTransaccionYaFueRadicada(List<TransarData> transarData) {
        gabriel.should(seeThat(AnswerYaRadicado.toThe(transarData)));

    }

    @Entonces("^el valida que la transaccion no esta disponible$")
    public void elValidaQueLaTransaccionNoEstaDisponible(List<TransarData> transarData) {
        gabriel.should(seeThat(AnswerNoDisponible.toThe(transarData)));

    }

    @Entonces("^el valida que la transaccion fue finalizada correctamente$")
    public void elValidaQueLaTransaccionFueFinalizadaCorrectamente(List<TransarData> transarData) {
        gabriel.should(seeThat(AnswerCorrecto.toThe(transarData)));

    }


}
