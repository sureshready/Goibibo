package goibibo.com.pagesutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import goibibo.com.utility.ExtentManager;


public class Basepage {

	
	public WebDriver driver;
	public ExtentReports extent = ExtentManager.getInstance();
	public ExtentTest test;
	public topmenu menu;
	
	
	public Basepage()
	{
	
	}
	
	public Basepage(WebDriver driver,ExtentTest test )
	{
	
		this.driver=driver;
		this.test=test;
		menu= new topmenu(driver, test);
		
		PageFactory.initElements(driver, menu);
		
	}
	
}
