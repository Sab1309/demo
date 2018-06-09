package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='u_0_j']")).sendKeys("Swati");
		driver.findElement(By.name("lastname")).sendKeys("Bhalerao");
		
		driver.findElement(By.name("reg_email__")).sendKeys("9834295835");
		driver.findElement(By.name("reg_passwd__")).sendKeys("1234567");
		
		Select day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByIndex(13);
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("9");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1993");
		
		WebElement gender = driver.findElement(By.xpath("//*[@id='u_0_9']"));
		gender.click();
		
		driver.findElement(By.name("websubmit")).click();
	}

}
