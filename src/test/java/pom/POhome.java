package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import methods.generic;

public class POhome extends generic{

	public static List<WebElement> polstitems(){
		List<WebElement> polstitems=driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		return polstitems;
		}
	
	public static WebElement pocart() {
		WebElement pocart=driver.findElement(By.className("shopping_cart_badge"));
		return pocart;
	}
	 
	public static WebElement poremove(){
		
		WebElement poremove=driver.findElement(By.xpath("//button[text()='Remove']"));
		return poremove;
	}
	
}
