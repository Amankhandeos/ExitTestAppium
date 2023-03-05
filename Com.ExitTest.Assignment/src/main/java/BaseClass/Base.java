package BaseClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import ConfigProperties.DeviceCapabData;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Base {
	public AppiumDriver<MobileElement> driver;
	private static DesiredCapabilities capabilties = new DesiredCapabilities();



	public void setAndroidCapabilities() {
		capabilties.setCapability("appium-version", DeviceCapabData.getCapabilities("appium-version"));
		capabilties.setCapability("platformName", DeviceCapabData.getCapabilities("platformName"));
		capabilties.setCapability("platformVersion", DeviceCapabData.getCapabilities("platformVersion"));
		capabilties.setCapability("appPackage", DeviceCapabData.getCapabilities("appPackage"));
		capabilties.setCapability("appActivity", DeviceCapabData.getCapabilities("appActivity"));
		capabilties.setCapability("deviceName", DeviceCapabData.getCapabilities("deviceName"));
		capabilties.setCapability("app", DeviceCapabData.getCapabilities("app"));
		capabilties.setCapability("isHeadless", Boolean.parseBoolean(DeviceCapabData.getCapabilities("headless")));
		capabilties.setCapability("avdArgs", "-no-window");
	}



	@SuppressWarnings({ "rawtypes", "unchecked" })
	public AppiumDriver<MobileElement> getAndroidDriver() throws MalformedURLException {
		try {
			driver = new AndroidDriver(new URL(DeviceCapabData.getCapabilities("appiumUrl")), capabilties);
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return driver;
	}
}

