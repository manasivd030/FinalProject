package com.countrydata.testbase;

import org.junit.BeforeClass;

import io.restassured.RestAssured;

public class TestBaseCountryData {
	@BeforeClass
	public static void init()
	{
		RestAssured.baseURI = "https://restcountries.com/v3.1/";
		
	}

}
