package Inqueryui;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class dragAndDrop {
	
	WebDriver driver;
	@Test

	public void dragAndDrop9() {
		driver.navigate().to("https://jqueryui.com/resources/demos/droppable/default.html");

		By source = By.id("draggable");

		By target = By.id("droppable");
		Actions builder = new Actions(driver);
		builder.dragAndDrop(driver.findElement(source), driver.findElement(target)).perform();

		String displayValue = driver.findElement(target).getText();

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
