package google;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class googleTasks {
	private WebDriver driver;

	@Test
	public void assertTitle() {

		String title = new pages.Home(driver).navigate().getTitle();

		Assert.assertEquals(title, "Google");
	}

	@Test

	public void getLogo2() {
		boolean getImage = new pages.Home(driver).navigate().getLogoImage();

		Assert.assertTrue(getImage);

	}

	@Test

	public void getFistSearchResult3() {

		String Link = new pages.Home(driver).navigate().getSearch("Selenium WebDriver").getTextFristResult();
		Assert.assertNotEquals(Link, "Selenium - Web Browser Automation");
	}

	@Test

	public void getFourthSearchResult4() {
		String Link = new pages.Home(driver).navigate().getSearch("TestNG").waitToSearch().getTextFourthResult();
		Assert.assertEquals(Link, "TestNG Tutorial - Javatpoint");

	}

	@Test

	public void getSecondPageSecondSearchResult5() {

		String Link = new pages.Home(driver).getSearch("Cucumber IO").waitToSearch().clickPage2().getSearchText();

		Assert.assertEquals(Link, "Cucumber | LinkedIn");

	}

	@BeforeMethod
	public void beforeMethod() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver = new FirefoxDriver();
		// driver.manage().window().maximize();

	}

	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

	@BeforeClass
	public void beforeClass() {

		WebDriverManager.chromedriver().setup();
		// WebDriverManager.firefoxdriver().setup();
	}

	@AfterClass
	public void afterClass() {
	}

}
