package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverUtil {
	public static WebDriver getWebDriver(String browser) {
		  WebDriver driver=null;

		switch (browser) {
		case "CHROME":
			String chromeDriverPath = "/mercurytours/drivers/chromedriver 6";
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
			break;

		case "FIREFOX":
			String firefoxDriverPath = "/Users/satishtamilselvan/eclipse-workspace/mercurytours/drivers/geckodriver 6";			
			System.setProperty("webdriver.gecko.driver", firefoxDriverPath);	
			
			driver = new FirefoxDriver();
			break;

		case "EDGE":
			String edgeDriverPath = "C:\\drivers\\edgedriver-v0.29.1-win32\\edgedriver.exe";
			System.setProperty("webdriver.edge.driver", edgeDriverPath);
			driver = new FirefoxDriver();
			break;

		case "IE":
			String ieDriverPath = "C:\\drivers\\edgedriver-v0.29.1-win32\\edgedriver.exe";
			System.setProperty("webdriver.ie.driver", ieDriverPath);
			driver = new FirefoxDriver();
			break;

		case "SAFARI":
			String safariDriverPath = "C:\\drivers\\edgedriver-v0.29.1-win32\\edgedriver.exe";
			System.setProperty("webdriver.safari.driver", safariDriverPath);
			driver = new FirefoxDriver();
			break;
		}
		return driver;
	}
}
