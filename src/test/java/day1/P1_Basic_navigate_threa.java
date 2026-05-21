package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_Basic_navigate_threa {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.engineerdiaries.com/selenium");
	Thread.sleep(2000);
	
	}	
}
