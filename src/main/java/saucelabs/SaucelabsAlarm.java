//https://wiki.saucelabs.com/display/DOCS/Platform+Configurator#/
package saucelabs;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class SaucelabsAlarm {
	
	WebDriver driver;

	@Test
	public void testLoginFB() throws Exception{
		
	final String URL = "https://" + "RupaDebnath" + ":" + "d5ab3df7-043a-4922-8273-70ea31c9eaf1" + "@ondemand.saucelabs.com:443/wd/hub";	  
	DesiredCapabilities caps = DesiredCapabilities.android();
			
	caps.setCapability("appiumVersion", "1.4.16");
	caps.setCapability("platformName","Android");
	caps.setCapability("platformVersion","6.0");
	caps.setCapability("browserName", "Chrome");
    caps.setCapability("deviceName","Samsung Galaxy S6 Device");
	caps.setCapability("deviceOrientation", "portrait");
	caps.setCapability("appPackage",  "com.google.android.deskclock");
	caps.setCapability("appActivity", "com.android.deskclock.DeskClock");
    caps.setCapability("noReset",false);

    driver=new AndroidDriver(new URL(URL),caps); //Your account does not have access to Android devices.
    //driver = new RemoteWebDriver(new URL(URL), caps);
		  
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	Thread.sleep(2000);
	driver.findElement(By.className("android.widget.ImageView")).click();
	driver.findElement(By.id("com.android.deskclock:id/fab")).click();
    //driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.RadialTimePickerView$RadialPickerTouchHelper\").description(\"8\")").click();
	//driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.RadialTimePickerView$RadialPickerTouchHelper\").description(\"15\")").click();
	//driver.findElement(By.id("android:id/button1")).click();
	Thread.sleep(8000);
    driver.quit();
	  }
}
