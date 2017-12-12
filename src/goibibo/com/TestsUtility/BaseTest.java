package goibibo.com.TestsUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import goibibo.com.utility.ExtentManager;

public class BaseTest {

	
	public WebDriver driver;
	public ExtentReports extent= ExtentManager.getInstance();
	public ExtentTest test;
	
	
	
	
	
	
	
	public void init(String browser)
	{
		
		if(browser.equals("chrome"))
		{
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SGONDESI\\Downloads\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			test.log(LogStatus.INFO, "chrome initiated");
		}else
			
			if(browser.equals("firefox"))
				
				driver= new FirefoxDriver();
				
		test.log(LogStatus.INFO, "ff initiated");
		
	}
	
	
	
	
}
