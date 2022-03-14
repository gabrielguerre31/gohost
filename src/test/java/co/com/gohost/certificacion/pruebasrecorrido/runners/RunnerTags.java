package co.com.gohost.certificacion.pruebasrecorrido.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/prueb.feature",
        tags = "@pruebasDeRecorrido",
        glue = "co.com.gohost.certificacion.pruebasrecorrido.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {

}