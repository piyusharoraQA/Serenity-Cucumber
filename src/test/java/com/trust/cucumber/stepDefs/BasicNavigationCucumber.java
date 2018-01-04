package com.trust.cucumber.stepDefs;

import com.trust.cucumber.steps.BasicNavigatioSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BasicNavigationCucumber {
	
	@Steps 
	BasicNavigatioSteps stp;
	
	@Given("^User is on splash page$")
	public void navigateToSpashPage(){
		
		stp.navigateToSpashPage();
		
	}
	@And("^Navigate to pages$")
	public void naigateTo() throws InterruptedException{
		stp.navigateTo();
		
	}
	
	@And("^Navigate to notifications$")
	public void navigateToNotification() throws InterruptedException{
		stp.navigateToNotification();
	}
	
	@When("^Clicks new notification$")
	public void clicks() throws InterruptedException{
		
		stp.clicks();
		Thread.sleep(5000);
	}
	
}
