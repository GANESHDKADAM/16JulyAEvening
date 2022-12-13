package NeostoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 

{
	protected WebDriver driver;
  public void lunchbrowser() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();  
		driver.get("https://neostox.com/"); 
		Thread.sleep(1000);
  }

}
