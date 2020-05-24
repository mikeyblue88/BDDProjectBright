package org.example.StepDefinitionPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.BaseClassPackage.DriverFactory;
import org.example.PageObjectPackage.SouthallTravel;


public class SouthallTravelSteps {
    SouthallTravel southallTravel = new SouthallTravel();

    @Given("^User is on homepage of Southall travel$")
    public void user_is_on_homepage_of_Southall_travel() throws Throwable {
        southallTravel.southallUrl(); }

    @When("^User selects the airport in depart from box$")
    public void user_selects_the_airport_in_depart_from_box() throws Throwable {
        southallTravel.departBox();
    }

    @When("^User selects the airport in Destination box$")
    public void user_selects_the_airport_in_Destination_box() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^User selects (\\d+)th May in departing calender$")
    public void user_selects_th_May_in_departing_calender(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^User selects (\\d+)th June in returning calender$")
    public void user_selects_th_June_in_returning_calender(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^User selects (\\d+) in adult box$")
    public void user_selects_in_adult_box(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^User selects Air India in Airline box$")
    public void user_selects_Air_India_in_Airline_box() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^User should be able to see result page$")
    public void user_should_be_able_to_see_result_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
