package petsitcare_User_PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Servicerequest_PO_13 {
	
	public static WebDriver driver;

    public Servicerequest_PO_13(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

    }
	@FindBy(xpath="//a[text()=' Sent Services Request ']")WebElement linkedtext;
	@FindBy(xpath="//input[@name='keyword']")WebElement searchrequest;
	@FindBy(xpath="//a[@class='search_icon']")WebElement searchicon;
	@FindBy(xpath="(//a[@title='Payment Receipt'])[1]")WebElement pdf;
	@FindBy(xpath="(//i[@class='fa fa-envelope-o'])[5]")WebElement message;
    @FindBy(xpath="//textarea[@id='message']")WebElement sendmessage;
	@FindBy(xpath="//input[@class='small-btn']")WebElement save;
	@FindBy(xpath="(//button[@data-dismiss='modal'])[2]")WebElement cancel;
	@FindBy(xpath="(//button[@data-dismiss='modal'])[1]")WebElement close;
	@FindBy(xpath="//i[@class='fa fa-dollar']")WebElement payment;
	@FindBy(xpath="//a[@data-action='cancel']")WebElement cancelpay;
	
	@FindBy(xpath="//a[@aria-label='Previous']")WebElement previous;
	@FindBy(xpath="//a[@class='clickPage']")List<WebElement> page;
	@FindBy(xpath="//a[@aria-label='Next']")WebElement next;

       
	public void servicerequest() throws InterruptedException {
    	Thread.sleep(3000);
		linkedtext.click();
		
	}
	
	public void search(String request) throws InterruptedException {
    	Thread.sleep(3000);
		searchrequest.click();
    	Thread.sleep(3000);
		searchrequest.sendKeys(request);
		
	}
    
    public void searchservice() throws InterruptedException {
    	Thread.sleep(3000);
    	searchicon.click();
    	Thread.sleep(3000);
		driver.navigate().refresh();

    	
    }
    
    public void pdfd() throws InterruptedException {
    	pdf.click();
    	Thread.sleep(3000);
        driver.navigate().refresh();

    }
    
    public void message() throws InterruptedException {
    	Thread.sleep(3000);
    	message.click();
    }
    
    public void sendmessage(String message) throws InterruptedException {
    	Thread.sleep(3000);
    	sendmessage.click();
    	Thread.sleep(3000);
    	sendmessage.sendKeys(message);
    }
    
    public void popup(String click) throws InterruptedException {
    	 if (click.equalsIgnoreCase("submit")) {
    		 save.click();
 	    }  else if (click.equalsIgnoreCase("cancel")) {
 	    	cancel.click();
 	    }   else {
 	    	close.click();
       	Thread.sleep(3000);
 }    	     		 
    	 }
    
	 public void pay() throws InterruptedException {
	    	Thread.sleep(3000);
		 payment.click();
	    	Thread.sleep(3000);
		 driver.navigate().back();

    }

	 public void cancelbutton() throws InterruptedException {
	    	Thread.sleep(3000);
		 cancelpay.click();
		 driver.switchTo().alert().dismiss();
	 }
	 
	 public void previouspage() throws InterruptedException {
	    	Thread.sleep(3000);
   	  previous.click();
     }
	 
      public void pagenumber(int num) throws InterruptedException {
      	Thread.sleep(3000);
    	  page.get(num).click();
     
      }
    
      public void nextpage() throws InterruptedException {
      	Thread.sleep(3000);
    	  next.click();
      }
}
