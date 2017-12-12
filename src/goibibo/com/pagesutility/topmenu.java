package goibibo.com.pagesutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import goibibo.com.constants.ibiboconstants;

public class topmenu extends Basepage {
	
	
	
	
	public topmenu(WebDriver driver, ExtentTest test)
	{
		super(driver, test);
		
		
	}
	
	public void logout()
	{
		
		utilityfuncs ut= new utilityfuncs();
		
		ut.jsclicker(ibiboconstants.ibibosignout_xpath);
		test.log(LogStatus.INFO, "logged out from ibibo");
		
	}
	
	
	

}
