package saucelabs;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DragAndDropSauce {
	
	WebDriver driver;
	
	@Test
	public void dragAnddrop() throws MalformedURLException{
		
		final String URL = "https://" + "RupaDebnath" + ":" + "d5ab3df7-043a-4922-8273-70ea31c9eaf1" + "@ondemand.saucelabs.com:443/wd/hub";
		 
	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability("platform", "Windows 10");
	    
	    driver = new RemoteWebDriver(new URL(URL), caps); 
		driver = new FirefoxDriver();
		driver.get("http://demoqa.com/droppable/");
		
		WebElement src=driver.findElement(By.id("draggableview"));
		WebElement des=driver.findElement(By.id("droppableview"));
		Actions act = new Actions(driver);
		
		act.dragAndDrop(src, des).build().perform();
		driver.quit();
	}

}
