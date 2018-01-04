package com.trust.cucumber.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import net.thucydides.core.pages.PageObject;


public class AboutPage extends PageObject {
	
	public AboutPage(WebDriver driver){
		super(driver);
	}

	public void NavigatetoAboutpage() throws InterruptedException  {
		getDriver().get("https://techcheck-stage2.cengage.com/");
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clickOn($("//li[text()='About']"));
	}

	public void Createadescription() throws InterruptedException {
		$("//span[contains(text(),'edit')]").click();
		$(".public-DraftStyleDefault-block.public-DraftStyleDefault-ltr").click();
		Thread.sleep(5000);
//		typeInto($("//div[@class='DraftEditor-root']"), "Testing Purpose");
//		System.out.println(getDriver().findElement(By.xpath("//div[@class='DraftEditor-root']")).isEnabled());
		JavascriptExecutor js=(JavascriptExecutor)getDriver();
		js.executeScript("document.querySelector('.public-DraftStyleDefault-block.public-DraftStyleDefault-ltr span span').innerHTML='ajit'");
//		var x=$('.public-DraftStyleDefault-block.public-DraftStyleDefault-ltr span');
//		x.chidren[0].remove();
//		var y=document.createElement('span')
//		y.setAttribute('data-text',true);
//		y.innerHTML="ajit"
//		x.appendChild(y)
		$("//span[contains(text(),'save')]").click();
	}

	public void VerifyOnSplashPage() {
		$("//span[contains(text(),'home')]").click();
		$("//span[contains(text(),'Techcheck')]").click();
		$("//span[contains(text(),'testing purpose')]").getAttribute(null);
	}
	

}
