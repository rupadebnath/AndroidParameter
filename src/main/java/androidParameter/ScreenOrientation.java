/*Install SwipeListView Demo(SwipeListView Demo_v1.13_apkpure.com.apk) from
Refer-
http://www.software-testing-tutorials-automation.com/2015/11/test-apps-to-use-in-appium-automation.html
https://developer.android.com/reference/android/support/test/uiautomator/UiSelector.html
http://appium.github.io/java-client/io/appium/java_client/TouchAction.html*/

package androidParameter;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class ScreenOrientation {
	
	@Test
	public void testLoginFB() throws Exception{
			
	DesiredCapabilities capabilities= new DesiredCapabilities();
				
	capabilities.setCapability("automationName", "Appium");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "6.0");
	capabilities.setCapability("deviceName", "ZY2222DCP6");
	//capabilities.setCapability("app", "C:\\Users\\Chutki\\Downloads\\SwipeListView Demo_v1.13_apkpure.com.apk");
	capabilities.setCapability("appPackage","com.fortysevendeg.android.swipelistview");
	capabilities.setCapability("appActivity","com.fortysevendeg.android.swipelistview.sample.activities.SwipeListViewExampleActivity");
	capabilities.setCapability("noReset",false);

	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
	//driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.CheckBox\").text(\"Don't show this message again\")").click();
	//driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/button1\").text(\"Ok\")").click();
	
	driver.rotate(org.openqa.selenium.ScreenOrientation.LANDSCAPE);
	System.out.println("*--*--*-- Now screen orientation Is : "+ driver.getOrientation());
	
	Thread.sleep(6000);
	new TouchAction((MobileDriver)driver).longPress(driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.fortysevendeg.android.swipelistview:id/example_row_tv_title\").text(\"Adobe Acrobat\")")).release().perform();
	
	driver.rotate(org.openqa.selenium.ScreenOrientation.PORTRAIT);
	System.out.println("*--*--*-- Now screen orientation Is : "+ driver.getOrientation());
	Thread.sleep(2000);
	}
	}