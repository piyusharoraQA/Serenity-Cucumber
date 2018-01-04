package com.trust.cucumber.stepDefs;

import com.trust.cucumber.steps.AboutPageSteps;
import com.trust.cucumber.steps.CommonFuncSteps;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;

public class AboutPageCucumber {
	
	@Steps
	AboutPageSteps pa;

//	@Given("^User launche application$")
//	public void instantiate() {
//		cfs.launchapp();
//	}
//
//	@And("^Login with valid admi credentials$")
//	public void loginApp() {
//		cfs.login();
//	}

	@And("^Navigate to Abou page$")
	public void NavigatetoAbout() throws InterruptedException {
		pa.NavigatetoAboutpage();
	}
	@Then("^Create a description$")
	public void Createadescription() throws InterruptedException{
		pa.Createadescription();
	}

	@And("^Verify on Splash page$")
	public void VerifyOnSplashPage() {
		pa.VerifyOnSplashPage();
	}

}
