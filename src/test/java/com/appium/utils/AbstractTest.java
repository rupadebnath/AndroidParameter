//We initialize the elements of very first page in AbstractTest.

package com.appium.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.appium.pages.TOILandingPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.StartAndStopAppium;

public class AbstractTest{

	//public static AppiumDriver driver; //If you want to write code for cross platform use AppiumDriver.
	public static AndroidDriver driver;
	
	@BeforeClass
	public static void createEnvironment(){
		//DesiredCapabilities
		StartAndStopAppium.stopAppium();
		StartAndStopAppium.startAppium();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "ZY2222DCP6");
		capabilities.setCapability("appPackage",  "com.toi.reader.activities");
		capabilities.setCapability("appActivity", "com.toi.reader.activities.FragmentsContainerActivity");
		capabilities.setCapability("noReset",false);
		
		try {
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} 
		catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		PageFactory.initElements(new AppiumFieldDecorator(driver),new TOILandingPage());
        }
	
	@AfterClass
	
	public static void tearEnvironment(){
		driver.quit();
		StartAndStopAppium.stopAppium();
	}
}