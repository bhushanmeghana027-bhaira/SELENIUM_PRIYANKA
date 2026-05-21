package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_basiclocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.engineerdiaries.com/selenium");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement ip = driver.findElement(By.id("input_text"));
		ip.clear();
		Thread.sleep(5000);
		ip.sendKeys("Java");
		Thread.sleep(5000);
		driver.close();
	}

}
