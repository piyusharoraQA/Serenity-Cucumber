package com.trust.cucumber.steps;

import com.trust.cucumber.pages.CommonFunc;

import net.thucydides.core.annotations.Step;

public class CommonFuncSteps {
	
	CommonFunc cf;

	@Step
	public void launchapp() {
		cf.launchApplication();
	}

	@Step
	public void login() {
		cf.login();
	}

}
