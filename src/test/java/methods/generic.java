package methods;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class generic {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
	public static WebDriver driver;
	//}
	
	public static void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		
	}
	
	public static int countlist(List<WebElement> li) {
		int countli=li.size();
		//System.out.println("Total element displayed = "+countli);
		return countli;
	}
	public static void getscreenshothere() throws IOException {
		
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("//Users//nehasingh//eclipse-workspace//mavenNonbdd//target//screenshot.jpg"));
	}
	
}
