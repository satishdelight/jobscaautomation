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

public class SearchPage {

	WebDriver driver;
	
	

	public void verifyRecentSearch(String keyword)
	{
		WebElement recentSearch = driver.findElement(By.xpath("//div[@class='result-history']//a[text()='"+keyword+"']"));
		
		
		if(recentSearch.isDisplayed())
		{
		System.out.println(recentSearch.getText());
		}
	}
	// constructor
	public SearchPage(WebDriver driver3) {
		this.driver = driver3;
		PageFactory.initElements(driver, this);
	}

}
