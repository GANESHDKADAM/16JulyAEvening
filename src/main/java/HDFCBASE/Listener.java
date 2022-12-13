package HDFCBASE;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import NeostoxBase.BaseClass2properties;
import NeostoxUtility.Utilitycommonmethod2properties;

public class Listener extends BaseClass2properties implements ITestListener
{
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Test case "+result.getName()+" is successful pass",true);
	}	
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Test case "+result.getName()+" is Failed",true);
		try {
			Utilitycommonmethod2properties.Takescreenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("Test case "+result.getName()+" is Skipped",true);
	}

}
