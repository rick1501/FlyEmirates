package fly.emirates.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fly.emirates.model.Emiratesmodel;
import fly.emirates.task.Buscarvuelos;
import fly.emirates.task.Opcionesvuelos;
import fly.emirates.task.OpenUp;
import fly.emirates.task.Pasajeros;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class EmiratesStepdefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than gabriel go directly to the page he will try to find an available flight for your trip$")
    public void thanGabrielGoDirectlyToThePageHeWillTryToFindAnAvailableFlightForYourTrip(List<Emiratesmodel> emiratesmodels)  {
        OnStage.theActorCalled("chepe").wasAbleTo(OpenUp.thePage(emiratesmodels));






    }

    @When("^he enters the destination and departure information of his trip, it will show him available options\\.$")
    public void heEntersTheDestinationAndDepartureInformationOfHisTripItWillShowHimAvailableOptions()  {
        OnStage.theActorCalled("chepe").wasAbleTo(Buscarvuelos.thepage());
        OnStage.theActorCalled("chepe").wasAbleTo(Pasajeros.thepage());
        OnStage.theActorCalled("chepe").wasAbleTo(Opcionesvuelos.thepage());


    }

    @Then("^if there is a ticket available for his trip gabriel can select it$")
    public void ifThereIsATicketAvailableForHisTripGabrielCanSelectIt(String question) {



    }

}
