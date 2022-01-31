package hero;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxHome {

	private WebDriver driver;

	private String url = "http://the-internet.herokuapp.com/checkboxes";
	private By checkbox = By.xpath("//input[@type='checkbox'][1]");
	private By checkbox2 = By.xpath("//input[@type='checkbox'][2]");

	public CheckboxHome(WebDriver driver) {

		this.driver = driver;

	}

	public CheckboxHome navigate() {

		driver.navigate().to(url);
		return this;
	}

	public CheckboxHome getFirstCheckBox() {

		driver.findElement(checkbox).click();

		return this;
	}

	public boolean getSecondCheckBox() {

		boolean both1= driver.findElement(checkbox).isSelected();
	boolean both2= driver.findElement(checkbox2).isSelected();
	return both1&&both2;
	}

}
