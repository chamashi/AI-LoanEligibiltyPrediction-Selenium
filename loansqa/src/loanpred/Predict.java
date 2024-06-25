package loanpred;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Predict {
	//Global Declarations
	public String baseUrl = "http://localhost:3000/loanform";
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
	public void Prediction() throws InterruptedException
	{
		Thread.sleep(1000);
		Select gender = new Select (driver.findElement(By.name("Gender")));
		gender.selectByVisibleText("Male");
		
		Select married = new Select (driver.findElement(By.name("Married")));
		married.selectByVisibleText("Yes");
		
		Select dep = new Select (driver.findElement(By.name("Dependents")));
		dep.selectByVisibleText("0");
		
		Select education = new Select (driver.findElement(By.name("Education")));
		education.selectByVisibleText("Graduate");
		
		Select emp = new Select (driver.findElement(By.name("Self_Employed")));
		emp.selectByVisibleText("No");
		
		Select credit = new Select (driver.findElement(By.name("Credit_History")));
		credit.selectByVisibleText("1");
		
		WebElement income = driver.findElement(By.id("ApplicantIncome"));
		income.sendKeys("850000");
		
		WebElement coincome = driver.findElement(By.id("CoapplicantIncome"));
		coincome.sendKeys("0");
		
		WebElement amount = driver.findElement(By.id("LoanAmount"));
		amount.sendKeys("350000");
		
		WebElement term = driver.findElement(By.id("Loan_Amount_Term"));
		term.sendKeys("36");
		
		Select property = new Select (driver.findElement(By.name("Property_Area")));
		property.selectByVisibleText("Semiurban");
		
		WebElement predictbtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/form/div[7]/button[1]"));
		predictbtn.click();
		
		
	}
}