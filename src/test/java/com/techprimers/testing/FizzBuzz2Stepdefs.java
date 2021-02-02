package com.techprimers.testing;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
public class FizzBuzz2Stepdefs {

    FizzBuzz fizzBuzz;
    String result;

    @Given("^utworzoną grę FizzBuzz$")
    public void createAFizzBuzzGamePlay() throws Throwable {
        fizzBuzz = new FizzBuzz();
    }

    @When("^gracz wybierze (\\d+)$")
    public void iPlayWithNumber(int number) throws Throwable {
        result = fizzBuzz.play(number);
    }

    @Then("^wynikiem będzie \"([^\"]*)\"$")
    public void theResultIs(String resultString) throws Throwable {
        Assert.assertEquals(result, resultString);
    }
}
