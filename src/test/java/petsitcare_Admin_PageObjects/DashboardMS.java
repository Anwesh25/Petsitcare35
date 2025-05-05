package petsitcare_Admin_PageObjects;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;

	public class DashboardMS {
		    
			WebDriver driver;

		    public DashboardMS(WebDriver driver) {
		        this.driver = driver;
		    }

		    // Locators
		    By manageSubscribersMenu = By.xpath("//span[text()='Manage Subscriber']");
		    By subscribersOption = By.xpath("//a[text()='Subscribers']");

		    public void navigateToSubscribers() throws InterruptedException {
		    	driver.findElement(manageSubscribersMenu).click();
		        
		        
		        Thread.sleep(3000);
		        
		        driver.findElement(subscribersOption).click();
		    }
		    
		    public void subscribersOption() {
		    	WebElement subscriber=driver.findElement(subscribersOption);
		    	subscriber.click();
		    }
	}


