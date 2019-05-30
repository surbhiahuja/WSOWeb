package appFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class appFunctions {
	public static WebDriver driver;
	public static String getData(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\surbhi.pathak\\eclipse-Surbhi\\PageObject\\src\\Utilities\\Driver.properties");
		
	    prop.load(fis);
	  return prop.getProperty(key);		
	}
	
	public static void launchBrowser() throws InterruptedException, IOException
	{
		//		if(driver==null) {
		
			if(appFunctions.getData("browser").equalsIgnoreCase("chrome")) {
			
		System.setProperty(appFunctions.getData("chrome"),appFunctions.getData("chromepath"));
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(appFunctions.getData("url"));
		
		}else
			System.out.println("Bye Bye");
}
	
	public static void close()
	{
		driver.close();		
	}
	
	
}