package co.com.gohost.certificacion.pruebasrecorrido.tasks;

import co.com.gohost.certificacion.pruebasrecorrido.models.TransarData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Upload;

import java.nio.file.Paths;
import java.util.List;

import static co.com.gohost.certificacion.pruebasrecorrido.userinterface.EnterAdjuntosDataPage.*;

public class EnterAdjuntosData implements Task {
    private List<TransarData> transarData;
    private String path = "src/test/resources/archivos/cedula.pdf";

    public EnterAdjuntosData(List<TransarData> transarData) {
        this.transarData =  transarData;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ADJUNTOS_PAGE),
                Upload.theFile(Paths.get(path)).to(ADJUNTAR_ARCHIVO),
                Enter.theValue(transarData.get(0).getTipoArchivo()).into(TIPO_ARCHIVO),
                Enter.theValue(transarData.get(0).getNombreArchivo()).into(NOMBRE_ARCHIVO),
                Click.on(AGREGAR),
                Upload.theFile(Paths.get(path)).to(ADJUNTAR_ARCHIVO),
                Enter.theValue(transarData.get(0).getTipoArchivoDos()).into(TIPO_ARCHIVO),
                Enter.theValue(transarData.get(0).getNombreArchivo()).into(NOMBRE_ARCHIVO),
                Click.on(AGREGAR),
                Click.on(ACEPTAR),
                Click.on(ENVIAR)
        );
        System.out.println("Hola");
    }
    public static EnterAdjuntosData onTheAdjuntosPage(List<TransarData> transarData) {
        return Tasks.instrumented(EnterAdjuntosData.class,transarData);
    }
}
