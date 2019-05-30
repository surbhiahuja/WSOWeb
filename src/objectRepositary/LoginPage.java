package objectRepositary;
import appFunctions.*;


import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.commonFunctions;
import appFunctions.appFunctions;
import net.bytebuddy.asm.Advice.Local;
import Utilities.commonFunctions;


public class LoginPage extends commonFunctions{
//	private static Logger log = LogManager.getLogger(commonFunctions.class.getName());	
		
@FindBy (how=How.XPATH,using="//input[@id='lgLogin_txtUserId']")	
static WebElement user;
	
@FindBy (how=How.XPATH,using="//input[@id='lgLogin_txtPassword']")
static WebElement pass;

@FindBy (how=How.XPATH,using="//input[@value='Login']")
static WebElement login;

WebDriver driver1=appFunctions.driver;
public LoginPage()
{
PageFactory.initElements(driver1, this); 
}

@Test (dataProvider="surbhi")
public void test(String sUsername, String sPassword) throws Exception {
	
//	WebDriver driver1=appFunctions.driver;
	
	user.sendKeys(sUsername);
    pass.sendKeys(sPassword);
	
    /*driver1.findElement(By.xpath("//input[@id='lgLogin_txtUserId']")).clear();
	driver1.findElement(By.xpath("//input[@id='lgLogin_txtUserId']")).sendKeys(sUsername);
	driver1.findElement(By.xpath("//input[@id='lgLogin_txtPassword']")).clear();
	driver1.findElement(By.xpath("//input[@id='lgLogin_txtPassword']")).sendKeys(sPassword);*/
	//driver1.findElement(By.xpath("//input[@value='Login']")).click();
	}


//To read user inputs from Properties file 
/*public void setUsername() throws IOException {
	log.info("Username entered");		
user.sendKeys(appFunctions.getData("username"));					
}
public void setPassword() throws IOException {
	log.info("Password entered");
	pass.sendKeys(appFunctions.getData("password"));

}
public void login() {
	log.info("login");
	login.click();

}*/



				
}

/*@Test

public void testMethodInvalid() throws InterruptedException, IOException{	
    user.sendKeys(appFunctions.getData("Username1"));
    user.sendKeys(appFunctions.getData("Password1"));
    login.click();
    Assert.assertFalse(false);
}*/


	
	
	
	
	
	
