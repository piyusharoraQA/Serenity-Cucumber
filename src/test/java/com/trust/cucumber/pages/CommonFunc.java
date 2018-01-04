package com.trust.cucumber.pages;


import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.pages.PageObject;

public class CommonFunc extends PageObject{
	
	public CommonFunc(WebDriver driver) {
		super(driver);
	}
	
	public void launchApplication() {
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().get("https://techcheck-stage2.cengage.com/login");
	}

	public void login() {
		typeInto($("//input[@name='userName']"), "qauser");
		typeInto($("//input[@name='password']"), "Cengage1");
		clickOn($("(//span[text()='Sign In'])[2]"));
	}

}
