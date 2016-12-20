//Refer- https://developer.android.com/reference/android/support/test/uiautomator/UiSelector.html
package androidParameter;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class FacebookLoginTest {

@Test
public void testLoginFB() throws Exception{
		
DesiredCapabilities capabilities= new DesiredCapabilities();
			
capabilities.setCapability("automationName", "Appium");
capabilities.setCapability("platformName", "Android");
capabilities.setCapability("platformVersion", "6.0");
capabilities.setCapability("deviceName", "ZY2222DCP6");
//capabilities.setCapability("app", "C:\\Users\\Chutki\\Downloads\\com.facebook.katana-97.0.0.18.69(40442177)-minAPI15.apk");
capabilities.setCapability("appPackage",  "com.facebook.katana");
capabilities.setCapability("appActivity","LoginActivity");
capabilities.setCapability("appActivity","LoginActivity");
capabilities.setCapability("noReset",false);

AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
Thread.sleep(6000);

driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/login_username\")").sendKeys("rupadebnath87@gmail.com");

driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/login_password\")").click();

driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/login_password\")").sendKeys("rupa_infosys");

driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/login_login\").text(\"LOG IN\")").click();

driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.android.packageinstaller:id/permission_allow_button\").text(\"Allow\")").click();
Thread.sleep(2000);
driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/bookmarks_tab\").description(\"More\")").click();

Thread.sleep(2000);

driver.scrollTo("Log Out").click();

driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/button1\").text(\"Log Out\")").click();
}}
