package org.example.StepDefinitionPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Filterpage;
import org.example.PageObjectPackage.Resultpage;

public class FilterpageSteps {

    Filterpage filterpage = new Filterpage();
    Resultpage resultpage = new Resultpage();

    @Given("^user is on the result page of running filter$")
    public void user_is_on_the_result_page_of_running_filter() throws Throwable {
        resultpage.resultPageReturn();
    }

    @When("^user clicks on one of the products$")
    public void user_clicks_on_one_of_the_products() throws Throwable {
    filterpage.clickProduct();
    filterpage.addToTrolley();
    Thread.sleep(5000);
    filterpage.confirmTrolley();

    }

    @Then("^user should be able to see that product to add in basket$")
    public void user_should_be_able_to_see_that_product_to_add_in_basket() throws Throwable {
    filterpage.basket();
    }
}
