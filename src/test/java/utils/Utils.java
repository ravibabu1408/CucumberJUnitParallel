package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utils {
	
	
	public static WebDriver getDriver(String browser) {
		WebDriver driver=null;
		if( browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if ( browser.equals("firefox")) {
			 System.setProperty("webdriver.gecko.driver","./Driver/chromedriver.exe");
			 driver=new FirefoxDriver();
		}
		else if (browser.equals("IE")) {
            System.setProperty("webdriver.IEDriverServer.driver", "./Driver/chromedriver.exe");
            driver = new FirefoxDriver();
        }
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		return driver;
	}

}
