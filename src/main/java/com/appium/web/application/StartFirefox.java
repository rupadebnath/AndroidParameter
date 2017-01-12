package com.appium.web.application;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
 
public class StartFirefox
{
@Test
public void test1() throws MalformedURLException, Exception{

DesiredCapabilities capabilities=DesiredCapabilities.android();

capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.FIREFOX);
capabilities.setCapability(MobileCapabilityType.PLATFORM,Platform.ANDROID);
capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"ZY2222DCP6");
capabilities.setCapability(MobileCapabilityType.VERSION,"6.0");

capabilities.setCapability("appPackage", "org.mozilla.firefox");
//capabilities.setCapability("appActivity","App");
capabilities.setCapability("appActivity","org.mozilla.gecko.BrowserApp");

URL url= new URL("http://127.0.0.1:4723/wd/hub");
 
WebDriver driver = new AndroidDriver(url, capabilities);

driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

driver.get("http://www.facebook.com");
System.out.println("Title of url is"+driver.getTitle());

driver.findElement(By.name("email")).sendKeys("rupadebnath87@gmail.com");
driver.findElement(By.name("pass")).sendKeys("rupa_infosys");
//driver.findElement(By.id("u_0_6")).click();

driver.findElement(By.xpath("//android.widget.Button[@content-desc='Log In']")).click();;

Thread.sleep(4000);
//driver.quit();
 }
}