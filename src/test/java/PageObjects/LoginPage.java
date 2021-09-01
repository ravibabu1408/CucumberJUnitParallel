package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id="login_id")
	public WebElement emailAddress;
	
	@FindBy(id="nextbtn")
	private WebElement nextButton;
	
	@FindBy(id="password")
	private WebElement password;
	
	
	public LoginPage (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ennteremail(String email) {
		emailAddress.sendKeys(email);
	}
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickOnNextButton() {
		nextButton.click();
	}

	public boolean isElementEnabled(WebElement element) {
		
		if(element.isEnabled()) return true;
		else return false;
	}
}
