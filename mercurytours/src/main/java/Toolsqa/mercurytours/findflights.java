package Toolsqa.mercurytours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;

public class findflights {
	
	WebDriver driver;
	
	//constructor
    public findflights(WebDriver driver1) {
        this.driver = driver1;
    }
     
    //select roundway
    By roundway = By.xpath("//input[@type='radio' and @value='roundtrip']");
    
    //select no of passengers
    By passengers = By.name("passCount");
    
    //select from port
    By fport = By.name("fromPort");
    
    //select from month
    By fmonth = By.name("fromMonth");
    
    //select from day
    By fday = By.name("fromDay");
    
    //selct to port
    By roport = By.name("toPort");
    
    //select return month
    By tmonth = By.xpath("//select[@name='toMonth']");
    
    //select return day		
    By tday = By.xpath("//select[@name='toDay']");
    
    //seleetc servie class
    By serivceclassEconomy = By.xpath("//input[@value='Coach']");
    
    //select airline
    By airline = By.xpath("//select[@name='airline']");
    
    //clcik findflights
    By cfindflights = By.xpath("//input[@name='findFlights']");
    
    
    //method for selecting round trip 
    public void selectRoundTrip	()
    {
    	driver.findElement(roundway).click();
    }
    
    
    //method for no of passengers
    public void selectNoofPassengers(String noofpassengers)
    {
    	Select drpPassengers = new Select( driver.findElement(passengers));
		drpPassengers.selectByVisibleText(noofpassengers);
    }
    	
  //method for selecting departing from
    public void selectDepartFrom(String departfrom)
    {
    	Select drpDepartfrom = new Select( driver.findElement(fport));
    	drpDepartfrom.selectByVisibleText(departfrom);
    }
    
    //method for selecting from month
    
    public void selectfrommonth(String frommonth)
    {
    	Select drpfromMonth = new Select( driver.findElement(fmonth));
    	drpfromMonth.selectByVisibleText(frommonth);
    }
    
    //method for selecting from day
    public void selectfrommday(String fromday)
    {
    	Select drpDepartfrom = new Select( driver.findElement(fday));
    	drpDepartfrom.selectByVisibleText(fromday);
    }
    
    //method for selecting to destination
    public void selectArrival(String destination)
    {
    	Select drpSelectArrival = new Select(driver.findElement(fday));
    	drpSelectArrival.selectByVisibleText(destination);
    }
    
    //Method for selecting return month
 
    public void selecttomonth(String tomonth)
    {
    	Select selecttomonth = new Select( driver.findElement(tmonth));
    	selecttomonth.selectByVisibleText(tomonth);
    }
    
    //Method for selecting return day
    
    public void selecttoday(String today)
    {
    	Select selecttoday = new Select( driver.findElement(tday));
    	selecttoday.selectByVisibleText(today);
    }
    
    //Method to select service class as economy class
    public void selecteconomyClass()
    {
    	driver.findElement(serivceclassEconomy).click();
    }
    
    //method to select airline as no preference
    public void selectNoPreference()
    {
    	driver.findElement(airline).click();
    }
    
    //method to click continue to find flights
    public void selectContinue()
    {
    	driver.findElement(cfindflights).click();
    }


	
    
}
