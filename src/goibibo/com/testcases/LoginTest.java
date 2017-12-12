package goibibo.com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import goibibo.com.TestsUtility.BaseTest;
import goibibo.com.constants.ibiboconstants;
import goibibo.com.pages.LaunchPage;
import goibibo.com.pages.Loginpage;
import goibibo.com.pagesutility.topmenu;

public class LoginTest extends BaseTest {

	
	
	
	@Test
	
	public void IbibologinTest()
	{
		
		
		topmenu menu = new topmenu(driver, test);
		
		test=extent.startTest("IbibologinTest");
		
		init("chrome");
		
		test.log(LogStatus.INFO, "broeser launched");
		LaunchPage launchpag = new LaunchPage(driver, test);
	
		PageFactory.initElements(driver, launchpag);
		
		Loginpage lpage=launchpag.Launchgoibibo(ibiboconstants.ibibourl);
		lpage.doLogin("8977688776", " suresh267");
		test.log(LogStatus.INFO, "logged in with username/password");
		menu.logout();
		System.out.println("completed logout");
		
		
	}
	
	
	
	
	@AfterMethod
	
	public void quit()
	{
		if(extent!=null)
		{
		extent.endTest(test);
		extent.flush();
		}
	}
}
	
	