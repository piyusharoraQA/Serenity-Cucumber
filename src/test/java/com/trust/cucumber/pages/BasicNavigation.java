package com.trust.cucumber.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;

public class BasicNavigation extends PageObject {
	public BasicNavigation(WebDriver driver){
		super(driver);
	}
	
	public void navigateToSpashPage() {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		$("//button[@alt='Home button']").click();
	}
	
	public void navigateTo() throws InterruptedException{
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		$("//li[text()='Notifications']").click();
		Thread.sleep(3000);
		$("//li[text()='Systems']").click();
		Thread.sleep(3000);
//		$("//li[text()='User Management']").click();
//		Thread.sleep(3000);
//		$("//li[text()='Manage Roles']").click();
//		Thread.sleep(3000);
//		$("//li[text()='Regions']").click();
//		Thread.sleep(3000);
//		$("//li[text()='Change logs']").click();
//		Thread.sleep(3000);
//		$("//li[text()='About']").click();
//		Thread.sleep(3000);
//		$("//li[text()='FAQ']").click();
//		Thread.sleep(3000);
		
		
	}
	
	public void navigateToNotification() throws InterruptedException {
		Thread.sleep(5000);
		$("//li[text()='Notifications']").click();
		
	}

	public void clicks() throws InterruptedException {
		Thread.sleep(5000);
		$("//span[text()='New Notification']").click();
		
	}

	
}
