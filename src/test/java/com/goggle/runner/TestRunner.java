package com.goggle.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "Features",
		glue = "com.google.steps"
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
