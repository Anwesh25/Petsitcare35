package petsitcare_user_base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class User_base {

		public static WebDriver driver;
		
		@BeforeClass
		public void openurl() {
			
			driver= new EdgeDriver();
			driver.get("https://products.ncryptedprojects.com/petsitcare/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
		
		@AfterClass
		public void closeurl() {
			driver.close();
		}
		
}
