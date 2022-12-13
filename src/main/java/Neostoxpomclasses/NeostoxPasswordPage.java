package Neostoxpomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import NeostoxUtility.Utilitycommonmethod;

public class NeostoxPasswordPage 
{
	@FindBy(xpath ="(//input[@class='form-control'])[1]") private WebElement sendingpassword;
	@FindBy(xpath ="//a[text()='Submit']") private WebElement submitbutton;
	
	public NeostoxPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterpassword(WebDriver driver,String Pass) throws InterruptedException
	{
		Thread.sleep(1000);
		sendingpassword.sendKeys(Pass);
		Reporter.log("sending the password",true);
		
	}
	public void clickonsubmitbutton(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		submitbutton.click();
		Reporter.log("clicking on submit button",true);
		
	}

}
