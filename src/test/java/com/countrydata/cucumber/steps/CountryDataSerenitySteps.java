package com.countrydata.cucumber.steps;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.countrydata.cucumber.serenity.CountryDataSerenity;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.rest.interactions.Ensure;

public class CountryDataSerenitySteps { 
     String country = ""; 
     String alphacode = null;

	@Steps
	CountryDataSerenity steps;

	@When("^I make a request to get the country (.*) alphacode (.*)$")
	public void getTheCountryData(String country, String alphacode)
	{
		    steps.getCountryCode(country);
		    steps.getAlphaCode(alphacode);
	}


	@Then("^the status code should be (.*)$")
	public void verifyTheStatusCode(int statusCode) {
		
		SerenityRest.then().statusCode(statusCode);
		
		}
	
	@Then("^the country should be (.*)$")
	public void getTheExpectedCountry(String expectedCountry)
	{
		Ensure.that("Response contains the expected country name and alphacode",
		response -> response.extract().body().asString().contains(expectedCountry));
		System.out.print(expectedCountry);

		
	}
	
	@When("^I make a request to get the currency (.*)$")
	public void getCurrencyData(String currency)
	{
		    steps.getCurrencyData(currency);
		    
	}
	
	@Then("^the calling code should be callingcode (.*)$")
	public void getTheCallingCode(String expectedcallingcode)
	{
		Ensure.that("Response contains the expected calling code",
		response -> response.extract().body().asString().contains(expectedcallingcode));
		System.out.print(expectedcallingcode);

		
	}
	
	
}