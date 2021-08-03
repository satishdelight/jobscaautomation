package itjobsca;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage {

	WebDriver driver;

	@FindBy(xpath = "//input[@name ='keywords' and @placeholder='Job wanted' and @data-ghost-class='keywords']")
	WebElement searchKeyword;

	@FindBy(xpath = "//div[@class='input-fields-wrapper']/div[@class='field search-location']/input[@name= 'location' and @class='location input-search-location ui-autocomplete-input']")
	WebElement stateOrCityInputBox;

	@FindBy(xpath = "//input[ @data-ghost-class='location']")
	WebElement location;

	@FindBy(xpath = "//button[@type ='submit' and @class ='btn-submit black']")
	WebElement FindaJob;

//	 @FindBy(xpath="//div[@data-location='Quebec']")
//	 WebElement selectProvinceByCategory;

	@FindBy(linkText = "Show all employers")
	WebElement Showallemployers;

	// @FindBy(linkText="Concordia University")
	// WebElement clcikConcordiaUniv;

	@FindBy(linkText = "BROWSE BY LOCATION")
	WebElement clickBrowseByLocation;

	@FindBy(linkText = "QA, Tester, Debug")
	WebElement selectTestingCategory;

	// constructor
	public Homepage(WebDriver driver3) {
		this.driver = driver3;
		PageFactory.initElements(driver, this);
	}

	// method to enter keyword search
	public void EnterSearchKeyword(String Keyword) {
		searchKeyword.clear();
		searchKeyword.sendKeys("Selenium");

	}

	// method to click findajob
	public void clickFindajob() {
		FindaJob.click();
	}

	// method to select location from category
	public void selectProvinceByCategory(String Province) {

		System.out.println("Entered Province name is: " + Province);

		WebElement selectProvinceFromCategory = driver
				.findElement(By.xpath("//div[@data-location='" + Province + "']"));

		selectProvinceFromCategory.click();
	}

	// method to verfiy the jobs contain search keyword
	public void verifyJobSearch(String keyword) {
		System.out.println("Inside the Verify job search method");
		List<WebElement> jobResults = driver.findElements(By.xpath("//div[@class='result-info-wrapper']"));
		System.out.println("Identified the list of web elements for job links");

		// iterate the weblemet list
		Iterator<WebElement> iter = jobResults.iterator();

		System.out.println("iter is declared" + iter);

		while (iter.hasNext()) {
			WebElement we = iter.next();
			we.click();

			System.out.println("web element for job link is clicked");

			List<WebElement> jobDescTest = driver.findElements(By.xpath("//div[@class='offer-description-wrapper']/p"));
			System.out.println("Identified the list of web elements for job description for a job link");
			Iterator<WebElement> iter1 = jobDescTest.iterator();

			System.out.println("Iter1 is declared" + iter1);
			Integer windowSize = driver.getWindowHandles().size();
			System.out.println("Window size" + windowSize);
			for (String windowHandle : driver.getWindowHandles()) {

				driver.switchTo().window(driver.getWindowHandle());

				System.out.println("Switched to the window" + driver.getWindowHandle());
			}
			while (iter1.hasNext()) {
				WebElement jobDesc = iter1.next();
				String jobDescParagraph = jobDesc.getText();

				System.out.println("Job description:" + jobDescParagraph);

				if (jobDescParagraph.contains(keyword)) {
					System.out.println("Job description contains the given keyword" + keyword);
				}
			}

			System.out.println("before clicking on the search results");
			// page scroll up
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("scroll(0,-250)");

			System.out.println("Page is scrolled up");

			WebElement backToSearchResultsLink = driver.findElement(
					By.xpath("//div[@class='back-button top']//a[contains(text(),'Back to search results')"));
			if (backToSearchResultsLink.isDisplayed()) {
				System.out.println("Back link is displayed");
				if (backToSearchResultsLink.isEnabled()) {
					System.out.println("Back link is enabled");
					backToSearchResultsLink.click();
					System.out.println("Back link is clicked");
				}
			}

		}

	}

	// method to click showallemplyers
	public void clickShowAllemplyers() {
		Showallemployers.click();
	}

	// method to click browse by location
	public void selectBrowseByLocation() {
		clickBrowseByLocation.click();
	}

	// method to clear the state or province input box
	public void clearStateOrProvinceInputBox() {
		stateOrCityInputBox.clear();
	}

	// method to choose province
	public void selectProvince_BrowseByLocation(String provinceName)

	{
		// selectQuebecLocation.click();
		System.out.println("Entered Province name is: " + provinceName);

		WebElement selectProvince = driver
				.findElement(By.xpath("//ul[@class='with-arrow']//a[contains(text(),'" + provinceName + "')]"));
		selectProvince.click();
	}

	// method to selectCity
	public void selectCity_BrowseByLocation(String cityName) {

		System.out.println("Entered Province name is: " + cityName);

		WebElement selectCity = driver
				.findElement(By.xpath("//div[@class='content']//a[contains(text(),'" + cityName + "')]"));
		selectCity.click();
	}

	// method to selectCategory
	public void selectCategory_BrowseByLocation(String categoryName) {
		System.out.println("Entered Province name is: " + categoryName);

		WebElement selectCategory = driver.findElement(By.xpath("//a[contains(text(),'" + categoryName + "')]"));
		selectCategory.click();

	}

	// method to select a letter to pull out the emplolyer for the chosen
	public void selectALetter_browseByEmployer(String letter) {
		WebElement selectALetter = driver.findElement(By.xpath("//a[text()='" + letter + "']"));
		System.out.println(selectALetter.getText());
		
		selectALetter.click();

		System.out.println("selectALetter_browseByEmployer");

	}

	// methis to choose A EMployer
	public void clickChooseAEmployer(String Employer) {

		WebElement selectEmployer = driver.findElement(By.xpath("  //a[text()='" + Employer + "']"));
		selectEmployer.click();
	}

	// method to verify the job resukts are dsiplayed in the selected employer
	public void verifyJobsResults_browseByEmployer(String Employer) {
		List<WebElement> jobResults = driver.findElements(By.xpath("//div[@class='company-details']"));
		// iterate the weblemet list
		Iterator<WebElement> iter = jobResults.iterator();
		while (iter.hasNext()) {
			WebElement we = iter.next();
			if (we.getText().contains(Employer)) {
				System.out.println("verifyJobsResults_browseByEmployer: Passed testttt");
			}

		}

	}
}
