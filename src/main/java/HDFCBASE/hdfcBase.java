package HDFCBASE;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import HDFCUTILITY.hdfcutility;


public class hdfcBase 
{
	protected static WebDriver driver;
	  public void browserlunch() throws InterruptedException, EncryptedDocumentException, IOException
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();  
			driver.get(hdfcutility.dataReadFromPropertyFile("url"));
			Thread.sleep(1000);
			Reporter.log("lunching the browser",true);
	  }
}
