package com.appium.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.appium.utils.AbstractPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PushNotificationPage extends AbstractPage{
	
	@FindBy(id="com.toi.reader.activities:id/radioNone")
	private static WebElement radioBtn;
	
	@FindBy(id="com.toi.reader.activities:id/radioTwo")
	private static WebElement importantBtn;
	
	@FindBy(id="com.toi.reader.activities:id/radioThree")
	private static WebElement allBtn;
	
	@AndroidFindBy(id="com.toi.reader.activities:id/buttonClose")
	private static WebElement save;
	
	/*@FindBy(xpath="//android.widget.ImageButton[@content-desc='Navigate up']")
	private static WebElement backBtn;
	*/
	
	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Navigate up\")")
	public static MobileElement backBtn;
	//public static List<MobileElement> backBtn;
	
	public static void clickRadioBtn(){
	radioBtn.click();
	}
	
	public static void clickImportantBtn(){
	importantBtn.click();
	}
	
	public static void clickAllBtn(){
	allBtn.click();
	}
	
	public static void clickSave(){
	save.click();
	}
	
	public static void clickBackBtn(){
	backBtn.click();
	PageFactory.initElements(new AppiumFieldDecorator(driver),new SettingsPage());
	}
	//return to SettingsPage
	}
