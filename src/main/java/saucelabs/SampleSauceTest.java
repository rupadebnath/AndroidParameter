//https://wiki.saucelabs.com/display/DOCS/Platform+Configurator#/
package saucelabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
 
public class SampleSauceTest {
	
 WebDriver driver;
	
  @Test
  public void brow() throws MalformedURLException{
  final String USERNAME = "RupaDebnath";
  final String ACCESS_KEY = "d5ab3df7-043a-4922-8273-70ea31c9eaf1";
  final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
 
    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Windows 10");
    driver = new RemoteWebDriver(new URL(URL), caps); 
    driver.get("https://saucelabs.com/test/guinea-pig");
    System.out.println("title of page is: " + driver.getTitle());
 
    driver.quit();
  }
  }