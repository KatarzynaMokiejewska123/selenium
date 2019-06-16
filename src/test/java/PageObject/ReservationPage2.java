package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import pl.lait.selenium.Init;

public class ReservationPage2 {
	
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[7]/td[1]/input")
	WebElement radio3;
	
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[5]/td[1]/input")
	WebElement radio6;

    @FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/p/input")
    WebElement continueBtn;
    
    @FindBy(xpath="passFirst0")
    WebElement passFirst0;
    
    @FindBy(xpath="passLast0")
    WebElement passLast0;
    
    @FindBy(xpath="buyFlights")
    WebElement purchase;
	
	public void ReservationPage2() {
		driver=Init.getDriver();
		PageFactory.initElements(driver, this);		
	}
	
	public void radio3click() {
		radio3.click();
		Init.sleep(5);
	}
	
	public void radio6click(){
		radio6.click();
		Init.sleep(5);
	}
	
	public void continueBtnclick(){
		continueBtn.click();
		Init.sleep(5);
	}
	
	public void pass0(String first, String last){
		passFirst0.sendKeys(first);
		passLast0.sendKeys(last);
		Init.sleep(5);
		}
	public void purchase() {
		purchase.click();
		Init.sleep(5);
	}

}
