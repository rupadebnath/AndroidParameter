////https://wiki.saucelabs.com/display/DOCS/Platform+Configurator#/
package saucelabs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class GoogleVerSaucelabs {
	
	  public static final String USERNAME = "RupaDebnath";
	  public static final String ACCESS_KEY = "d5ab3df7-043a-4922-8273-70ea31c9eaf1";
	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	 
	   public static void main(String[] arg) throws Exception{
		   
		    DesiredCapabilities caps = DesiredCapabilities.chrome();
		    
		    //caps.setCapability("platform", "Windows 10");
		    caps.setCapability("platform", "Linux");
		    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
			//WebDriver driver= new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://google.com/");
			
			String Title =driver.getTitle();
			int TitleLn=driver.getTitle().length();
			
			System.out.println("Title " + Title);
			System.out.println("Length of title " + TitleLn);
			
			String CurrentUrl=driver.getCurrentUrl();
			int LnUrl=driver.getCurrentUrl().length();
			
			System.out.println("Current Url " + CurrentUrl);
			System.out.println("Length of current Url " + LnUrl);
			
			driver.navigate().refresh();
					
			driver.quit();
		}
	   
	   
}
