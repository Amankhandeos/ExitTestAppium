package StepDefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import BaseClass.Base;
import Pages.AnimationPage;
import Pages.AccessibilityPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import logging.ManageLog4j;

public class AnimationStep extends Base{
	
	public AppiumDriver<MobileElement> driver;
	
	public AnimationStep(Base base) {
		this.driver=base.driver;
		
	}
	
	AnimationPage page=new AnimationPage(driver);

	
	@Given("Api Demos app is launched and animation option is visible")
	public void api_demos_app_is_launched() {
		AnimationPage page=new AnimationPage(driver);
		Assert.assertEquals(page.verify_Animation_actions(page.option_animation), "Animation");
		ManageLog4j.info("Assertion of animation option");
	}
	
	@When("User choose option named as Animation")
	public void user_choose_option_named_as_animation() {
		AnimationPage page=new AnimationPage(driver);
		page.tap_Options(page.option_animation);
		ManageLog4j.info("Successfully click on Animation option");

	}

	@Then("Default layout option appears")
	public void default_layout_option_appears() {
		AnimationPage page=new AnimationPage(driver);
		boolean actual=page.webele(page.option_defLayout).isDisplayed(); 
        Assert.assertTrue(actual);
        ManageLog4j.info("Assertion of Default layout option");
	}

	@When("User click on Default layout animation")
	public void user_click_on_default_layout_animation() {
		AnimationPage page=new AnimationPage(driver);
		page.tap_Options(page.option_defLayout);
		ManageLog4j.info("Successfully click on add button");
	}

	@When("User click on add button")
	public void user_click_on_add_button() {
		AnimationPage page=new AnimationPage(driver);
		page.tap_Options(page.button_add);
		ManageLog4j.info("Successfully click on Default layout animation");
	}

	@Then("User can see a button")
	public void user_can_see_a_button() {
		AnimationPage page=new AnimationPage(driver);
		boolean actual=page.webele(page.button_appear).isDisplayed();
        Assert.assertTrue(actual);
        ManageLog4j.info("Assertion of button is visible");
	}

}
