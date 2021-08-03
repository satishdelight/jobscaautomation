package browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepageBrowserstack {

	WebDriver driver;

	// constructor
	public homepageBrowserstack(WebDriver driver3) {
		this.driver = driver3;
	}
	
	//click live
	By clickLive = By.xpath("//a[@title='Live' and @href='/live' and @class='product-cards-wrapper--click--hoverclick']");

	By clickAutomate = By.xpath("//a[@title='Automate' and @class='product-cards-wrapper--click--hoverclick']");
	
	By clickPercy = By.xpath("//a[@title='Percy' and @class='product-cards-wrapper--click--hoverclick']"); 
			
	By clickAppLive = By.xpath("//a[@title='App Live' and @class='product-cards-wrapper--click--hoverclick']"); 
	
	
	By clickAppAutomate = By.xpath("//a[@title='App Automate' and @class='product-cards-wrapper--click--hoverclick']"); 
	
	//click browserstack to navigate homepage
	By clickbrowserstack = By.xpath("//a[@title='BrowserStack']");
	
	//method to click LIVE
	public void clickLive()
	{
		driver.findElement(clickLive).click();
	}
	
	public void clickAutomate()
	{
		driver.findElement(clickAutomate).click();
	}
	
	public void clickPercy()
	{
		driver.findElement(clickPercy).click();
	}
	
	public void clickAppLive()
	{
		driver.findElement(clickAppLive).click();
	}
	
	public void clickAppAutomate()
	{
		driver.findElement(clickAppAutomate).click();
	}

	public void clickbrowserstack() {
		// TODO Auto-generated method stub
		driver.findElement(clickbrowserstack).click();
	}
	
	
	

}
