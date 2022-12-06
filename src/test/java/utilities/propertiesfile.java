package utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class propertiesfile {
	//Create a object for class properties 
	 static Properties prop = new Properties();
	 
	 public static void main(String[] args) {
		 getProperties();
		 //  setProperties();
		   //getProperties();
		 }	
	 public static void getProperties() {
		 try {
			//create a object for class InputStream
			   InputStream input = new FileInputStream("/Users/nehasingh/eclipse-workspace/mavenNonbdd/src/test/java/utilities/properties.properties");
			   //Load properties file
			   prop.load(input);
			 //get values from properties file
			   String browser = prop.getProperty("browser");
			   System.out.println(browser);
		 } catch (Exception exp) {
			 System.out.println(exp.getMessage());
			//    System.out.println(exp.getCause());
			//    exp.printStackTrace();
			 }
	 }
		 public static String getProperty(String property) {
			 try {
				//create a object for class InputStream
				   InputStream input = new FileInputStream("/Users/nehasingh/eclipse-workspace/mavenNonbdd/src/test/java/utilities/properties.properties");
				   //Load properties file
				   prop.load(input);
				 //get values from properties file
				    property = prop.getProperty(property);
				   System.out.println(property);
			 } catch (Exception exp) {
				 System.out.println(exp.getMessage());
				//    System.out.println(exp.getCause());
				//    exp.printStackTrace();
				 }
			return property;
	 }
}
