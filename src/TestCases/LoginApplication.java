package TestCases;

import objectRepositary.*;
import Utilities.commonFunctions;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.commonFunctions;
import appFunctions.appFunctions;
import objectRepositary.LoginPage;
import appFunctions.appFunctions;

public class LoginApplication extends commonFunctions{
	WebDriver driver;
	@BeforeTest
	public void login() throws IOException, InterruptedException {
	appFunctions.launchBrowser();	
		
	} 
	
	
	
/*@AfterTest
		public void logout() {
			appFunctions.close();
		}*/
	}
	
	

