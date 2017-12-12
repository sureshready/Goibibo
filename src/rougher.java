import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import goibibo.com.constants.ibiboconstants;
import goibibo.com.pagesutility.utilityfuncs;

public class rougher {

	
	
	@Test
	public void roughtest() throws Exception
	{
		utilityfuncs ut= new utilityfuncs();
		System.setProperty("webdriver.chrome.driver", ibiboconstants.chromedriver_path);
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:www.goibibo.com");
		
		ut.clicker(ibiboconstants.signinlink_xpath);
		
		
		driver.switchTo().frame("authiframe");
		ut.inputtext(ibiboconstants.username_xpath, "8977688776");
		
		
		
		
		
		Thread.sleep(6000);
	
		
		ut.jsclicker(ibiboconstants.ibibosignout_xpath);
		
		
		
		
		
		
		
		
		
	}
}
