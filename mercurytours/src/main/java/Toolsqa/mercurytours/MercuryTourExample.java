package Toolsqa.mercurytours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MercuryTourExample {
	
	WebDriver driver;

    //Register link
    By register=By.linkText("REGISTER");

    //first name
    By firstName=By.xpath("//input[@name='firstName' and @size='20']");

    //Lastname
    By lastName=By.xpath("//input[@name='lastName' and @size='20']");

    //phonenumber
    By phoneNumber =By.xpath("//input[@name='phone']");

    //email
    By emailId=By.xpath("//input[@name='userName']");
    
    //address
    By waddress = By.xpath("//input[@name='address1']");
    
    //city
    By wcity = By.xpath("//input[@name='city']");
	
    //state
	By wstate= By.xpath("//input[@name='state']");
	
	//postal
	By wpostal = By.xpath("//input[@name='postalCode']");
	
	//country
	By wcountry = By.name("country");
	
	//username
	By  wusername = By.xpath("//input[@name='email']");
	
	//password
	By wpassword = By.xpath("//input[@name='password']");
	
	//confirm password
	By wconfirmPassword = By.xpath("//input[@name='confirmPassword']");

    By wclickRegister = By.xpath("//input[@name='submit']");
    
    
    
    
	
	//constructor
    public MercuryTourExample(WebDriver driver3) {
        this.driver = driver3;
    }


    //Method for clicking register link
    public void clickRegister(){
        driver.findElement(register).click();
        System.out.println("Register is clicked on ");
    }

    //Method for entering first name
    public void enterFirstname(String fname){
        String fname1=fname;
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(fname1);
        System.out.println("First Name is entered as: " + fname1);
    }

    //method for entering lastname
    public void enterLastname(String lname){
        String lname1=lname;
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(lname1);
        System.out.println("Last name is entered as : " + lname1);
    }

   //method for entering phonenumber
    public void enterPhoneNumber(String phone){
       WebElement phoneno= driver.findElement(phoneNumber);
        phoneno.clear();
        phoneno.sendKeys(phone);
    }	

    //Method for entering email id
    public void enterEmail(String email){
        WebElement emailIdentification=driver.findElement(emailId);
        emailIdentification.clear();
        emailIdentification.sendKeys(email);
    }
    
    
  //Method for entering address
    public void enteradddress(String address){
        WebElement Eaddress =driver.findElement(waddress);
        Eaddress.clear();
        Eaddress.sendKeys(address);
    }
    	
    //Method for entering city
    public void entercity(String city){
        WebElement Ecity=driver.findElement(wcity);
        Ecity.clear();
        Ecity.sendKeys(city);
    }
    	
    //Method for entering state
    public void enterstate(String state){
        WebElement estate=driver.findElement(wstate);
        estate.clear();
        estate.sendKeys(state);
        
    }
    
    //Method for entering postal
    public void enterpostal(String state){
        WebElement epostal=driver.findElement(wstate);
        epostal.clear();
        epostal.sendKeys(state);
    }
    
    //method for selecting country
    public void selectcountry(String country){
       
        Select drpCountry = new Select(driver.findElement(wcountry));
    	drpCountry.selectByVisibleText(country);
        
    }
    
    
  //Method for entering username
    public void enterusername(String username){
        WebElement eusername=driver.findElement(wusername);
        eusername.clear();
        eusername.sendKeys(username);
    }
    
    
   //method for enterning password
    public void enterpassword(String password){
        WebElement epassword=driver.findElement(wpassword);
        epassword.clear();
        epassword.sendKeys(password);
        
    }
    
  //method for enterning confirmpassword
    public void enterconfirmpassword(String confirmpassword){
        WebElement econfrmpassword=driver.findElement(wconfirmPassword);
        econfrmpassword.clear();
        econfrmpassword.sendKeys(confirmpassword);
        
    } 
    
  //method for enterning confirmpassword
    public void clickonRegister(){
        WebElement clickregister=driver.findElement(wclickRegister);
        clickregister.click();
    } 
    
}
