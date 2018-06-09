package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ToolsQaForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "G:\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Partial")).click();
		System.out.println("partial link test passed");
		
		driver.findElement(By.linkText("Link Test")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.name("firstname")).sendKeys("swati");
		driver.findElement(By.name("lastname")).sendKeys("bhalerao");
		
		WebElement radiobutton1 = driver.findElement(By.id("sex-0"));
		radiobutton1.click();
		
		WebElement exp1 = driver.findElement(By.id("exp-0"));
		exp1.click();
		
		driver.findElement(By.id("datepicker")).sendKeys("08/06/2018");
		
		WebElement profession1 = driver.findElement(By.id("profession-0"));
		profession1.click();
		
		WebElement profession2 = driver.findElement(By.id("profession-1"));
		profession2.click();
		
		WebElement upload = driver.findElement(By.id("photo"));
		upload.sendKeys("F:\\demo.png");
		System.out.println("file upload is successful");
		
		WebElement tool1 = driver.findElement(By.id("tool-1"));
		tool1.click();
		WebElement tool2 = driver.findElement(By.id("tool-2"));
		tool2.click();
		
		Select abc = new Select(driver.findElement(By.id("continents")));
		//abc.selectByIndex(4);
		abc.selectByVisibleText("South America");
		

		
		
		
		

	}

}
