package NeostoxTestClassValidateUserIdandBalance;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import NeostoxBase.BaseClass;
import NeostoxUtility.Utilitycommonmethod;
import NeostoxUtility.Utilitycommonmethod2properties;
import Neostoxpomclasses.NeostoxHomePage1;
import Neostoxpomclasses.NeostoxLoginPage;
import Neostoxpomclasses.NeostoxPasswordPage;

public class ValidateAccBalance2properties extends BaseClass
{
	 NeostoxLoginPage login;
	 NeostoxPasswordPage password;
	 NeostoxHomePage1 home; 
	 
	@BeforeClass
	public void launchbrowser() throws InterruptedException
	{
       lunchbrowser();  // from Base class
       login= new NeostoxLoginPage(driver);
       password= new NeostoxPasswordPage(driver);
       home= new NeostoxHomePage1(driver);
	}
	@BeforeMethod
	public void logintoNeostox() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		login.sendmobileno(driver,Utilitycommonmethod2properties.readdatafromPropertyFile("mobileno"));
		login.clickonsigninbutton(driver);
		Thread.sleep(1000);
		password.enterpassword(driver,Utilitycommonmethod2properties.readdatafromPropertyFile("password"));
		password.clickonsubmitbutton(driver);
		Thread.sleep(1000);
		home.popup(driver);
	}
  @Test
  public void ValidateAccBalance() throws EncryptedDocumentException, IOException 
  {
	 Assert.assertNotNull(home.getActualBalance(driver),"actual balance is null then TC is failed");
	  Utilitycommonmethod.Takescreenshot(driver, "AccBalance");
  }
  @AfterMethod
  public void logOutFromNeostox()
  {
	  Reporter.log("loginout from neostox",true);
	  home.logout(driver);
  }
  @AfterClass
  public void closebrowser()
  {
	  Reporter.log("closing the browser",true);
	  driver.close();
	  
  }
}
