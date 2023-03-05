package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ReusableMethods.TouchActionnn;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class appOptionPage {
	
	public AppiumDriver<MobileElement> driver;
	
	public appOptionPage(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
	}
	
	public By option_app=(By.xpath("//android.widget.TextView[@content-desc=\"App\"]"));
	public By option_activity=(By.xpath("//android.widget.TextView[@content-desc=\"Activity\"]"));
	public By option_customTitle=(By.xpath("//android.widget.TextView[@content-desc=\"Custom Title\"]"));
	public By textbox_leftEdit=(By.id("io.appium.android.apis:id/left_text_edit"));
	public By button_leftEdit=(By.id("io.appium.android.apis:id/left_text_button"));
	public By verify_leftText=(By.id("io.appium.android.apis:id/left_text"));
	
	
	
	public String verify_App_actions(By locator) {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		return driver.findElement(locator).getText();
	}
	
	public void tap_Options(By locator) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele=driver.findElement(locator);
		TouchActionnn.tap1(driver, ele);
	
	}
	
	public  WebElement webele(By locator) {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		return driver.findElement(locator);
	}

	public void fill_textBox(By locator,String value) {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.findElement(locator).sendKeys(value);
	}

	public void clear_textBox(By locator) {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		WebElement ele=driver.findElement(locator);
		ele.clear();
		
	}

}
