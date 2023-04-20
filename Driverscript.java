package ExecutionEngine;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverScript {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		
		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
		chromeOptions.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver();		
		
		driver.get("https://test.vaccineledger.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("dev@statwig.com");
		
		driver.findElement(By.xpath("//button[@class='vl-btn vl-btn-md vl-btn-full vl-btn-primary']")).click();
		
	
		new WebDriverWait(driver, Duration.ofSeconds(9)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='otp0']")));
		
		
		Thread.sleep(10l);
		
		driver.findElement(By.xpath("//input[@id='otp0']")).sendKeys("1");
		Thread.sleep(10l);
		
		driver.findElement(By.xpath("//input[@id='otp1']")).sendKeys("2");
		Thread.sleep(10l);
		
		driver.findElement(By.xpath("//input[@id='otp2']")).sendKeys("3");
		Thread.sleep(10l);
		
		driver.findElement(By.xpath("//input[@id='otp3']")).sendKeys("4");
	
		
	}

	
	

}
