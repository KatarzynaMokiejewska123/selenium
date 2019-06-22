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
import PageObject.ReservationPage;
import PageObject.ReservationPage2;

@Ignore
public class MainMenuTest {

	WebDriver driver;
	MainPage mp=new MainPage();	
	LoginPage lp = new LoginPage();
	ReservationPage rp= new ReservationPage();
	ReservationPage2 rp2=new ReservationPage2();


	@Before
	public void start() {
		System.out.println("wewnatrz megtody start - @before");
		driver = Init.getDriver();
	}

	//@Ignore
	@Test
	public void mainMenu() {
	System.out.println("start testu mainMenu, przed new MP");	
	
	System.out.println("PO new MP przed contact CLICK");	
	
		String title = driver.getTitle();
		System.out.println(title);
		
		mp.contactLinkClick();
		mp.registerLinkClick();
		mp.supportLinkClick();
		mp.singOnLinkClick();
		
		title = driver.getTitle();
		System.out.println(title);
		Init.printScr(driver, "mainMenu", "testName");
		
		Init.sleep(1);
	}

	@Ignore
	@Test
	public void login() {
		String title=driver.getTitle();
		System.out.println(title);
		
		mp.singOnLinkClick();
		lp.loginAs("admdz", "qwe123");
		
		title=driver.getTitle();
		System.out.println(title);
		Init.sleep(5);

		Assert.assertTrue("Page title is wrong", title.equals("Find a Flight: Mercury Tours:"));
	}
    @Ignore
	@Test
	public void reservationTest() {
		mp.singOnLinkClick();
		lp.loginAs("admdz", "qwe123");
		rp.passengersCount("2");
		rp.from("Frankfurt", "17", "5");
		rp.to("London", "19", "6");
		rp.airline("Blue Skies Airlines");
		rp.serviceBusinesClass();
		rp.continueButtonClick();
		rp2.pass0("Kasia", "Aaa");
		rp2.continueBtnclick();
		
	}
	
	@After
	public void quit() {
		Init.close();
	}

}