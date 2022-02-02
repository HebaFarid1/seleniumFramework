package W3School;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestTable {
	WebDriver driver;
	@Test

	public void getTable7() {
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

		String text = new W3School.PageTable(driver).getTextOfSpecificElement();

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
