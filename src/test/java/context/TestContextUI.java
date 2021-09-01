package context;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import utils.ReadConfig;

public class TestContextUI {
	// declare WebDriver and Page object instance variables
	WebDriver driver;
	HomePage homepage;
	LoginPage loginpage;
	ReadConfig readconfig;
	
	// Generate getters and setters for WebDriver and Page object instance variables
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public HomePage getHomepage() {
		return homepage;
	}
	public LoginPage getLoginpage() {
		return loginpage;
	}
	
	public ReadConfig getReadConfig() {
		return readconfig;
	}
	
	
	// Initialise all page objects
	public void initializePageOjects( WebDriver driver) {
		homepage= new HomePage(driver);
		loginpage=new LoginPage(driver);
		 readconfig= new ReadConfig();
		
	}
	

}
