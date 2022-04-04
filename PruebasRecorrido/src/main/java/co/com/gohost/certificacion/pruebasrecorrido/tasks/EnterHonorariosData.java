package co.com.gohost.certificacion.pruebasrecorrido.tasks;

import co.com.gohost.certificacion.pruebasrecorrido.models.TransarData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValueIntoBy;
import org.openqa.selenium.By;

import java.util.List;

import static co.com.gohost.certificacion.pruebasrecorrido.userinterface.EnterHonorariosDataPage.*;

public class EnterHonorariosData implements Task {
    private List<TransarData> transarData;

    public EnterHonorariosData(List<TransarData> transarData) {
        this.transarData =  transarData;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HONORARIOS_PAGE),
                Click.on(LIST_YEAR),
                Click.on(By.xpath("//li[contains(text(),"+transarData.get(0).getEjercicio()+")]")),
                Click.on(LIST_MONTH),
                Click.on(By.xpath("//li[contains(text(),"+transarData.get(0).getPeriodo()+")]")),
                Click.on(BUTTON_HONORARIOS)
        );
System.out.println("Hoola");
    }
    public static EnterHonorariosData onTheHonorariosPage(List<TransarData> transarData) {
        return Tasks.instrumented(EnterHonorariosData.class,transarData);
    }
}
