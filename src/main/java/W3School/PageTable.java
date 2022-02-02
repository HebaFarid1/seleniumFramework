package W3School;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class PageTable {
	
	private WebDriver driver;
	
	private By cell = RelativeLocator.with(By.tagName("td")).toRightOf(By.xpath("//td[text()='Ernst Handel']"))
			.below(By.xpath("//th[text()='Country']"));
	
	public PageTable(WebDriver driver) {
		
		this.driver=driver;
	}

	public String getTextOfSpecificElement() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30) );
		
		return driver.findElement(cell).getText();
	}
}
