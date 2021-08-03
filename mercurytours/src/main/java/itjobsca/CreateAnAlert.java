package itjobsca;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAnAlert {

	WebDriver driver;

	@FindBy(id = "distance")
	WebElement radius;

	// constructor
	public CreateAnAlert(WebDriver driver3) {
			this.driver = driver3;
			 PageFactory.initElements(driver, this);
		}
	
	//select 10km radius

	
	public void selectRadius(String radiusValue)
	{
		Select dropdown = new Select(radius);  
		dropdown.selectByVisibleText(radiusValue);
		
	}
	
}
