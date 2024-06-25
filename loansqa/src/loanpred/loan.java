package loanpred;

import org.testng.annotations.Test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loan {
	//Global Declarations
	public String baseUrl = "http://localhost:3000/login";
	String driverPath = "C:\\Users\\Acer\\eclipse-workspace\\loansqa\\ResourceFiles\\ChromeDriver\\118v.exe";
	public WebDriver driver;
		  
	@BeforeTest
	public void launchBrowser()
	{
	  System.out.println("launching chrome");
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(baseUrl);
	}
	
	@Test(priority=1) 
	public void InvalidLogin() throws InterruptedException
	{
		Thread.sleep(1000);
		
		//Identify web elements
		System.out.println("testing if user can login with incorrect username and password");
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("su@gmail.com");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("1234");
		Thread.sleep(1000);
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/form/div[3]/button"));
		login.click();
		Thread.sleep(1000);
	}
	@Test(priority=2)
	public void NotRegisterdLink() throws InterruptedException
	{   
		System.out.println("testing the not registered link in login page");
		Thread.sleep(1000);
		driver.findElement (By.linkText("Not Registered yet?")).click();
		System.out.println("link clicked");
		
		//Validation
	    String expectedUrl = "http://localhost:3000/register";
	    String actualUrl = driver.getCurrentUrl();
	    Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	
	
}