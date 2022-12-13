package NeostoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utilitycommonmethod2properties 
{
	//  scroll into view , excel reading, wait, screenshoot
	
	// for excel sheet reading purpose common method
	
	public static String readdatafromPropertyFile(String key) throws EncryptedDocumentException, IOException
	{
		// create object of properties class
		
		Properties pro= new Properties();
		
		// create object of inputstream and pass the properties class parameter
		  FileInputStream myfile= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Selenium 16 July E\\NeostoxNew.properties");
		  pro.load(myfile);
		  
		  String value = pro.getProperty(key);
		  Reporter.log("reading " + key + " from property file",true);
		  
		  return value;
		  
		
		
		
	}
	
	// for screenshoot purpose common method
	
	public static void Takescreenshot(WebDriver driver, String screenshotname) throws IOException
	{
		wait(driver, 1000);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\User\\Downloads\\selenium\\ScreenShot\\"+screenshotname+".jpg");
		FileHandler.copy(source, destination);
		Reporter.log("taking screenshot",true);
	}
	
	// for scroll into view purpose
	
	public static void scrollintoview(WebDriver driver, WebElement element)
	{
		wait(driver, 1000);
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true)", element);
		 Reporter.log("scrolling into view",true);

	}
	
	// for wait purpose
	
	public static void wait(WebDriver driver, int waittime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
		Reporter.log("waiting for "+waittime+ " ms",true);
	}
	

}
