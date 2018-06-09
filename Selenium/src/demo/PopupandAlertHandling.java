package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupandAlertHandling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("23");
		
		driver.findElement(By.name("submit")).click();
		
		//switching to alert
		Alert alert = driver.switchTo().alert();
		
		//capturing alert message
		String alertmsg = driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		Thread.sleep(5000);
		
		//Accepting alert
		alert.accept();
		
		String alertmsg2 = driver.switchTo().alert().getText();
		System.out.println(alertmsg2);
		Thread.sleep(5000);
		
		//Accepting alert
		alert.accept();
		
		
		
		

	}

}
