package HDFCUTILITY;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class hdfcutility 
{
	
	public static String dataReadFromPropertyFile(String key) throws IOException
	{
		Properties pr= new Properties();
		
		FileInputStream myfile= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Maven16JulyAEvening\\NeostoxNew.properties");
		pr.load(myfile);
		String value = pr.getProperty(key);
		Reporter.log("fetching "+key+" from property files",true);
		return value;
	}
	public static void Takescreenshot(WebDriver driver, String screenshotname) throws IOException
	{
		wait(driver, 1000);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\User\\Downloads\\selenium\\ScreenShot\\"+screenshotname+".jpg");
		FileHandler.copy(source, destination);
		Reporter.log("taking screenshot",true);
	}
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
