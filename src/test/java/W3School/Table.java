package W3School;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Table {
	WebDriver driver;
	@Test

	public void getTable7() {
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		By cell = RelativeLocator.with(By.tagName("td")).toRightOf(By.xpath("//td[text()='Ernst Handel']"))
				.below(By.xpath("//th[text()='Country']"));

		String text = driver.findElement(cell).getText();

		Assert.assertEquals(text, "Austria");

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
