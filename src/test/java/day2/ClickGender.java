package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickGender {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.get("https://www.engineerdiaries.com/selenium");
		
		Thread.sleep(5000);
//		List<WebElement> genderList = driver.findElements(By.name("gender"));
//		genderList.get(1).click();
		
//		click on alll programing language

//		driver.switchTo().frame(0);
		List<WebElement> planguages = driver.findElements(By.name("programmingLang"));
		int h = planguages.size();
		System.out.println(h);
		for(WebElement p:planguages) {
			
			p.click();
			Thread.sleep(2000);
			
			
		}
		driver.close();
		
	}
}
