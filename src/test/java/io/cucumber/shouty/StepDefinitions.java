package io.cucumber.shouty;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    @Given("Lucy is located {int} metres from Sean")
    public void lucyIsLocatedMetresFromSean(int arg0) {
    }

    @When("Sean shouts {string}")
    public void seanShouts(String arg0) {
    }

    @Then("Lucy hears Sean's message")
    public void lucyHearsSeanSMessage() {
    }
}
