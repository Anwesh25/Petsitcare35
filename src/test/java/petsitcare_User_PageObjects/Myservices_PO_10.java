package petsitcare_User_PageObjects;

	import java.util.Set;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Myservices_PO_10  {
		public static WebDriver driver;
		
		public Myservices_PO_10(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
			
			@FindBy(xpath="//a[text()=' My Services '] ")WebElement linkedtext;
			@FindBy(xpath="(//h4[text()='Boarding'])[1]")WebElement text;
			@FindBy(xpath="//a[@class='user-pic']")WebElement profile;
			@FindBy(xpath="//div[@id='headingOne']")WebElement price;
			@FindBy(xpath="//div[@id='headingTwo']")WebElement servicetype;
			@FindBy(xpath="//div[@id='headingThree']")WebElement dogdetails;
			@FindBy(xpath="//div[@id='headingFour']")WebElement location;
			@FindBy(xpath="//div[@id='headingFive']")WebElement time;
			@FindBy(xpath="//div[@id='headingSix']")WebElement policy;
			@FindBy(xpath="//a[@class='small-btn btn']")WebElement cancellation;
	        @FindBy(xpath="(//a[@class='edit'])[1]")WebElement edit;
	        @FindBy(xpath="(//a[@class='remove'])[1]")WebElement remove;
	        @FindBy(xpath="//input[@placeholder='Enter search keyword']")WebElement search;
	        @FindBy(xpath="//a[@class='search_icon']")WebElement searchIcon;
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
		 Thread.sleep(10000);
			}
		public void service() throws InterruptedException {
			text.click();
			Thread.sleep(3000);
			profile.click();
			Thread.sleep(5000);
		driver.navigate().back();
		price.click();
		Thread.sleep(3000);
		servicetype.click();
		Thread.sleep(3000);
		dogdetails.click();
		Thread.sleep(3000);
		location.click();
		Thread.sleep(3000);
		time.click();
		Thread.sleep(3000);
		policy.click();
		Thread.sleep(3000);
		
		String parenttab=driver.getWindowHandle();
		System.out.println("parent tab -"+parenttab + driver.getTitle());
		cancellation.click();
	  Set<String>tabhandles=driver.getWindowHandles();
	   for(String windowHandle : tabhandles) {
		   if(!windowHandle.equals(parenttab)) 
		   driver.switchTo().window(windowHandle);
	   
	       driver.switchTo().window(parenttab);
	     //  driver.close();
	   }
	   Thread.sleep(15000);
		driver.navigate().back();
		System.out.println("successfully selected....");
	    
		}
		public void edit() throws InterruptedException {
			 edit.click();
		        Thread.sleep(5000);
		        driver.navigate().back();
		   	 System.out.println("successfully edit done....");

		}
		  public void remove() throws InterruptedException {
				 Thread.sleep(5000);
			   remove.click();
				 Thread.sleep(5000);
		        driver.switchTo().alert().dismiss();
		   	 System.out.println("successfully dismissed....");
			 Thread.sleep(5000);

		}
	       public void search() throws InterruptedException {
			 search.click();
			 Thread.sleep(5000);
		        search.sendKeys("dog walking");
				 Thread.sleep(5000);
		        searchIcon.click();
		        driver.navigate().refresh();
		     Thread.sleep(3000);
			 System.out.println("successfully search completed....");

		}
	    public void pagenations() throws InterruptedException {
			JavascriptExecutor js=(JavascriptExecutor)driver;
	      js.executeScript("arguments[0].scrollIntoView();",number);
			 Thread.sleep(3000);
	    	 number.click();
			 Thread.sleep(3000);
	         previous.click();
			 Thread.sleep(3000);
	         next.click();
			 Thread.sleep(3000);
	    	 System.out.println("successfully....");
}
	    	
	    }
