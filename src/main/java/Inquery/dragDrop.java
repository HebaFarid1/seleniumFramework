package Inquery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class dragDrop {
	
	private WebDriver driver;
	private String url ="https://jqueryui.com/resources/demos/droppable/default.html";
	private By source = By.id("draggable");

	private By target = By.id("droppable");
	
	public dragDrop(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public dragDrop navigate() {
		
		driver.navigate().to(url);
		
		return this;
	}
	
	public String performDragDropAndGetText() {
	
	Actions builder = new Actions(driver);
	builder.dragAndDrop(driver.findElement(source), driver.findElement(target)).perform();
	
	return driver.findElement(target).getText();
	}

}
