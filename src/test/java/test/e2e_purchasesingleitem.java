package test;

import java.util.Random;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import methods.generic;
import pom.POhome;
import pom.POlogin;
import utilities.propertiesfile;

public class e2e_purchasesingleitem extends generic {
@Test
	public void main() throws InterruptedException {
	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// launch browser
		generic.launchbrowser();
		String appurl = propertiesfile.getProperty("url");
		driver.get(appurl);

		// enter credentials and login
		String username = propertiesfile.getProperty("username");
		String password = propertiesfile.getProperty("password");
		methods.login.enterlogincredentials(username, password);
		POlogin.getlogin().click();

		// count total number of element displayed
		int count = countlist(POhome.polstitems());
		System.out.println("Total number of items displayed = " + count);

		// pick a random item
		int min = 1;
		int max = count;
		int ramdom_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
		System.out.println("random = " + ramdom_int);
		
		//click on an item
		WebElement randomitem=driver.findElement(By.xpath("//div[@class='inventory_list']/div["+ramdom_int+"]//button"));
		String buttontext = randomitem.getText();
		System.out.println("text on the item = "+buttontext);
		randomitem.click();
		Thread.sleep(4000);
		//validate remove button is displayed on selection
		String buttontext2 = POhome.poremove().getText();
		System.out.println("text on the item = "+buttontext2);
		
		//scroll to the cart
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", POhome.pocart());
		Thread.sleep(2000);
		POhome.pocart().click();
		
	}
@AfterClass
public static void message() {
	System.out.println("driver close");
	driver.quit();
	
}

}
