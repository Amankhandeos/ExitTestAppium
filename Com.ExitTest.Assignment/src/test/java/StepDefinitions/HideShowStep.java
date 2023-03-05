package StepDefinitions;

import org.testng.Assert;

import BaseClass.Base;
import Pages.HideShowPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import logging.ManageLog4j;

public class HideShowStep extends Base{
	
	public AppiumDriver<MobileElement> driver;
	public Base base;
	
	public HideShowStep(Base base) {
		this.driver=base.driver;
		
	}
	
	HideShowPage page=new HideShowPage(driver);
	
	@Then("Hide-show animation option appears")
	public void hide_show_animation_option_appears() {
		HideShowPage page=new HideShowPage(driver);
		Assert.assertTrue(page.webele(page.option_hideShow).isDisplayed());
		ManageLog4j.info("Assertion of Hide-show option");
	}

	@When("User click on Hide-show option")
	public void user_click_on_hide_show_option() {
		HideShowPage page=new HideShowPage(driver);
		page.tap_Options(page.option_hideShow);
		ManageLog4j.info("Succefully click on Hide-show option");
	}

	@Then("button zero is visible")
	public void button_zero_is_visible() {
		HideShowPage page=new HideShowPage(driver);
		String actual=page.verify_HideShow_actions(page.button_zero);
		Assert.assertEquals(actual, "0");
		ManageLog4j.info("Assertion of zero button visibility before clicking on zero button");


	}

	@When("Click on zero button")
	public void click_on_zero_button() {
		HideShowPage page=new HideShowPage(driver);
	   page.tap_Options(page.button_zero);
	   ManageLog4j.info("Succefully click on zero button");
	}

	@Then("zero button hide")
	public void zero_button_hide() {
		HideShowPage page=new HideShowPage(driver);
		String actual=page.verify_HideShow_actions(page.button_zero);
		Assert.assertEquals(actual, "1");
		ManageLog4j.info("Assertion of zero button hide after click on it zero button");
	    
	}

	@When("click on show button")
	public void click_on_show_button() {
		HideShowPage page=new HideShowPage(driver);
		page.tap_Options(page.button_show);
		 ManageLog4j.info("Succefully click on show button");

	}

	@Then("zero button is visible")
	public void zero_button_is_visible() {
		HideShowPage page=new HideShowPage(driver);
		String actual=page.verify_HideShow_actions(page.button_zero);
		Assert.assertEquals(actual, "0");
		ManageLog4j.info("Assertion of zero button visible");


	}

}
