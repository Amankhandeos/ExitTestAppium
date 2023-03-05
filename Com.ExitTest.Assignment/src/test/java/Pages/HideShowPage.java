package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ReusableMethods.TouchActionnn;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HideShowPage {
	
	public By option_hideShow=(By.xpath("//android.widget.TextView[@content-desc=\"Hide-Show Animations\"]"));
	public By button_zero=(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]"));
	public By button_show=(By.id("io.appium.android.apis:id/addNewButton"));
	
	
	public AppiumDriver<MobileElement> driver;
	
	public HideShowPage(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
	}
	
	public String verify_HideShow_actions(By locator) {	
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
