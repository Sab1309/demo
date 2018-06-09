package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
	public static void main(String[] args) {
		
		//Set the path for chromedriver
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver\\chromedriver.exe");
		
		//Create chromedriver object
		WebDriver driver = new ChromeDriver();

		
		//Open url using get method
		driver.get("https://www.google.com");
		
		//get title of website
		String title = driver.getTitle();
		System.out.println(title);
		
		//displays current url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//close the browser
		driver.close();
		
		
		}

}
