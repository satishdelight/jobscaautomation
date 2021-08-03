package jobsca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Searchjobsca {

	WebDriver driver;

	// constructor
	public Searchjobsca(WebDriver driver3) {
		this.driver = driver3;
	}

	// select the job wanted textbox
	By selctJobWanted = By.xpath("(//input[@name='keywords' and @placeholder='Job wanted'])[1]");

	// select the job wanted keyword selnium to be sected from autosufggestion
	By selectSelenium = By.xpath("//div[@tabindex='-1']");
	// select location
	By selectLocation = By.xpath("(//input[@name='location'])[1]");

	// click find a job
	By clickFindAJob = By.xpath("//button[@type='submit' and @class='btn-submit black']");

	// Method for entering keywords as "sel"
	public void enterKeywords(String keywords) {

		driver.findElement(selctJobWanted).clear();
		driver.findElement(selctJobWanted).sendKeys(keywords);
		driver.findElement(selectSelenium).click();

	}

	// method for entering job keywords from auto suggestions for selnium

	// method to enter job location
	public void enterJobLocation(String joblocation) {
		driver.findElement(selectLocation).clear();
		driver.findElement(selectLocation).sendKeys(joblocation);
	}

	// Click find a job
	public void clickFindAJob() {
		driver.findElement(clickFindAJob).click();
		
	}

}
