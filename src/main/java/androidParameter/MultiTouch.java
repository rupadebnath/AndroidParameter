/*Install MultiTouch Tester(com.the511plus.MultiTouchTester.apk) from
Refer-
http://www.software-testing-tutorials-automation.com/2015/11/test-apps-to-use-in-appium-automation.html"
http://appium.github.io/java-client/io/appium/java_client/MultiTouchAction.html
http://appium.github.io/java-client/io/appium/java_client/TouchAction.html
https://developer.android.com/reference/android/support/test/uiautomator/UiSelector.html*/

package androidParameter;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MultiTouch {
	
	@Test
	public void testLoginFB() throws Exception{
			
	DesiredCapabilities capabilities= new DesiredCapabilities();
				
	capabilities.setCapability("automationName", "Appium");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "6.0");
	capabilities.setCapability("deviceName", "ZY2222DCP6");
	//capabilities.setCapability("app", "C:\\Users\\Chutki\\Downloads\\com.the511plus.MultiTouchTester.apk");
	capabilities.setCapability("appPackage",  "com.the511plus.MultiTouchTester");
	capabilities.setCapability("appActivity","MultiTouchTester");
	capabilities.setCapability("noReset",false);

	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
	TouchAction action1=new TouchAction((MobileDriver)driver).longPress(71,245).release().waitAction(1500);
	TouchAction action2=new TouchAction((MobileDriver)driver).longPress(114,363).release().waitAction(1500);
	
	new MultiTouchAction((MobileDriver)driver).add(action1).add(action2).perform();
	}}