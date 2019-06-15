package pl.lait.selenium;

import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PageObject.LoginPage;
import PageObject.MainPage;

public class MainMenuTest {

	WebDriver driver;

	@Before
	public void start() {
		System.out.println("wewnatrz megtody start - @before");
		driver = Init.getDriver();
	}

	@Test
	public void mainMenu() {
	System.out.println("start testu mainMenu, przed new MP");	
	MainPage mp=new MainPage();
	System.out.println("PO new MP przed contact CLICK");	
	
		String title = driver.getTitle();
		System.out.println(title);
		
		mp.contactLinkClick();
		mp.registerLinkClick();
		mp.supportLinkClick();
		mp.singOnLinkClick();
		
		title = driver.getTitle();
		System.out.println(title);
		
		Init.sleep(1);
	}

	@Test
	public void login() {
		String title=driver.getTitle();
		System.out.println(title);
		
		LoginPage lp = new LoginPage();
		MainPage mp = new MainPage();
		
		mp.singOnLinkClick();
		lp.loginAs("admdz", "qwe123");
		
		title=driver.getTitle();
		System.out.println(title);
		Init.sleep(5);

		Assert.assertTrue("Page title is wrong", title.equals("Find a Flight: Mercury Tours:"));
	}

	@After
	public void quit() {
		Init.close();
	}

}