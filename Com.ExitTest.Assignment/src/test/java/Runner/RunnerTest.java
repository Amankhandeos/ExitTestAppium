package Runner;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import logging.ManageLog4j;

@CucumberOptions(
		//path of feature file
		features = {"C:\\Users\\amankhan\\eclipse-workspace\\Com.ExitTest.Assignment\\src\\test\\java\\Features"},
		plugin={"pretty", 
				"json:target/cucumber-reports/cucumber.json",
				"html:target/cucumber-reports/cucumberreport.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		//path of step definition file
		glue = {"StepDefinitions"},
		dryRun=false,
		monochrome=true,
		tags="@test1 or @test2 or @test3 or @test4 or @test5"
		//tags="@test1"
		)

@Test
public class RunnerTest extends AbstractTestNGCucumberTests {
	static AppiumDriverLocalService service;
	
    @BeforeSuite
    public void startAppium() {
    	service=AppiumDriverLocalService.buildDefaultService();
    	service.start();
    	ManageLog4j.startTestCase("Appium_Test");
    }
    
    @AfterSuite
    public void stopAppium() {
    	service.stop();
    	ManageLog4j.endTestCase("Appium_Test");
    }
}
