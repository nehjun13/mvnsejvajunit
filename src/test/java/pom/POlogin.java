package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import methods.generic;

public class POlogin extends generic{
		
	public static WebElement getusername() {
		WebElement pousername= driver.findElement(By.id("user-name"));
		return pousername;
	}
	public static WebElement getpassword() {
		WebElement popassword= driver.findElement(By.id("password"));
		return popassword;
	}
	
	public static WebElement getlogin() {
		WebElement pologin=driver.findElement(By.id("login-button"));
		return pologin;
	}

}