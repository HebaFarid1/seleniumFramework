package herokuApp;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class CheckAndUpload {
	WebDriver driver;

	@Test

	public void CheckCheckboxes6() {

		boolean bothAreChecked = new hero.CheckboxHome(driver).navigate().getFirstCheckBox().getSecondCheckBox();

		Assert.assertTrue(bothAreChecked);

	}

	@Test

	public void uploadFile8() {

		String imageName = "download.jfif";
		String imagePath = System.getProperty("user.dir") + "/Uploads/" + imageName;
		String displayImage = new hero.UploadHome(driver).navigate().chooseFile(imagePath).uploadButton()
				.fileUploadedCorrectly();

		Assert.assertEquals(displayImage, imageName);
//	By message =By.xpath("//h3[text()='File Uploaded!']");

//	String success=driver.findElement(message).getText();

//	Assert.assertEquals(success, "File Uploaded!");

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
