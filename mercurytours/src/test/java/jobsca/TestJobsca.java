package jobsca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Util.WebdriverUtil;

import java.util.concurrent.TimeUnit;

public class TestJobsca {
	
	static WebDriver driver = null;
	static String baseURL = "https://www.jobs.ca/";

	
	@BeforeMethod
	public static void setup() {
		
		driver = WebdriverUtil.getWebDriver("CHROME");
		
		// maximizing the browser window
		driver.manage().window().maximize();

		// launching the website
		driver.get(baseURL);

		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@Test(priority = 1, enabled = true)
	public void verifysearchJobResults_POM_withoutPageFactory() {
		
		Searchjobsca sjc = new Searchjobsca(driver);
		
		//enter job keywords
		
		sjc.enterKeywords("selenium");
		sjc.enterJobLocation("Montreal, QC");
		sjc.clickFindAJob();
		
		if (driver.getCurrentUrl().contains("https://www.jobs.ca/search/?keywords=selenium&location=Montreal%2C+QC")) {
			System.out.println("search results passed");
		}
		
		
	}
	
	@AfterClass
	public  void tearDown() {
		driver.quit();
	}


}
