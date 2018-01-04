package com.trust.cucumber.stepDefs;

import com.trust.cucumber.steps.FaqSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class FaqCucumber {
	
	@Steps
	FaqSteps fs;
	
	@When("^User clicks on FAQ from admin menu$")
	public void clicks(){
		
		fs.clicks();
		
	}
	
	@Then("^Verify user lands on FAQ page$")
	public void verifyTitle(){
		fs.verifyTitle();
	}
	
	
	@Then("^Verify user is able to View created section on the FAQ Page$")
	public void verifySection(){
		fs.verifySection();
		
	}
	
	
	
	

}
