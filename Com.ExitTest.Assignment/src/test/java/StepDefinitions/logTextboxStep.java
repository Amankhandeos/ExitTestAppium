package StepDefinitions;

import org.testng.Assert;

import BaseClass.Base;
import Pages.AnimationPage;
import Pages.LogTextBoxPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import logging.ManageLog4j;

public class logTextboxStep extends Base {
	public AppiumDriver<MobileElement> driver;
	
	public logTextboxStep(Base base) {
		this.driver=base.driver;
	}
	
	LogTextBoxPage page=new LogTextBoxPage(driver);

	@When("User choose option named as Text")
	public void user_choose_option_named_as_text() {
		LogTextBoxPage page=new LogTextBoxPage(driver);
		page.tap_Options(page.option_text);
		ManageLog4j.info("Succefully click on Text option");
		
		Assert.assertTrue(page.webele(page.option_logTextbox).isDisplayed());
		ManageLog4j.info("Assertion of LogTextbox option");
	}

	@When("User click on LogTextbox option")
	public void user_click_on_log_textbox_option() {
		LogTextBoxPage page=new LogTextBoxPage(driver);
		page.tap_Options(page.option_logTextbox);
		Assert.assertTrue(page.webele(page.button_add1).isDisplayed());
		ManageLog4j.info("Assertion of add button");
	}
	
	@When("User clicked add button")
	public void user_clicked_add_button() {
		LogTextBoxPage page=new LogTextBoxPage(driver);
		page.tap_Options(page.button_add1);
		ManageLog4j.info("Succefully click on add button");
	}

	@Then("User can see line added in box")
	public void user_can_see_line_added_in_box() {
		LogTextBoxPage page=new LogTextBoxPage(driver);
		String actual=page.verify_LogText_actions(page.check_text);
		Assert.assertEquals(actual, "This is a test\n");
		ManageLog4j.info("Assertion of line added in text successfully");
	}


}
