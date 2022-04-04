package co.com.gohost.certificacion.pruebasrecorrido.questions;

import co.com.gohost.certificacion.pruebasrecorrido.models.TransarData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.gohost.certificacion.pruebasrecorrido.userinterface.EnterHonorariosDataPage.MENSAJE;


public class AnswerNoDisponible implements Question<Boolean> {
    private List<TransarData> transarData;
    private String question;
    public AnswerNoDisponible(List<TransarData> transarData){
        this.transarData =  transarData;
    }
    public static AnswerNoDisponible toThe(List<TransarData> transarData) {return new AnswerNoDisponible(transarData);}

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String mensajeObligados = Text.of(MENSAJE).viewedBy(actor).asString();
        question = transarData.get(0).getMensajeNoDisponible();
        if (question.equals(mensajeObligados)){
            result = true;
        }else{
            result = false;
        }
        System.out.println(result);

        return result;
    }
}
