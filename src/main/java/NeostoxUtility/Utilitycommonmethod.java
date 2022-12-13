package NeostoxUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utilitycommonmethod 
{
	//  scroll into view , excel reading, wait, screenshoot
	
	// for excel sheet reading purpose common method
	
	public static String readdatafromexcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		
		File myfile= new File("C:\\Users\\User\\Downloads\\selenium\\16 july a evening batch.xlsx");
		String value = WorkbookFactory.create(myfile).getSheet("sheet5").getRow(row).getCell(cell).getStringCellValue();
		Reporter.log("Reading Data From Excel Sheet",true);
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
		Reporter.log("waiting for"+waittime+ " ms",true);
	}
	

}
