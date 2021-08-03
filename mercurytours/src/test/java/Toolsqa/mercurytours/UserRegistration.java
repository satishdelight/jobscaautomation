package Toolsqa.mercurytours;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.*;



/**
 * verify user registration is successful or not
 */

public class UserRegistration {
	WebDriver driver=null;
	
	@BeforeMethod
	public void setup() {
		

		System.setProperty("webdriver.chrome.driver",
				"/Users/satishtamilselvan/eclipse-workspace/mercurytours/drivers/chromedriver 6");

		driver = new ChromeDriver();

		// maximizing the browser window
		driver.manage().window().maximize();
		
		
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test(enabled=false)
	public void verifyUserRegistration() {

		
		// launching the website
		driver.get("http://demo.guru99.com/test/newtours/");

		// driver.navigate().to();


		WebElement register = driver.findElement(By.linkText("REGISTER"));
		register.click();

		System.out.println("Register is clicked on ");

		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName' and @size='20']"));
		firstname.sendKeys("satish");

		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName' and @size='20']"));
		lastName.sendKeys("tamilselvan");

		WebElement phonenumber = driver.findElement(By.xpath("//input[@name='phone']"));
		phonenumber.sendKeys("5145506550");

		WebElement email = driver.findElement(By.xpath("//input[@name='userName']"));
		email.sendKeys("satishdelight@gmail.com");

		WebElement address = driver.findElement(By.xpath("//input[@name='address1']"));
		address.sendKeys("acadie");

		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("montreal");

		WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
		state.sendKeys("quebec");

		WebElement postal = driver.findElement(By.xpath("  //input[@name='postalCode']"));
		postal.sendKeys("h3n2w4");

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("CANADA");

		WebElement userName = driver.findElement(By.xpath("//input[@name='email']"));
		userName.sendKeys("satishdelight@gmail.com");
		System.out.print(userName.getText());

		WebElement passsWord = driver.findElement(By.xpath("//input[@name='password']"));
		passsWord.sendKeys("123456");

		WebElement confirmPassword = driver.findElement(By.xpath(" //input[@name='confirmPassword']"));
		confirmPassword.sendKeys("123456");

		WebElement submitBtnRegister = driver.findElement(By.xpath("//input[@name='submit']"));
		submitBtnRegister.click();
		
		if(driver.getCurrentUrl().equalsIgnoreCase("http://demo.guru99.com/test/newtours/register_sucess.php"))
		{
			System.out.println("this regisration is completed succesfully");
			WebElement confirmMsg = driver.findElement(By.xpath("//font[contains(text(),'Thank you for registering.')]"));
			if(confirmMsg.getText().contains("Thank you for registering"))
			{
				
			System.out.println("registartion suucess message is displayed");
			}else {
				System.out.println("registartion is not successful");
			}
		}
		else
		{
			System.out.println("this regisration is not completed  succesfully");
			
		}
		
		
	}
	
	@Test (enabled=false)
	public void login() {

//      //locating user name field
//      WebElement username=driver.findElement(By.xpath("//*[@type='text' and @name='userName']"));
//
//      //enter value in the user name field
//      username.sendKeys("Sathish");
//
//      System.out.println("Username is entered" );
//
//      //locating password field
//      WebElement password= driver.findElement(By.xpath("//input[@type='password' and @name='password']"));
//
//      //Enter the value for password field
//      password.sendKeys("sathishpwd");
//
//      System.out.println("Password is entered" );
//
//      //Finding the submit button element
//      WebElement submitBtn=driver.findElement(By.xpath("//input[@type='submit']"));
//
//      //click on submit button
//      submitBtn.click();
//
//      System.out.println("Submit button is clicked on ");
	}
	
	
	@Test
	public void findFlights() 
	{
		// launching the website
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		
		WebElement roundWay = driver.findElement(By.xpath("//input[@type='radio' and @value='roundtrip']"));
		roundWay.click();
		
		
		Select drpPassengers = new Select(driver.findElement(By.name("passCount")));
		drpPassengers.selectByVisibleText("1");
		
		
		Select drpDepartingFrom	 = new Select(driver.findElement(By.name("fromPort")));
		drpDepartingFrom.selectByVisibleText("New York");
		
		Select drpfromMonth	 = new Select(driver.findElement(By.name("fromMonth")));
		drpfromMonth.selectByVisibleText("July");
		
		Select drpfromDay	 = new Select(driver.findElement(By.name("fromDay")));
		drpfromDay.selectByVisibleText("26");

		Select drpArrivingIn	 = new Select(driver.findElement(By.name("toPort")));
		drpArrivingIn.selectByVisibleText("London");
	
		Select drpReturningfromMonth	 = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
		drpReturningfromMonth.selectByVisibleText("July");
		
		Select drpReturningtoDay	 = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
		drpReturningtoDay.selectByVisibleText("30");
		
		
		WebElement serviceClass = driver.findElement(By.xpath("//input[@value='Coach']"));
		serviceClass.click();
		
		Select drpAirline	 = new Select(driver.findElement(By.xpath("//select[@name='airline']")));
		drpAirline.selectByVisibleText("No Preference");
		

		WebElement findFlights = driver.findElement(By.xpath("//input[@name='findFlights']"));
		serviceClass.click();
		
		
		
		if(driver.getCurrentUrl().equalsIgnoreCase("http://demo.guru99.com/test/newtours/reservation2.php"))
		{
			System.out.println("reservation passed");
		}
		
	}
			
		
		
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
