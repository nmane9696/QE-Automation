package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.WebDriverFactory;

public class HomePage extends WebDriverFactory {
	
	
	@CacheLookup
	@FindBy(xpath="//span[contains(text(),'Admin')]")
	WebElement admintab;
	
	public HomePage() {
		
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
				
	}
	
	public void getAdmintab() {
		
		admintab.click();
	}
	
	
}
