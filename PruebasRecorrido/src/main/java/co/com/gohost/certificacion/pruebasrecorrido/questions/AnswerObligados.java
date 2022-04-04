package co.com.gohost.certificacion.pruebasrecorrido.questions;

import co.com.gohost.certificacion.pruebasrecorrido.models.TransarData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.List;

import static co.com.gohost.certificacion.pruebasrecorrido.userinterface.EnterHonorariosDataPage.MENSAJE;


public class AnswerObligados implements Question<Boolean> {
    private List<TransarData> transarData;
    private String question;
    public AnswerObligados(List<TransarData> transarData){
        this.transarData =  transarData;
    }
    public static AnswerObligados toThe(List<TransarData> transarData) {return new AnswerObligados(transarData);}

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String mensajeObligados = Text.of(MENSAJE).viewedBy(actor).asString();
        question = transarData.get(0).getMensajeObligado();
        if (question.equals(mensajeObligados)){
            result = true;
        }else{
            result = false;
        }
        System.out.println(result);

        return result;
    }
}
