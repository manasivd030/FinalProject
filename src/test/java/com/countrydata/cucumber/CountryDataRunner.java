package com.countrydata.cucumber;

import org.junit.runner.RunWith;

import com.countrydata.testbase.TestBaseCountryData;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/")
public class CountryDataRunner extends TestBaseCountryData{

}
