package com.trust.cucumber.runnerClass;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src//test//resources//FeatureFiles//",
tags = "@test-demo,@FAQ",
glue = {"com.trust.cucumber.stepDefs"}, 
format = { "pretty", "html:target/cucumber",
				"json:target/cucumber-report.json" }
)

public class runnerClass  {}
