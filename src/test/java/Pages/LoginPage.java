package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.WebDriverFactory;

public class LoginPage extends WebDriverFactory {

	
	@CacheLookup
	@FindBy(xpath="//input[@name='j_username']")
	WebElement username;
	
	@CacheLookup
	@FindBy(name="j_password")
	WebElement pwd;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement signin;
	
	
	public LoginPage()
	{
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
		
	}
	
	
	public void loginmethod() throws InterruptedException {
		
		
		System.out.println("before username");
		boolean flag = username.isDisplayed();
		System.out.println("value of Flag"+flag);
	
		username.click();
		
		
	  
		username.sendKeys("superuser");
		
		System.out.println("After username");
		
		pwd.sendKeys("welcome");
		
	}
	
	public void clickMethod() {
		
		signin.click();
	}

}
