package test;

import java.io.IOException;
import java.util.Set;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import methods.generic;
import utilities.propertiesfile;

public class OpenNewtab extends generic {
	@Test
	public void main() throws IOException, InterruptedException {
		// launch browser
		try {
			generic.launchbrowser();
			String appurl = propertiesfile.getProperty("url");
			driver.get(appurl);

			String parent = driver.getWindowHandle();
			System.out.println("parent:" + parent);

			WebDriver newtab = driver.switchTo().newWindow(WindowType.TAB);

			String child = newtab.getWindowHandle();
			System.out.println("child:" + child);

			newtab.get("https://jqueryui.com/droppable/");
			Thread.sleep(4000);
			generic.getscreenshothere();

			driver.switchTo().window(parent);
			System.out.println("switched to parent");
			Set<String> str = driver.getWindowHandles();
			int count = str.size();
			System.out.println("count: " + count);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	@AfterClass
	public static void message() {
		System.out.println("driver close");
		driver.quit();

	}

}