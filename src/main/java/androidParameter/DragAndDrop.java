/*Install Drag Sort Demos(com.mobeta.android.demodslv-0.5.0-3_APKdot.com.apk) from
Refer-
http://www.software-testing-tutorials-automation.com/2015/11/test-apps-to-use-in-appium-automation.html
http://appium.github.io/java-client/io/appium/java_client/TouchAction.html
https://developer.android.com/reference/android/support/test/uiautomator/UiSelector.html*/

package androidParameter;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import utility.StartAndStopAppium;

public class DragAndDrop {
	
	AndroidDriver driver;
	
	@Test
	public void testLoginFB() throws Exception{
		
	StartAndStopAppium.stopAppium();
		
	StartAndStopAppium.startAppium();
			
	DesiredCapabilities capabilities= new DesiredCapabilities();
				
	capabilities.setCapability("automationName", "Appium");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "6.0");
	capabilities.setCapability("deviceName", "ZY2222DCP6");
	//capabilities.setCapability("app", "C:\\Users\\Chutki\\Downloads\\com.mobeta.android.demodslv-0.5.0-3_APKdot.com.apk");
	capabilities.setCapability("appPackage",  "com.mobeta.android.demodslv");
	capabilities.setCapability("appActivity","Launcher");
	capabilities.setCapability("noReset",false);

	driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.mobeta.android.demodslv:id/activity_title\").text(\"Warp\")").click();
	//WebElement element1=driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(0);
	//WebElement element2=driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(3);
	WebElement element1=(WebElement) driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(0);
    WebElement element2=(WebElement) driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(3);
	new TouchAction((MobileDriver)driver).longPress(element1).moveTo(element2).release().perform();
	Thread.sleep(2000);
	}
	
	@AfterMethod
	public void close(){
	driver.quit();
	StartAndStopAppium.stopAppium();
}
}
