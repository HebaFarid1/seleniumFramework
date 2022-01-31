package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Result {

	private WebDriver driver;
	private By searchFirst = By
			.xpath("//h3[contains(.,'What is Selenium Web Driver? Definition of Selenium Web ...')]");
	private By searchFourth = By.xpath("//h3[contains(.,'TestNG Tutorial - Javatpoint')]");
	private By page2 = By.xpath("//a[@aria-label='Page 2']");

	public Result(WebDriver driver) {

		this.driver = driver;

	}

	public String getTextFristResult() {

		return driver.findElement(searchFirst).getText();
	}

	public Result waitToSearch() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		return this;

	}

	public String getTextFourthResult() {

		return driver.findElement(searchFourth).getText();
	}

	public pages.Result2 clickPage2() {

		driver.findElement(page2).click();

		return new pages.Result2(driver);

	}
}
