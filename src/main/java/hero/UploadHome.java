package hero;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadHome {
	
	private WebDriver driver;
	
	private String url="http://the-internet.herokuapp.com/upload";
	private By chooseFile = By.xpath("//input[@name='file']");
	private By uploadbutton = By.xpath("//input[@type='submit']");
public UploadHome(WebDriver driver) {
	
	this.driver=driver;
	
}

public UploadHome navigate()
{
	driver.navigate().to(url);
	
	return this;
}

public UploadHome chooseFile(String path) {
	
	driver.findElement(chooseFile).sendKeys(path);
	return this;
	
}

public UploadCorrect uploadButton() {
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(uploadbutton).click();
	
	return new hero.UploadCorrect(driver);
	

	
}

}
