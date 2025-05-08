package petsitcare_User_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_PO_01 {
	
		
		public static WebDriver driver;
		
		public Login_PO_01(WebDriver driver) {
			this.driver=driver;
			
		}
		By sign =By.xpath("//a[text()='Sign in']");
		By email=By.xpath("//input[@placeholder='Enter Email Address']");
		By pass=By.xpath("//input[@type='password']");
		By signin=By.xpath("//button[@name='login']");
		
		public void sign() {
			driver.findElement(sign).click();
			
		}
		public void email(String user) {
			driver.findElement(email).sendKeys(user);
		}
		public void password(String password) {
			driver.findElement(pass).sendKeys(password);
		}
		public void signin() {
			driver.findElement(signin).click();

			
		}
		
	}   
