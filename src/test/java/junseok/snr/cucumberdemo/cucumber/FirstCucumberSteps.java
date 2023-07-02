package junseok.snr.cucumberdemo.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstCucumberSteps {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ApplicationContext applicationContext;

    @Given("준비가 되어야 해.")
    public void abc() {
        assertThat(restTemplate).isNotNull();
        assertThat(applicationContext).isNotNull();
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
