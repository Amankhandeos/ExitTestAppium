package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import ReusableMethods.TouchActionnn;

public class AccessibilityPage{
	
	public AppiumDriver<MobileElement> driver;
	
	public By option_accessiblity=(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
	public By option_accessiblity_service=(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility Service\"]"));
    public By apis_button=(By.id("io.appium.android.apis:id/button"));
	
    public By verify_accessibility_options=(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));
    public By option_accessibilityShortcut=(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1]"));
    public By switch_allowFrom_lockScreen=(By.id("android:id/switch_widget"));
    
	public AccessibilityPage(AppiumDriver<MobileElement> driver) {
		this.driver=driver;	
	}
	
	
//----------------------------------Test3 (animation default layout)--------------------------------------------

	public String verify_ApiDemo_actions(By locator) {
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