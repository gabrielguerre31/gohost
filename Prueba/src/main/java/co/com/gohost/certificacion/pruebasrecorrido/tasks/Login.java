package co.com.gohost.certificacion.pruebasrecorrido.tasks;


import co.com.gohost.certificacion.pruebasrecorrido.models.TransarData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.gohost.certificacion.pruebasrecorrido.userinterface.TransarLoginPage.*;


public class Login implements Task {

    private List<TransarData> transarData;

    public Login(List<TransarData> transarData) {this.transarData =  transarData;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byValue(transarData.get(0).getTipoDoc()).from(INPUT_TIPO_DOCUMENTO),
                Enter.theValue(transarData.get(0).getUser()).into(INPUT_USER),
                Enter.theValue(transarData.get(0).getPassword()).into(INPUT_PASSWORD),
                Click.on(ENTER_BUTTON));
    }

    public static Login onThePage(List<TransarData> transarData) {
        return Tasks.instrumented(Login.class,transarData);
    }
}
