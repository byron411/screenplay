package co.com.choucair.certification.proyectobase.stepdefinitions;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public  void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Bryan wants to learn automation at the academy Choucair$")
    public void thanBryanWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Bryan").wasAbleTo(OpenUp.thePage(), (Login.OnThePage()));
    }


    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he finds the course called resources Recuros Automatización Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecurosAutomatizacionBancolombia() {

    }

}
