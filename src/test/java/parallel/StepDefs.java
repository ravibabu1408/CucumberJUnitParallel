package parallel;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import context.TestContextUI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Utils;

public class StepDefs{
	TestContextUI testContextUI;
	
	Scenario scenario;
		
	public StepDefs(TestContextUI testContextUI){
		this.testContextUI=testContextUI;
		
		
	}
	
	
	@Before
	public void setUp(Scenario scenario) {
		this.scenario=scenario;
		
	
						
	  }
	    

	

	
	@After
	public void teardown(Scenario scenario) {
		if (scenario.isFailed()) {
			scenario.attach(getScreenshot(), "image/png", "");
			       
        }
				
		if(testContextUI.getDriver()!=null)
			testContextUI.getDriver().quit();
		
		
		
	}
    
	
	
	
	private byte[] getScreenshot() {
		byte[] screenshot = ((TakesScreenshot) testContextUI.getDriver()).getScreenshotAs(OutputType.BYTES);
		return screenshot;
	}


	@Given("Open {string} browser")
	public void open_chrome_browser(String browser) {
	    // Write code here that turns the phrase above into concrete actions
		WebDriver driver=null;
		driver=Utils.getDriver(browser);
		
		testContextUI.setDriver(driver);
		testContextUI.initializePageOjects(driver);
		String urls=testContextUI.getReadConfig().getApplicationURL();
		System.out.println(urls);
	}
	

	@Given("Launch rediffmail login")
	public void launch_rediffmail_login() {

	  System.out.println("Launch rediffmail url");
	  testContextUI.getDriver().get("https://mail.rediff.com/cgi-bin/login.cgi");
	  //test.log(Status.INFO, "Launch rediffmail url");
	 
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		 System.out.println("Enter user name "+username);
		
		// test.log(Status.INFO, "Enter username as: "+username);
		 testContextUI.getDriver().findElement(By.id("login1")).sendKeys(username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
	  
		System.out.println("Enter Password "+password);
		//test.log(Status.INFO, "Enter Password as: "+password);
		testContextUI.getDriver().findElement(By.id("password")).sendKeys(password);
		
	}

	@When("I Click on login button")
	public void i_click_on_login_button() {
	   
		System.out.println("Click on login button");
		//test.log(Status.INFO, "Click on Signin Button");
		testContextUI.getDriver().findElement(By.name("proceed")).click();
	}

	@Then("I loggged into rediffmail successfully")
	public void i_loggged_into_rediffmail_successfully() {
	   
		System.out.println("logged in successfully");
		//test.log(Status.PASS, "Login is successfull ");
		System.out.println(testContextUI.getDriver().getTitle());
		Assert.assertEquals(testContextUI.getDriver().getTitle(), "Rediffmail");
		
	}
}
