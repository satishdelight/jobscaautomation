package itjobsca;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Util.KillProcess;
import Util.WebdriverUtil;
import jobsca.Searchjobsca;

public class Testitjobsca {

	static WebDriver driver = null;
	static String baseURL = "https://www.itjobs.ca/en";

	@BeforeMethod
	public static void setup() {

		driver = WebdriverUtil.getWebDriver("FIREFOX");

		// maximizing the browser window	
		driver.manage().window().maximize();

		// launching the website
		driver.get(baseURL);

		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test(priority = 1, enabled = false)
	public void filterJobsSearchByLocation() throws InterruptedException {

		Homepage objhomepage = new Homepage(driver);
		// enter job keywords
		objhomepage.EnterSearchKeyword("Selenium");
		objhomepage.clearStateOrProvinceInputBox();
		Thread.sleep(5000);
		objhomepage.clickFindajob();
		Thread.sleep(5000);
		objhomepage.selectProvinceByCategory("Ontario");
		objhomepage.verifyJobSearch("Selenium");
		

		
	}

	@Test(priority = 2, enabled = false)
	public void createAnAlert() {

		CreateAnAlert objCreateAnAlert = new CreateAnAlert(driver);
		Homepage objhomepage = new Homepage(driver);

		objCreateAnAlert.selectRadius("10");
		System.out.println("10 selected");
	}

	@Test(priority = 3, enabled = true)
	public void selectedEmployers() {
		Homepage objhomepage = new Homepage(driver);

		objhomepage.clickShowAllemplyers();
		objhomepage.selectALetter_browseByEmployer("c");
		objhomepage.clickChooseAEmployer("Concordia University");
		objhomepage.verifyJobsResults_browseByEmployer("Concordia University");

	}

	@Test(priority = 4, enabled = false)
	public void BrowseByLocation() {
		Homepage objhomepage = new Homepage(driver);

		String provinceName = "Ontario";
		String cityName = "Toronto";
		String categoryName = "QA, Tester, Debug";

		String pN = provinceName.toLowerCase();

		objhomepage.selectBrowseByLocation();
		objhomepage.selectProvince_BrowseByLocation(provinceName);
		objhomepage.selectCity_BrowseByLocation(cityName);
		objhomepage.selectCategory_BrowseByLocation(categoryName);

		if (driver.getCurrentUrl().contains(pN)) {
			System.out.println("passed");
			System.out.println(provinceName + "/" + cityName + "/" + categoryName);
		}
		
	}
	
	
	@Test(priority=5, enabled = false)
	public void verifyMenuElements()
	{
		List<WebElement> subMenu = driver.findElements(By.xpath("//li//ul//li"));
		
		if (subMenu.size() == 3)
		{
			System.out.print("pass veerufy meny");
		}
		
	}

	@AfterClass
	public static void tearDown() throws IOException {
		driver.quit();

		/*
		 * KillProcess objKillProcess = new KillProcess();
		 * objKillProcess.killChromeExecProcess();
		 */
	}

}
