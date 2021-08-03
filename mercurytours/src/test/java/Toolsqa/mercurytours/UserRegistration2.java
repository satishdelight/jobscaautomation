package Toolsqa.mercurytours;



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

public class UserRegistration2 {
	
@Test
public static void registration() throws InterruptedException {

		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver",
				"/Users/satishtamilselvan/eclipse-workspace/mercurytours/drivers/chromedriver 6");

		driver = new ChromeDriver();

		// maximizing the browser window
		driver.manage().window().maximize();
		
		
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// launching the website
		driver.get("http://demo.guru99.com/test/newtours/");

		// driver.navigate().to();

//        //locating user name field
//        WebElement username=driver.findElement(By.xpath("//*[@type='text' and @name='userName']"));
//
//        //enter value in the user name field
//        username.sendKeys("Sathish");
//
//        System.out.println("Username is entered" );
//
//        //locating password field
//        WebElement password= driver.findElement(By.xpath("//input[@type='password' and @name='password']"));
//
//        //Enter the value for password field
//        password.sendKeys("sathishpwd");
//
//        System.out.println("Password is entered" );
//
//        //Finding the submit button element
//        WebElement submitBtn=driver.findElement(By.xpath("//input[@type='submit']"));
//
//        //click on submit button
//        submitBtn.click();
//
//        System.out.println("Submit button is clicked on ");

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
		
		driver.quit();
	}

}
