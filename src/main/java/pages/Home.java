package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Home {
	
	private WebDriver driver;
	private String url="https://www.google.com/ncr";
	private By googleImage = By.xpath("//img[@alt='Google']");
	private By googleText = By.xpath("//input[@name='q']");
	
	
	public Home(WebDriver driver)
	{	
	
	this.driver=driver;
	}
	
	public Home navigate() {
		
		driver.navigate().to(url);
		return this;
	}
	
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public boolean getLogoImage() {
		
		return driver.findElement(googleImage).isDisplayed();
	}
	
	public pages.Result getSearch(String searchWord) {
		
	driver.findElement(googleText).sendKeys(searchWord+Keys.ENTER);
		
	return new pages.Result(driver);
	}
	

}
