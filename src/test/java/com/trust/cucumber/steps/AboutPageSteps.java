package com.trust.cucumber.steps;

import com.trust.cucumber.pages.AboutPage;
import com.trust.cucumber.pages.CommonFunc;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;


public class AboutPageSteps {
	
	
	AboutPage pa;
	
	@Step
	public void NavigatetoAboutpage() throws InterruptedException {
		pa.NavigatetoAboutpage();
	}

	@Step
	public void Createadescription() throws InterruptedException {
		pa.Createadescription();
	}

	@Step
	public void VerifyOnSplashPage() {
		pa.VerifyOnSplashPage();
	}
}
