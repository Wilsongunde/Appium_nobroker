/*package com.nobroker.Test;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nobroker.screens.Allowpermissionscreen;
import com.nobroker.screens.Loginscreen;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Testnobrokerapp //extends Allowpermissionscreen 

{
	WebDriver driver;
	
	DesiredCapabilities dc = new DesiredCapabilities();
	
	ExtentReports er=new ExtentReports("Nobroker.html",false);
	ExtentTest et=er.startTest("Nobroker App");

	
	@Test(priority=0)
	public void nobrokerapp()  throws Exception
	{
		
		
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
			
		@Test(priority=1)
		public void allowapp()
	
		{
			
			
			Allowpermissionscreen AP=new Allowpermissionscreen();
			
			AP.allowpermission();
			
			//Extent reports
		    et.log(LogStatus.PASS,"Allow permissions working Successfully ");
			}
			
		    
			//Save Extent Results
			er.endTest(et);
			er.flush();
			try {
		   //Pagefactory
			Allowpermissionscreen AP = PageFactory.initElements(driver,Allowpermissionscreen.class);
		
			AP.allowpermission();
			
			//Extent reports
		    et.log(LogStatus.PASS,"Allow permissions working Successfully ");
			}
			catch(Exception e)
			{
				
				System.out.println(e.getMessage());
				
			}
			
			
			
		}
		
		@Test(priority=2)
		public void loginapp() throws Exception  
		
		{
			try
			{
		   //Pagefactory
			Loginscreen LGN = PageFactory.initElements(driver,Loginscreen.class);
		
			LGN.lgnapp();
			
			//Extent reports
		    et.log(LogStatus.PASS,"Login Application working Successfully ");
			
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				
			}
			
			//Save Extent Results
			er.endTest(et);
			er.flush();
			
			
			
		}
		
	}
	
		


	
	
	
	


*/