package androidParameter;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Parameterize {
	@Test
	public void testLoginFB() throws Exception{
			
	DesiredCapabilities capabilities= new DesiredCapabilities();
				
	capabilities.setCapability("automationName", "Appium");
	//capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformName", System.getProperty("PlatformName"));
	//capabilities.setCapability("platformVersion", "6.0");
	capabilities.setCapability("platformVersion", System.getProperty("PlatformVersion"));
	capabilities.setCapability("deviceName", "ZY2222DCP6");
	capabilities.setCapability("appPackage",  "com.the511plus.MultiTouchTester");
	capabilities.setCapability("appActivity","MultiTouchTester");
	capabilities.setCapability("noReset",false);

	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
	TouchAction action1=new TouchAction((MobileDriver)driver).longPress(71,245).release().waitAction(1500);
	TouchAction action2=new TouchAction((MobileDriver)driver).longPress(114,363).release().waitAction(1500);
	
	new MultiTouchAction((MobileDriver)driver).add(action1).add(action2).perform();
}
}
