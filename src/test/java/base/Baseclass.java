package base;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Baseclass {
	public static WebDriver driver;
	
	@BeforeSuite
	public void openurl() {
		
		driver= new ChromeDriver();
		driver.get("https://products.ncryptedprojects.com/petsitcare/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterSuite
	public void closeurl() throws InterruptedException {
		Thread.sleep(7000);
		driver.close();
	}
	
	
	}



