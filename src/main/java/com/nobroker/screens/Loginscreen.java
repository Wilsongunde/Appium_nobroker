package com.nobroker.screens;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Loginscreen 

{

	WebDriver driver;
//	Properties prop;
	
	
    //Element Objects/properties
    @AndroidBy(xpath="//*[@content-desc='Navigate up']")
    WebElement Menu;
    @AndroidBy(xpath="//*[@text='LOGIN/SIGNUP']")
	WebElement Login;
    @AndroidBy(xpath="//*[@text='Enter Phone Number']")
	WebElement Enterphnnum;
    @AndroidBy(xpath="//*[@text='I've Password']")
	WebElement selectpwd;
    @AndroidBy(xpath="//*[@text='Enter Password']")
	WebElement Enterpwd;
    @AndroidBy(xpath="//*[@text='Continue']")
	WebElement Continue;
	
	
    public Loginscreen(AppiumDriver<WebElement>driver)
    {
    	
    	
    	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    	
    }
	
	
	
	
	//Methods
	
	public void lgnapp() throws Exception
	{
		/*prop = new Properties();
		FileInputStream FIS = new FileInputStream(System.getProperty("F:\\wil_workspace\\Appium_nobroker\\src\\main\\java\\com\\nobroker\\config\\config.properties"));
		prop.load(FIS);*/
		Menu.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Login.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Enterphnnum.sendKeys("1237567899");
		//Enterphnnum.sendKeys(prop.getProperty("phonenumber"));
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		selectpwd.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Enterpwd.sendKeys("nobroker123");
		//Enterpwd.sendKeys(prop.getProperty("password"));
//		driver.hidekeyboard();		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Continue.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
			String title = driver.getTitle();
			System.out.println(title);
		
	}
	
	
	
	
	
	
	
	
}
