package NeostoxBase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import NeostoxUtility.Utilitycommonmethod2properties;

public class BaseClass2properties 

{
	protected static WebDriver driver;
  public void lunchbrowser() throws InterruptedException, EncryptedDocumentException, IOException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();  
		driver.get(Utilitycommonmethod2properties.readdatafromPropertyFile("url")); 
		Thread.sleep(1000);
  }

}
