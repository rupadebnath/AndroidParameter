package com.appium.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.appium.utils.AbstractPage;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TOILandingPage extends AbstractPage{
	
	//public static AppiumDriver driver = null;
	
	/*@FindBy(id="com.toi.reader.activities:id/menu_settings")
	private static WebElement settings;*/
	
	@AndroidFindBy(id="com.toi.reader.activities:id/menu_settings")
	private static WebElement settings;
	
	@FindBy(name="com.toi.reader.activities:id/action_search")
	private static WebElement search;
	
	@FindBy(xpath="//android.widget.TextView[@text='TOP STORIES']")
	private static WebElement topStories;
	
	@FindBy(xpath="//android.widget.TextView[@text='BRIEFS']")
	private static WebElement briefs;
	
	@FindBy(xpath="//android.widget.TextView[@text='TRENDING']")
	private static WebElement trending;
	
	@FindBy(xpath="//android.widget.TextView[@text='LATEST']")
	private static WebElement latest;

	public static void clickSettings(){
	settings.click();
	PageFactory.initElements(new AppiumFieldDecorator(driver),new SettingsPage());
	}
	//return SettingsPage
	
	public static void clickSearch(){
    search.click();
	}
	
	public static void ClickTopStories(){
	topStories.click();
	}
	
	public static void clickBriefs(){
	briefs.click();
	}
	
	public static void clickTrending(){
	trending.click();
	}
	
	public static void clickLatest(){
	latest.click();
	}
	
}
