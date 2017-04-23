package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HerdonVa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 1: Open Firefox web browser
		WebDriver driver = new FirefoxDriver();
		// Step 2: Launch Google Website
		driver.get("http://www.google.com");
		// Step 3 Enter Herndon, Va in search Box
		driver.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("Herndon VA");
		// Step 4 Click on search button
		driver.findElement(By.xpath("btnG")).click();
		
		
		
		

	}

}
