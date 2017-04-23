package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newtoursjavaclass {

	public static void main(String[] args) {
		// Open Firefox web browser
		WebDriver driver = new FirefoxDriver();
		// Launch Mercury website
		driver.get("http://newtours.demoaut.com/");
		// Print the title of the page
		driver.getTitle();
		// Print
		System.out.println(driver.getTitle());
		// Click on Register Link
		driver.findElement(By.linkText("REGISTER")).click();
		// Enter First Name
		driver.findElement(By.name("firstName")).sendKeys("Mehraj");
		// Enter Last Name
		driver.findElement(By.name("lastName")).sendKeys("Hussain");
		// Enter Phone Number
		driver.findElement(By.name("phone")).sendKeys("301-098-0987");
		// Enter Email Address
		driver.findElement(By.name("userName")).sendKeys("mehraj.u.hussain@gmail.com");
		// Enter Address
		driver.findElement(By.name("address1")).sendKeys("5811 33rd place");
		// Enter City
		driver.findElement(By.name("city")).sendKeys("Hyattsville");
		// Enter State/Province
		driver.findElement(By.name("state")).sendKeys("Maryland");
		// Enter Postal Code
		driver.findElement(By.name("postalCode")).sendKeys("20782");
		// Enter Username
		driver.findElement(By.name("email")).sendKeys("Youaretheone");
		// Enter Password
		driver.findElement(By.name("password")).sendKeys("youaretheone");
		// Enter Confirm Password
		driver.findElement(By.name("confirmPassword")).sendKeys("youaretheone");
		// Click on Register Link
		driver.findElement(By.name("register")).click();
		driver.close();
		
		
		
		
		
		
		
		
	}

}
