//Contact App in Android

package androidParameter;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;

public class DriverSwipe {
	
	@Test
	public void testLoginFB() throws Exception{
			
	DesiredCapabilities capabilities= new DesiredCapabilities();
				
	capabilities.setCapability("automationName", "Appium");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "6.0");
	capabilities.setCapability("deviceName", "ZY2222DCP6");
	capabilities.setCapability("appPackage",  "com.android.contacts"); //Contacts App(Android build in App)
	capabilities.setCapability("appActivity","ContactShortcut");
	capabilities.setCapability("noReset",false);

	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	Thread.sleep(6000);
	
	//Bottom to top
	driver.swipe(350,973, 296,382,3000);
	
	
	}}