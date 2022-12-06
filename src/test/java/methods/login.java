package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.propertiesfile;

public class login {
	
	
	
public void	geturl() {
	WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		//String strurl=propertiesfile.getProperty(url);
	}

public static void enterlogincredentials(String usrnme, String pswrd) {
pom.POlogin.getusername().sendKeys(usrnme);
pom.POlogin.getpassword().sendKeys(pswrd);

}

}
