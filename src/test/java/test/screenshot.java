package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import methods.generic;
import pom.POhome;
import pom.POlogin;
import utilities.propertiesfile;

public class screenshot extends generic{

	//public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	@Test
	public void main() throws IOException{
//launch browser
		generic.launchbrowser();
		String appurl = propertiesfile.getProperty("url");
		driver.get(appurl);

		// enter credentials and login
		String username = propertiesfile.getProperty("username");
		String password = propertiesfile.getProperty("password");
		methods.login.enterlogincredentials(username, password);
		POlogin.getlogin().click();

		// take screenshot
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("//Users//nehasingh//eclipse-workspace//mavenNonbdd//target/screenshot.jpg"));
		
	}
	@AfterClass
	public static void message() {
		System.out.println("driver close");
		driver.quit();
		
	}

}
