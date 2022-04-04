package co.com.gohost.certificacion.pruebasrecorrido.runners;



import co.com.gohost.certificacion.pruebasrecorrido.utils.BeforeSuite;
import co.com.gohost.certificacion.pruebasrecorrido.utils.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(features="src/test/resources/features/prueb.feature",
        tags = "@pruebasDeRecorrido",
        glue="co.com.gohost.certificacion.pruebasrecorrido.stepdefinitions",
        snippets= SnippetType.CAMELCASE)
@RunWith(RunnerPersonalizado.class)

public class RunnerTags {
    private RunnerTags() {
    }

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/prueb.feature");
    }
}
