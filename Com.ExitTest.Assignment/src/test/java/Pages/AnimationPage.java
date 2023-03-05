package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ReusableMethods.TouchActionnn;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AnimationPage {
	
	public AppiumDriver<MobileElement> driver;
	
	public By option_animation=(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]"));
    public By option_defLayout=(By.xpath("//android.widget.TextView[@content-desc=\"Default Layout Animations\"]"));
	public By button_add=(By.id("io.appium.android.apis:id/addNewButton"));
	public By button_appear=(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.GridLayout/android.widget.Button"));
    
	public AnimationPage(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
	}
	
	public String verify_Animation_actions(By locator) {	
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		return driver.findElement(locator).getText();
	}
	
	public void tap_Options(By locator) {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		WebElement ele=driver.findElement(locator);
		TouchActionnn.tap1(driver, ele);
	
	}
	
	public  WebElement webele(By locator) {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		return driver.findElement(locator);
	}
	
	


}
