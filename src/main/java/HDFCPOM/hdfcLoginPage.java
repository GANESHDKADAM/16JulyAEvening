package HDFCPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import HDFCUTILITY.hdfcutility;

public class hdfcLoginPage 
{
	@FindBy(xpath="//input[@name='fldLoginUserId']") private WebElement senduserid;
	@FindBy(xpath="//a[text()='CONTINUE']") private WebElement continuebutton;
	
	public hdfcLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enteruserid(WebDriver driver, String id)
	{
		hdfcutility.wait(driver, 1000);
		senduserid.sendKeys(id);
		Reporter.log("entering"+id+"from property file",true);
	}
	public void clickOnContinueButton(WebDriver driver)
	{
		hdfcutility.wait(driver, 1000);
		continuebutton.click();
		Reporter.log("cliking on continue button",true);
	}

}
