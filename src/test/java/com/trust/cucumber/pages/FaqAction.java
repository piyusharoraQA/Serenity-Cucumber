package com.trust.cucumber.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.findby.By;

public class FaqAction extends PageObject {

	public FaqAction(WebDriver driver) {
		super(driver);
	}

	public void clicks() {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		$("//li[text()='FAQ']").click();

	}

	public void verifyTitle() {

		Assert.assertEquals(getDriver().getCurrentUrl().toString(), "https://techcheck-stage2.cengage.com/faq");

	}

	public void verifySection() {

		$("(//button[@class='c53 c44 ExpandablePanel_expand_30zVT']//span[text()='expand_more'])[1]").click();
		Assert.assertEquals($("(//div[@class='Faq_answer_1PnRB'])[1]").isDisplayed(),true);
		// $("(//button[@class='c53 c44
		// ExpandablePanel_expand_30zVT']//span[text()='expand_more'])[2]").click();

	}

}
