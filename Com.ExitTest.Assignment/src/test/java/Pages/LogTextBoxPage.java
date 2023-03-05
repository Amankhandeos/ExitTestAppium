package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ReusableMethods.TouchActionnn;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LogTextBoxPage {
	
	public AppiumDriver<MobileElement> driver;
	
	public By option_text=(By.xpath("//android.widget.TextView[@content-desc=\"Text\"]"));
	public By option_logTextbox=(By.xpath("//android.widget.TextView[@content-desc=\"LogTextBox\"]"));
	public By button_add1=(By.id("io.appium.android.apis:id/add"));
	public By check_text=(By.id("io.appium.android.apis:id/text"));
    
    public LogTextBoxPage(AppiumDriver<MobileElement> driver) {
    	this.driver=driver;
    }
    
	public String verify_LogText_actions(By locator) {	
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
}
