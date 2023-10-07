package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) {
		//Launch Chrome
		WebDriver driver = new ChromeDriver();
		
		//go to website
		driver.get("https://www.google.com/");
		
		//maximize my window
		driver.manage().window().maximize();
		
		//identify an element and Type a text to search in google
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		
		// identify an element and click on it
		driver.findElement(By.className("MV3Tnb")).click();
		//closing 
		driver.close();
		

	}

}
