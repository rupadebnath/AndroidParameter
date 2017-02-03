package com.appium.test;

import org.testng.annotations.Test;

import com.appium.pages.PushNotificationPage;
import com.appium.pages.SettingsPage;
import com.appium.pages.TOILandingPage;
import com.appium.utils.AbstractTest;

public class FirstButtonTest extends AbstractTest{

	@Test
	public void clickFirstButton(){
		
		TOILandingPage.clickSettings();
		SettingsPage.clickPushNotification();
		PushNotificationPage.clickBackBtn();
		SettingsPage.clickBackBtn();
	}
}
