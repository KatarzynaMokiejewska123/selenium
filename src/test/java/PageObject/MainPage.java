package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.lait.selenium.Init;

public class MainPage {
	
	WebDriver driver;
	
	@FindBy(linkText = "CONTACT")
	WebElement contactLink;
	
	@FindBy(linkText = "REGISTER")
	WebElement registerLink;
	
	@FindBy(linkText = "SIGN-ON")
	WebElement singOnLink;
	
	@FindBy(linkText = "SUPPORT")
	WebElement supportLink;
	
	
	public MainPage() {
		
		driver=Init.getDriver();
		PageFactory.initElements(driver, this);		// mechanizm ktory zainicjalizuje wszystkie guziki na stronie którą przedstawia klasa MainPage
		
		
	}
	
	public void contactLinkClick() {
		contactLink.click();
	}
	
	public void registerLinkClick() {
		registerLink.click();
	}
	public void singOnLinkClick() {
		singOnLink.click();
	}
	public void supportLinkClick() {
		supportLink.click();
	}
	
}
