package com.appium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.appium.utils.AbstractPage;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import com.appium.pages.PushNotificationPage;;

public class SettingsPage extends AbstractPage{
	
	@FindBy(id="com.toi.reader.activities:id/tv_settings_help")
	private static WebElement help;
	
	@FindBy(id="com.toi.reader.activities:id/tv_settings_aboutus")
	private static WebElement aboutus;
	
	@FindBy(id="com.toi.reader.activities:id/tv_settings_push_notification")
	private static WebElement PushNotification;
	
	@FindBy(xpath="//android.widget.ImageButton[@content-desc='Navigate up']")
	private static WebElement backBtn;	
	
	public static void clickHelp(){
	help.click();
	}
	
	public static void clickAboutus(){
	aboutus.click();
	}
	
	public static void clickBackBtn(){
	backBtn.click();
	PageFactory.initElements(new AppiumFieldDecorator(driver),new TOILandingPage());
	}
	
	public static void clickPushNotification(){
	PushNotification.click();
	PageFactory.initElements(new AppiumFieldDecorator(driver),new PushNotificationPage());
	}
	//return PushNotificationPage
}
