package ReusableMethods;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;


public class TouchActionnn {
	
	
	public static void tap1(AppiumDriver<MobileElement> driver,WebElement locator){
		TouchAction touch=new TouchAction(driver);
		touch.tap(tapOptions().withElement(element(locator))).release().perform();		
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}
	
	
	public static void scrollVertical(AppiumDriver<MobileElement> driver) {
		Dimension size=driver.manage().window().getSize();
		int anchor=(int)(size.width*0.50);
		int startpoint=(int)(size.height*0.75);
		int endpoint=(int)(size.height*0.20);
		
		TouchAction touch=new TouchAction(driver);
		touch.press(point(anchor,startpoint)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(anchor,endpoint)).release().perform();
		
		
	}


}
