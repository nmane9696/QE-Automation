package Pages;

import common.WebDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.internal.PropertyUtils


public class SearchPage extends WebDriverFactory {

	@CacheLookup
	@FindBy(xpath="//*[@id=\"lst-ib\"]")
	WebElement Domain;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"lst-ib\"]")
	WebElement searchbutton;
	
	public SearchPage()
	{
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
		
	}
	
	
	public void searchmethod() {
		
		Domain.sendKeys("Java Selenium");
		
	}
	
	public void clickMethod() {
		
		searchbutton.click();
	}
}
