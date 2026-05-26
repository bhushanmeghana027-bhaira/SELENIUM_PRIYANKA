package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(5000);
		
		WebElement country = driver.findElement(By.name("country"));
		Select sd = new Select(country);
		
		sd.selectByVisibleText("Russia");
		Thread.sleep(2000);
		sd.selectByValue("china");
		Thread.sleep(2000);
		sd.selectByIndex(12);
		Thread.sleep(2000);
		driver.close();
	}
}
