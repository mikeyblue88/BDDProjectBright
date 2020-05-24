package org.example.StepDefinitionPackage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Homepage;

public class HomepageSteps {

    Homepage homepage = new Homepage();

    @Given("^user is on the homepage of the argos website$")
    public void user_is_on_the_homepage_of_the_argos_website() throws Throwable {
        homepage.homePageURL();
    }

    @When("^user wants to search for product$")
    public void user_wants_to_search_for_product() throws Throwable {
        homepage.doSearch("Nike");
    }

    @Then("^user should see all the relevant searched products\\.$")
    public void user_should_see_all_the_relevant_searched_products() throws Throwable {
        homepage.resultOfSearch();
    }

    @When("^user clicks on the account button$")
    public void userClicksOnTheAccountButton() {

        homepage.clickOnAccountButton();
    }
    @Then("^user should see the detail of account\\.$")
    public void userShouldSeeTheDetailOfAccount() {

        homepage.accountResult();
    }

    @When("^user tries to find multiple \"([^\"]*)\"$")
    public void userTriesToFindMultiple(String item) throws Throwable {
       homepage.doSearch(item);

    }
}
