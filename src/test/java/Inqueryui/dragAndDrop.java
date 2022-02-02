package Inqueryui;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class dragAndDrop {

	WebDriver driver;

	@Test

	public void dragAndDrop9() {

		String displayValue = new Inquery.dragDrop(driver).navigate().performDragDropAndGetText();

		Assert.assertEquals(displayValue, "Dropped!");

	}

	@BeforeMethod
	public void beforeMethod() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

	@BeforeClass
	public void beforeClass() {

		WebDriverManager.chromedriver().setup();
	}

}
