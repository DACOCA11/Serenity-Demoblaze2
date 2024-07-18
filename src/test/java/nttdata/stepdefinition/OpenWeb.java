package nttdata.stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;
import org.nttdata.tasks.OpenWebsite;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.nttdata.utils.Constants.TIME_SHORT;
import static org.nttdata.utils.Constants.TITLE;
import static org.nttdata.utils.Time.waiting;

public class OpenWeb {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} esta en la pagina demoblaze")
    public void openWebsite(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(OpenWebsite.browserURL()


        );

        waiting(TIME_SHORT);
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(TheWebPage.title(), Matchers.containsString(TITLE))

        );

    }
}
