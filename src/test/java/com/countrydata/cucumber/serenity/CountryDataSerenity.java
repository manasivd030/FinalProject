package com.countrydata.cucumber.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasValue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class CountryDataSerenity {

	
	 @Step("Get the country")
	    public ValidatableResponse getCountryCode(String countrycode) {
		 return SerenityRest.rest().given()
			.when()
			.get("/name/"+countrycode)
			.then()
			.log()
			.all();
		
}
	 
	 @Step("Get the alpha code")
	    public ValidatableResponse getAlphaCode(String alphacode) {
		 return SerenityRest.rest().given()
			.when()
			.get("/alpha/"+alphacode)
			.then()
			.log()
			.all();
		
} 
	 
	 @Step("Get the alpha code")
	    public ValidatableResponse getCurrencyData(String currency) {
		 return SerenityRest.rest().given()
			.when()
			.get("/currency/"+currency)
			.then()
			.log()
			.all();
		
} 
	 
	 
}