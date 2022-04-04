package co.com.gohost.certificacion.pruebasrecorrido.tasks;

import co.com.gohost.certificacion.pruebasrecorrido.models.TransarData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.gohost.certificacion.pruebasrecorrido.userinterface.EnterInfoPagoDataPage.*;

import java.util.List;

public class EnterInfoPagoData implements Task {

    private List<TransarData> transarData;

    public EnterInfoPagoData(List<TransarData> transarData) {
        this.transarData =  transarData;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(PAGO_PAGE),
                Enter.theValue(transarData.get(0).getFormaPago()).into(FORMA_PAGO).thenHit(Keys.TAB),
                Enter.theValue(transarData.get(0).getObservaciones()).into(INPUT_OBSERVACIONES)

        );

    }
    public static EnterInfoPagoData onTheInfoPaggoPage(List<TransarData> transarData) {
        return Tasks.instrumented(EnterInfoPagoData.class,transarData);
    }


}
