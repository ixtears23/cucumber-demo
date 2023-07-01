package junseok.snr.cucumberdemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstCucumberSteps {

    @Given("준비가 되어야 해.")
    public void abc() {
        System.out.println(">>>>> GIVEN!!!!");
    }

    @When("상황 발생!!")
    public void def() {
        System.out.println(">>>>> WHEN!!!!");
    }

    @Then("결과는 이렇구먼~")
    public void gdex() {
        System.out.println(">>>>> THEN!!!!");
    }
}
