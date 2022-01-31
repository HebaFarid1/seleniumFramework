package hero;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadCorrect {
	
	private WebDriver driver;
	
	private By FileName= By.id("uploaded-files");
	
	public UploadCorrect(WebDriver driver)
	{
             this.driver=driver;
}
	public String fileUploadedCorrectly() {
		
		return driver.findElement(FileName).getText();
	}
	
}
