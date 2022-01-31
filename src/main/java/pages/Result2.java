package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Result2 {
	
	 private By search = By.xpath("//h3[contains(.,'Cucumber | LinkedIn')]");
	
	private WebDriver driver;
	
	
	public Result2(WebDriver driver) {
		
		this.driver=driver;
	}
 public String getSearchText() {
	  
	 return driver.findElement(search).getText();
 }
	
}
