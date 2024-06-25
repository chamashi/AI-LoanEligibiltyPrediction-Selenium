package loanpred;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class register {
	//Global Declarations
	public String baseUrl = "http://localhost:3000/";
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
	public void ValidReg() throws InterruptedException
	{
		Thread.sleep(3000);
				
		//Identify web elements-user login without entering credintials
		System.out.println("testing if user can click on signin btn and sign in");
		WebElement signbtn = driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[2]/a"));
		signbtn.click();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("suga@gmail.com");
	
		WebElement name = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		name.sendKeys("oh suga");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("123456");
		
		WebElement cpassword = driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]"));
		cpassword.sendKeys("123456");
		
		WebElement signin = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/form/div[5]/button"));
		signin.click();
   	    Thread.sleep(2000);	
	}
	@Test(priority=2) // testing with valid username and password
	public void ValidLogin() throws InterruptedException
	{
		Thread.sleep(1000);
		
		//Identify web elements
		System.out.println("testing if user can login with correct username and correct password");
		WebElement lognavbtn = driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[2]/a"));
		lognavbtn.click();
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("suga@gmail.com");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("123456");
		Thread.sleep(1000);
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/form/div[3]/button"));
		login.click();
		Thread.sleep(1000);
	}
}