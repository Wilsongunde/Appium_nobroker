package com.nobroker.screens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Allowpermissionscreen 
{
	WebDriver driver;
	
    //Element Object/properties
	@AndroidBy(xpath="//*[@ text='Continue']")
	WebElement AllowusContinue;
	@AndroidBy(xpath="//*[@ text='Allow']")
	WebElement DevicelocaAllow1;
	@AndroidBy(xpath="//*[@ text='Allow']")
	WebElement PhncallsAllow2;
	@AndroidBy(xpath="//*[@ text='Allow']")
	WebElement contactsAllow3;
	
	public Allowpermissionscreen(AppiumDriver<WebElement>driver)
    {
    	
    	
    	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    	
    }
	
	//Element methods
	
	public void allowpermission()
	{
		
		AllowusContinue.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		DevicelocaAllow1.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		PhncallsAllow2.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		contactsAllow3.click();
	}
	
	
}
