package StepDefinitions;

import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import BaseClass.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import logging.ManageLog4j;

public class Hooks extends Base {
	
	public Scenario scenario;
	static AppiumDriverLocalService service;
	private Base base;
	
	public Hooks(Base base) {
		this.base=base;
	}
	
	@After
	public void addScreenshot(Scenario scenario){
		//validate if scenario has failed
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) base.driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image"); 
		}		
	}
	
	@Before
	public void BeforeScenario(Scenario scenario) throws MalformedURLException{
		base.setAndroidCapabilities();
		base.driver=base.getAndroidDriver();
		ManageLog4j.info("ApiDemos app is installed successfully");
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		base.driver.removeApp("io.appium.android.apis");
		base.driver.quit();
		ManageLog4j.info("ApiDemos app is closed successfully");
	}

	

}
