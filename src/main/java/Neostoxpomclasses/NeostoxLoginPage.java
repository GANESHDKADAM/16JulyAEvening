package Neostoxpomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import NeostoxUtility.Utilitycommonmethod;

public class NeostoxLoginPage 
{
	@FindBy(xpath="(//a[text()='Sign In'])[1]") private WebElement clickonsignin;
	@FindBy(xpath ="(//input[@type='number'])[1]") private WebElement sendingmobileno;
	@FindBy(xpath ="(//a[text()='Sign Up'])[2]") private WebElement signinbutton;
	
	public NeostoxLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void signinclick(WebDriver driver)
	{
	
		clickonsignin.click();
		Utilitycommonmethod.wait(driver, 1000);
		Reporter.log("click on signin",true);
		
	}
	public void sendmobileno(WebDriver driver, String mobile)
	{
		Utilitycommonmethod.wait(driver, 1000);
		sendingmobileno.sendKeys(mobile);
		Reporter.log("Entering mobile no",true);
	}
	public void clickonsigninbutton(WebDriver driver)
	{
		Utilitycommonmethod.wait(driver, 1000);
		signinbutton.click();
		Reporter.log("clicking on signin button",true);
	}
	

}
