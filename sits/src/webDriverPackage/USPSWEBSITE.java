package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class USPSWEBSITE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Step 1: Open Firefox web browser
		// This code executes the Firefox browser
		WebDriver driver = new FirefoxDriver();
		// Step 2: Launch USPS Website
		driver.get("https://www.usps.com/");
		// Step 3: Click on Quick Tools
		driver.findElement(By.xpath(".//*[@id='global-menu']/div/nav/ol/li[2]/a/span")).click();
		// Step 4: Click on Find USPS Location
		driver.findElement(By.xpath(".//*[@id='shortcuts-menu']/div[1]/div[3]/div[3]/a")).click();
		// Step 5; Enter Zip code 20878
		Thread.sleep(5000);		
		driver.findElement(By.xpath(".//*[@id='tCityStateZip']")).sendKeys("20878");
		// Step 6: Click Search
		driver.findElement(By.xpath(".//*[@id='bSearch']")).click();
		
		

	}

}
