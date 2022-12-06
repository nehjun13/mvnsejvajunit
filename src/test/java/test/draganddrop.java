package test;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;

import methods.generic;
import pom.PODragAndDrop;
import utilities.propertiesfile;

public class draganddrop extends generic {

	@Test
	public void test() {
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launch browser
		generic.launchbrowser();
		String appurl = propertiesfile.getProperty("draganddropurl");
		driver.get(appurl);
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		act.dragAndDrop(PODragAndDrop.podrag(), PODragAndDrop.podrop()).build().perform();

	}
	@AfterClass
	public static void message() {
		System.out.println("driver close");
		driver.quit();
		
	}
}
