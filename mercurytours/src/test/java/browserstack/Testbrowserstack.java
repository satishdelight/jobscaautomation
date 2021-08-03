package browserstack;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import Util.WebdriverUtil;

	import java.util.concurrent.TimeUnit;

	public class Testbrowserstack {
		
		public static WebDriver driver = null;
		public static String baseURL = "https://www.browserstack.com";

		
		@BeforeMethod
		public static void setup() {
			
			WebdriverUtil.getWebDriver("CHROME");
			
			// maximizing the browser window
			driver.manage().window().maximize();

			// launching the website
			driver.get(baseURL);

			// implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
		
		
		//select the tiles and navigate to that page come back to the main page

		@Test
		public void selectTitlesAndNavigateHomePage_POM_withoutPageFactory() {
			
			homepageBrowserstack homepage = new homepageBrowserstack (driver);
		
			homepage.clickLive();
			homepage.clickbrowserstack();
			
			homepage.clickAutomate();
			homepage.clickbrowserstack();
			
			
			homepage.clickPercy();
			homepage.clickbrowserstack();
			
			homepage.clickAppLive();
			homepage.clickbrowserstack();
			
			homepage.clickAppAutomate();
			homepage.clickbrowserstack();
			
		}

}
