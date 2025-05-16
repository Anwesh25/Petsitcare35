package petsitcare_User_PageObjects;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfile_PO_08 {
	public static WebDriver driver;
	public EditProfile_PO_08(WebDriver driver){

	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//a[text()='Edit Profile']")WebElement editprofile;
	@FindBy (xpath="//input[@name='firstName']")WebElement Firstname;
	@FindBy (xpath="//input[@name='lastName']")WebElement Lastname;
	@FindBy (xpath="//input[@name='address']")WebElement Address;
	@FindBy(xpath = "//input[@placeholder='Birthdate']")WebElement birthdate;
	@FindBy (xpath="//label[@for='g1']")WebElement genderMale;
	@FindBy (xpath="//label[@for='g2']")WebElement genderFemale;
	@FindBy (xpath="//input[@name='contactNumber']")WebElement contactnumber;
	@FindBy (xpath="//input[@name='emergencyContactNumber']")WebElement Emergencycontactnumber;
	@FindBy (xpath="//input[@name='save']")WebElement save;
	
	public void editprofile() throws InterruptedException {
		editprofile.click();
		Thread.sleep(3000);
    }

	public void Firstname(String firstName) throws InterruptedException {
		Firstname.clear();
		Firstname.sendKeys(firstName);
		Thread.sleep(3000);

    }

	public void Lastname(String lastName) throws InterruptedException {
		Lastname.clear();
		Lastname.sendKeys(lastName);
		Thread.sleep(3000);
    }
	
		
	public void Address(String address) throws InterruptedException {
		Address.clear();
		Address.sendKeys(address);
		Address.click();
		Thread.sleep(3000);
	}
	public void birthdate() throws InterruptedException {
		birthdate.sendKeys("08/03/1998");
		birthdate.click();
		Thread.sleep(3000);
			
	   }
	
	public void selectgender(String gender) throws InterruptedException {
		if (gender.equalsIgnoreCase("Male")) {
				genderMale.click();
		 } else{
				genderFemale.click();
				Thread.sleep(3000);
		}
			
	}
   
   	public void contactnumber(String contactNumber) throws InterruptedException {
		contactnumber.clear();
		contactnumber.sendKeys(contactNumber);
		Thread.sleep(3000);

	}
	
	public void Emergencycontactnumber(String emergencyContactNumber) throws InterruptedException {
		Emergencycontactnumber.clear();
		Emergencycontactnumber.sendKeys(emergencyContactNumber);
		Thread.sleep(3000);

	}
	
	public void save() {
		save.click();
	}
	
	
}
