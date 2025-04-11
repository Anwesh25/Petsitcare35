package petsitcare_User_PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myservices_PO_10 {
	public static WebDriver driver;
	
	public Myservices_PO_10(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(xpath="//a[text()=' My Services '] ")WebElement linkedtext;
        @FindBy(xpath="//input[@placeholder='Enter search keyword']")WebElement search;
        @FindBy(xpath="//a[@class='search_icon']")WebElement searchIcon;
        @FindBy(xpath="(//h4[text()='Boarding'])[1]")WebElement edit;
        @FindBy(xpath="(//a[@class='remove'])[1]")WebElement remove;
        @FindBy(xpath="//a[@data-page='3']")WebElement number;
        @FindBy(xpath="//a[@aria-label='Previous']")WebElement previous;
        @FindBy(xpath="//a[@aria-label='Next']")WebElement next;
	    
		public void jsp() {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();",linkedtext);
			
		}

	
	public void myservice() throws InterruptedException {
		 Thread.sleep(10000);
	 linkedtext.click();
	 System.out.println("successfully navigated....");
	 
		}
     
	public void search() throws InterruptedException {
		 search.click();
		 Thread.sleep(9000);
	        search.sendKeys("dog walking");
			 Thread.sleep(9000);
	        searchIcon.click();
	        driver.navigate().refresh();
	        
		 Thread.sleep(5000);
		 System.out.println("successfully search completed....");

     }
    
	public void edit() throws InterruptedException {
		 edit.click();
	        Thread.sleep(5000);
	        driver.navigate().back();
	   	 System.out.println("successfully edit done....");

	}
    
	   public void remove() {
		   remove.click();
	        driver.switchTo().alert().dismiss();
	   	 System.out.println("successfully dismissed....");

	}
    public void pagenations() {
		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].scrollIntoView();",number);

    	 number.click();
         previous.click();
         next.click();
    	 System.out.println("successfully....");

	
		
	}
    	
    }
	


