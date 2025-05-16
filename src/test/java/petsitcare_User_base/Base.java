package petsitcare_User_base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {
public static WebDriver driver;
	
	@BeforeSuite
	public void openurl() {
		driver= new EdgeDriver();
		driver.get("https://products.ncryptedprojects.com/petsitcare/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterSuite
	public void closeurl() {
		driver.close();
	}

	
	}

	
	

