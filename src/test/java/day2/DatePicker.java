package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	 public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			
			driver.get("https://www.engineerdiaries.com/selenium");
			Thread.sleep(5000);
			driver.findElement(By.tagName("textarea")).sendKeys("today is monday");
			driver.findElement(By.id("date")).sendKeys("25-01-2025");
	}
}
