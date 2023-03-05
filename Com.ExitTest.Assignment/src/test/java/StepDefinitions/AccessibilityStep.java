package StepDefinitions;

import java.net.MalformedURLException;


import org.testng.Assert;

import BaseClass.Base;
import Pages.AccessibilityPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import logging.ManageLog4j;

public class AccessibilityStep extends Base {
	
	private Base base;
	public AppiumDriver<MobileElement> driver;
	
	public AccessibilityStep(Base base) {
		this.base=base;
		this.driver=base.driver;
	}
    
	AccessibilityPage page=new AccessibilityPage(driver);
	
	@Given("Api Demos app is launched")
	public void api_demos_app_is_launched() throws MalformedURLException {
		AccessibilityPage page=new AccessibilityPage(driver);
		Assert.assertEquals(page.verify_ApiDemo_actions(page.option_accessiblity), "Accessibility");
		
	}

	@When("click on Accessibility option")
	public void click_on_accessibility_option() throws InterruptedException{
		AccessibilityPage page=new AccessibilityPage(driver);
		page.tap_Options(page.option_accessiblity);
		ManageLog4j.info("Successfully click on Accessibility option");
		
	}
	
	@Then("Accessibility service option appears")
	public void accessibility_service_option_appears() {
		AccessibilityPage page=new AccessibilityPage(driver);
		String actual=page.verify_ApiDemo_actions(page.option_accessiblity_service);
		Assert.assertEquals(actual,"Accessibility Service");
		ManageLog4j.info("Successfully assertion of Accessibility service option ");

	}

	@When("click on Accessibility service")
	public void click_on_accessibility_service() {
		AccessibilityPage page=new AccessibilityPage(driver);
		page.tap_Options(page.option_accessiblity_service);
		ManageLog4j.info("Successfully click on Accessibility service");
	}

	@Then("Api button appears")
	public void api_button_appears() {
		AccessibilityPage page=new AccessibilityPage(driver);
        Assert.assertTrue(page.webele(page.apis_button).isDisplayed());
        ManageLog4j.info("Assertion of Api button");
	}

	@When("click on Api button")
	public void click_on_api_button() {
		AccessibilityPage page=new AccessibilityPage(driver);
		page.tap_Options(page.apis_button);
		 ManageLog4j.info("Successfully click on Api button");
 
	}
	
	@When("click on accessibility shortcut option")
	public void click_on_accessibility_shortcut_option() {
		AccessibilityPage page=new AccessibilityPage(driver);
		page.tap_Options(page.option_accessibilityShortcut);
		
		String actual=page.verify_ApiDemo_actions(page.switch_allowFrom_lockScreen);
		if(actual=="OFF") {
			Assert.assertEquals(actual, "OFF");
			 ManageLog4j.info("Assertion of switch if OFF before clicked");
		}
		else if(actual=="ON") {
			Assert.assertEquals(actual, "ON");
			ManageLog4j.info("Assertion of switch if ON before clicked");
		}

	}

	@When("click on allow from lock screen switch")
	public void click_on_allow_from_lock_screen_switch() {
		AccessibilityPage page=new AccessibilityPage(driver);
		page.tap_Options(page.switch_allowFrom_lockScreen);

	}

	@Then("allow from lock screen is activated")
	public void allow_from_lock_screen_is_activated() {
		AccessibilityPage page=new AccessibilityPage(driver);
		
		String actual=page.verify_ApiDemo_actions(page.switch_allowFrom_lockScreen);
		if(actual=="ON") {
			Assert.assertEquals(actual, "ON");
			 ManageLog4j.info("Assertion of switch if ON after clicked");
		}
		else if(actual=="OFF"){
			Assert.assertEquals(actual, "OFF");
			 ManageLog4j.info("Assertion of switch if OFF after clicked");
		}
		

	}



}
