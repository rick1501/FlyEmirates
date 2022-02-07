package fly.emirates.runner;



import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/Emirates.feature",
        tags = "@stories",
        glue = "fly.emirates.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
