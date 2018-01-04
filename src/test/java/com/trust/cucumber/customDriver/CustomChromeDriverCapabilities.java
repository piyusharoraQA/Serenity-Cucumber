//package com.trust.cucumber.customDriver;
//
//import org.jruby.RubyProcess.Sys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import net.thucydides.core.webdriver.DriverSource;
//
//public class CustomChromeDriverCapabilities implements DriverSource {
//
//	public WebDriver newDriver() {
//		System.setProperty("webdriver.chrome.driver", "src//test//resources//drivers//chromedriver.exe");
//		
//		return new ChromeDriver();
//	}
//
//	public boolean takesScreenshots() {
//		return true;
//	}
//
//}
