package pl.lait.selenium;

import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MainMenuTest {
	
	
	WebDriver driver;
	
	@Before
	public void start() {
		driver = Init.getDriver();
	}
	
	@Test
	public void mainMenu() {
		//WebElemnt contactLink;
		//contactLink.driver.findElement(By.LinkText("CONTACT"));
		//contact.
		
		
		driver.findElement(By.linkText("CONTACT")).click();
		Init.sleep(1);
		driver.findElement(By.linkText("SUPPORT")).click();
		Init.sleep(1);
		driver.findElement(By.linkText("REGISTER")).click();
		Init.sleep(1);
		driver.findElement(By.linkText("SIGN-ON")).click();
		Init.sleep(1);
	}

	@Test
	public void login() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("admdz");
		driver.findElement(By.name("password")).sendKeys("qwe123");
		Init.sleep(2);
		driver.findElement(By.name("login")).click();
		Init.sleep(2);
		
		String oneWayXpath = "/html/body/div/table/tbody/tr/"
				+ "td[2]/table/tbody/tr[4]/td/table/tbody/tr/"
				+ "td[2]/table/tbody/tr[5]/td/form/table/tbody/"
				+ "tr[2]/td[2]/b/font/input[2]";
	
		
		driver.findElement(By.xpath(oneWayXpath)).click(); // stworzona zmienna WebElement
		
		WebElement passSelect = driver.findElement(By.name("passCount"));
		Select pass = new Select(passSelect);
		pass.selectByValue("2");
		
		//fromPort
		WebElement fromPortSelectWebElem = driver.findElement(By.name("fromPort"));
		Select fromPortSelect = new Select(fromPortSelectWebElem);
		fromPortSelect.selectByValue("Frankfurt");
		//fromMonth
		WebElement fromMonthSelectWebElem = driver.findElement(By.name("fromMonth"));
		Select fromMonthSelect = new Select(fromMonthSelectWebElem);
		fromMonthSelect.selectByValue("7");
		//fromDay
		WebElement fromDaySelectWebElem = driver.findElement(By.name("fromDay"));
		Select fromDaySelect = new Select(fromDaySelectWebElem);
		fromDaySelect.selectByValue("15");
		
		//toPort
		WebElement toPortSelectWebElem = driver.findElement(By.name("toPort"));
		Select toPortSelect = new Select(toPortSelectWebElem);
		toPortSelect.selectByValue("Frankfurt");
		//toMonth
		WebElement toMonthSelectWebElem = driver.findElement(By.name("toMonth"));
		Select toMonthSelect = new Select(toMonthSelectWebElem);
		toMonthSelect.selectByValue("8");
		//toDay
		WebElement toDaySelectWebElem = driver.findElement(By.name("toDay"));
		Select toDaySelect = new Select(toDaySelectWebElem);
		toDaySelect.selectByValue("17");
		
		//airline
		WebElement airlineWebElem = driver.findElement(By.name("airline"));
		Select airline = new Select(airlineWebElem);
		airline.selectByVisibleText("Blue Skies Airlines");
		
		String serviceXpath = "/html/body/div/table/tbody/"
				+ "tr/td[2]/table/tbody/tr[4]/td/table/"
				+ "tbody/tr/td[2]/table/tbody/tr[5]/td/"
				+ "form/table/tbody/tr[9]/td[2]/font/font/input[1]";
		driver.findElement(By.xpath(serviceXpath)).click();
		
		Init.sleep(5);
		
		
	}
	
	@After
	public void quit() {
		Init.close();
	}
	
}