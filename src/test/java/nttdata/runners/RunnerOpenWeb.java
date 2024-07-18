package nttdata.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/webTest.feature",
        glue = "nttdata.stepdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@succesful"


)

public class RunnerOpenWeb {


}
