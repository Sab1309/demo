package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemoCLASS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Partial")).click();
		
		driver.findElement(By.linkText("Link Test")).click();
		driver.navigate().back();
		
		driver.findElement(By.name("firstname")).sendKeys("swati");
		driver.findElement(By.name("lastname")).sendKeys("bhalerao");
		
		System.out.println("git test");
		
		

	}

}
