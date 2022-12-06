package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import methods.generic;

public class PODragAndDrop extends generic{

	
	public static WebElement podrag(){
		WebElement podrag=driver.findElement(By.id("draggable"));
		return podrag;
		}
	public static WebElement podrop(){
		WebElement podrop=driver.findElement(By.id("droppable"));
		return podrop;
		}

	
}
