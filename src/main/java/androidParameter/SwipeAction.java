/*Install Drag Sort Demos(com.mobeta.android.demodslv-0.5.0-3_APKdot.com.apk) from

"http://www.software-testing-tutorials-automation.com/2015/11/test-apps-to-use-in-appium-automation.html"
Refer-http://appium.github.io/java-client/io/appium/java_client/TouchAction.html*/


package androidParameter;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class SwipeAction {
	
	@Test
	public void testLoginFB() throws Exception{
			
	DesiredCapabilities capabilities= new DesiredCapabilities();
				
	capabilities.setCapability("automationName", "Appium");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "6.0");
	capabilities.setCapability("deviceName", "ZY2222DCP6");
	//capabilities.setCapability("app", "C:\\Users\\Chutki\\Downloads\\com.mobeta.android.demodslv-0.5.0-3_APKdot.com.apk");
	capabilities.setCapability("appPackage",  "com.mobeta.android.demodslv");
	capabilities.setCapability("appActivity","Launcher");
	capabilities.setCapability("noReset",false);

	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.mobeta.android.demodslv:id/activity_title\").text(\"Warp\")").click();
	WebElement element=(WebElement) driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(0);
	new TouchAction((MobileDriver)driver).longPress(element).moveTo(71,245).release().perform(); //right to left
}
}