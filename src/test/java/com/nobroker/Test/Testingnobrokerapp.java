package com.nobroker.Test;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nobroker.screens.Allowpermissionscreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Testingnobrokerapp 
{

	static AppiumDriver<WebElement> driver;
	Allowpermissionscreen APS;
	
	@BeforeClass
	public void setup() throws Exception
	{
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("deviceName", "4200deb4b2221400");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "6.0.1");
		dc.setCapability("appPackage", "com.nobroker.app");
		dc.setCapability("automationname","UiAutomator1");
		dc.setCapability("appActivity","com.nobroker.app.activities.NBSplashScreen");
		
		
		//Appium server
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		URL u=new URL ("http://0.0.0.0:4723/wd/hub");
		
		//create driver object
		 AppiumDriver driver = null;
		 while(2>1)
		 {
			try
			{
			driver=new AndroidDriver(u,dc);
			break;	
		    }
		       catch(Exception ex)
		            {
			             System.out.print(ex.getMessage());
		              }
	     
		 }//while close
		
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
		 		 
	}
	
	@Test
	public void testallowpermission()
	{
		
		 APS = new Allowpermissionscreen(driver);
		 APS.allowpermission();
	}
	
	
	
}
