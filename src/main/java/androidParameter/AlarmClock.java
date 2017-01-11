//Refer- https://developer.android.com/reference/android/support/test/uiautomator/UiSelector.html
package androidParameter;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class AlarmClock {
	
@Test
public void testLoginFB() throws Exception{
		
DesiredCapabilities capabilities= new DesiredCapabilities();
			
capabilities.setCapability("automationName", "Appium");
capabilities.setCapability("platformName", "Android");
capabilities.setCapability("platformVersion", "6.0");
capabilities.setCapability("deviceName", "ZY2222DCP6");
//capabilities.setCapability("app", "C:\\Users\\Chutki\\Downloads\\com.facebook.katana-97.0.0.18.69(40442177)-minAPI15.apk");
capabilities.setCapability("appPackage",  "com.google.android.deskclock");
capabilities.setCapability("appActivity", "com.android.deskclock.DeskClock");
capabilities.setCapability("noReset",false);

AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
Thread.sleep(2000);
driver.findElement(By.className("android.widget.ImageView")).click();
driver.findElement(By.id("com.android.deskclock:id/digital_clock")).click();

driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.RadialTimePickerView$RadialPickerTouchHelper\").description(\"8\")").click();
driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.RadialTimePickerView$RadialPickerTouchHelper\").description(\"15\")").click();
driver.findElement(By.id("android:id/button1")).click();

}}
