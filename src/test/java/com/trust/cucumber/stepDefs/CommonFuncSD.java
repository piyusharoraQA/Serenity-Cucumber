package com.trust.cucumber.stepDefs;

import com.trust.cucumber.steps.CommonFuncSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class CommonFuncSD {
	
	@Steps
	CommonFuncSteps cfs;

	@Given("^User launches application$")
	public void instantiate() {
		cfs.launchapp();
	}

	@And("^Login with valid admin credentials$")
	public void loginApp() {
		cfs.login();
	}

}
