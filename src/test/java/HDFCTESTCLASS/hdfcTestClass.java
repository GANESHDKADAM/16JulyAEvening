package HDFCTESTCLASS;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HDFCBASE.hdfcBase;
import HDFCPOM.hdfcLoginPage;
import HDFCUTILITY.hdfcutility;

public class hdfcTestClass extends hdfcBase 
{
	hdfcLoginPage login;
	
	@BeforeClass
	public void lunchbrowser() throws IOException, InterruptedException
	{
		browserlunch();
		login= new hdfcLoginPage(driver);
	}
	@BeforeMethod
	public void hdfcNetBankingLogin() throws InterruptedException, IOException
	{
		hdfcutility.wait(driver, 1000);
		login.enteruserid(driver, hdfcutility.dataReadFromPropertyFile("userid"));
		login.clickOnContinueButton(driver);
		Thread.sleep(1000);
		
	}
  @Test
  public void f() {
  }
}
