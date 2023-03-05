package StepDefinitions;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.Assert;

import BaseClass.Base;
import ConfigProperties.ExcelReader;
import Pages.appOptionPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import logging.ManageLog4j;

public class appOptionStep extends Base {
	public AppiumDriver<MobileElement> driver;
	public XSSFSheet data;
	
	public appOptionStep(Base base) {
		this.driver=base.driver;
	}
	
	appOptionPage page=new appOptionPage(driver);
	
	ExcelReader obj = new ExcelReader();		//excel reader object created													
	
	@When("User choose app")
	public void user_choose_app() {
		appOptionPage page=new appOptionPage(driver);
		page.tap_Options(page.option_app);
		Assert.assertTrue(page.webele(page.option_activity).isDisplayed());
		ManageLog4j.info("Succefully click on app option and Assertion of activity option");
	}

	@When("User choose activity")
	public void user_choose_activity() {
		appOptionPage page=new appOptionPage(driver);
		page.tap_Options(page.option_activity);
		Assert.assertTrue(page.webele(page.option_customTitle).isDisplayed());
		ManageLog4j.info("Succefully click on activity option and Assertion of custom title option");

	}

	@When("User choose custom title")
	public void user_choose_custom_title() {
		appOptionPage page=new appOptionPage(driver);
		page.tap_Options(page.option_customTitle);
		Assert.assertTrue(page.webele(page.textbox_leftEdit).isDisplayed());
		ManageLog4j.info("Succefully click on custom title option Assertion of textbox field");
	}

	@When("User fills form from excel sheet {string}")
	public void user_fills_form_from_excel_sheet(String sheetName) throws InvalidFormatException, IOException {
		appOptionPage page=new appOptionPage(driver);
		data = obj.ExcelData(sheetName);
		page.clear_textBox(page.textbox_leftEdit);
		ManageLog4j.info("Successfully clear the textbox");
	}

	@When("rownumber {int} and click on change left")
	public void rownumber_and_click_on_change_left(Integer rowNum) {
		appOptionPage page=new appOptionPage(driver);
		String textboxValue=obj.CellData(data,rowNum);
		page.fill_textBox(page.textbox_leftEdit,textboxValue);
		ManageLog4j.info("Successfully fill the textbox");
		page.tap_Options(page.button_leftEdit);
		ManageLog4j.info("Succefully click on change left button");
	}
	
	@Then("User can see changes on left top corner {int}")
	public void user_can_see_changes_on_left_top_corner(Integer rowNum) {
		appOptionPage page=new appOptionPage(driver);
		String expected=obj.CellData(data,rowNum);
		String actual=page.verify_App_actions(page.verify_leftText);
		Assert.assertEquals(actual,expected);
		ManageLog4j.info("Assertion of left top corner text");
	}
	



}
