package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PHPTRAVELS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// The int and while lines controls the while loops for the tests
		int x=1;
		
		while (x<20) {
			
	
		
		// Open Firefox web browser
		WebDriver driver = new FirefoxDriver();
		// Launch PHP TRAVELS Website
		driver.get("http://phptravels.net/");
		
		// This option maximizes the browser window when the script is running
		driver.manage().window().maximize();
		
		// Click on My Account
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a")).click();
		// Click on Sign Up link
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a")).click();
		// Enter First name
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[3]/input")).sendKeys("Mehraj");
		// Enter Last Name
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[4]/input")).sendKeys("Hussain");
		// Enter Phone Number
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[5]/input")).sendKeys("301-098-0987");
		// Enter email address 
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[6]/input")).sendKeys("bengali862@yahoo.com");
		
		
		
		
		/*
		// This code changes the email every run
		// The int is associated with one test run, x==10 will run the if statement, x==11 will run the else statement
		
		int x=10;
		if (x==10) {
			// Enter Email Address
			driver.findElement(By.xpath(".//*[@id='headersignupform']/div[6]/input")).sendKeys("bengali862@yahoo.com");
		}
		else {
			driver.findElement(By.xpath(".//*[@id='headersignupform']/div[6]/input")).sendKeys("Trueman862@yahoo.com");
		}
		*/
		
		// Register 10 accounts with Tester2000@gmail.com to Tester2010@gmail.com
		
		
		// Enter Password
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[7]/input")).sendKeys("youaretheone");
		// Enter Confirm Password
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[8]/input")).sendKeys("youaretheone");
		// Click on Sign Up button
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[9]/button")).click();
		
		// This code runs the browser in seconds (2000 = 2 seconds)
		Thread.sleep(2000);
		
		// Click on My Account
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a")).click();
		// Click on Logout Button
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a")).click();
		// This option closes the browser after the script is finished running
		driver.close();
		
		x=x+1;
		}
		
	}

}
