package com.trust.cucumber.steps;

import com.trust.cucumber.pages.BasicNavigation;

public class BasicNavigatioSteps {

	BasicNavigation bn;

	public void navigateToSpashPage() {
		bn.navigateToSpashPage();
	}

	public void navigateTo() throws InterruptedException {
		bn.navigateTo();

	}

	public void navigateToNotification() throws InterruptedException {
		bn.navigateToNotification();

	}

	public void clicks() throws InterruptedException {
		bn.clicks();

	}

}
