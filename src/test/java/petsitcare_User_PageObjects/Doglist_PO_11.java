package petsitcare_User_PageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Doglist_PO_11 {
	public static WebDriver driver;

    public Doglist_PO_11(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

    }
	@FindBy(xpath="//a[text()=' My Dog List ']")WebElement linkedtext;
	@FindBy(xpath="(//a[@class='edit'])[1]")WebElement edit;
	@FindBy(xpath="//input[@placeholder='Dog Name']")WebElement dogname;
	@FindBy(xpath="//button[@data-id='weight']")WebElement weight;
	@FindBy(xpath="(//ul[@role='listbox'])[2]/li")List<WebElement> weightt;
    @FindBy(xpath="//button[@data-id='breed']")WebElement breed;
	@FindBy(xpath="(//ul[@role='listbox'])[3]/li")List<WebElement> dogbreed;
	
	@FindBy(xpath="//input[@name='profile_image']")WebElement dogpic;

	
	@FindBy(xpath="//button[@data-id='age']")WebElement age;
	@FindBy(xpath="(//ul[@role='listbox'])[4]/li")List<WebElement> dogage;
	 	@FindBy(xpath="//label[@for='g1']")WebElement genderm;
	 	@FindBy(xpath="//label[@for='g2']")WebElement genderf;
        @FindBy(xpath="//label[@for='dog1']")WebElement dog1;
	 	@FindBy(xpath="//label[@for='dog2']")WebElement dog2;
	 	@FindBy(xpath="//label[@for='dog5']")WebElement cat1;
	    @FindBy(xpath="//label[@for='dog6']")WebElement cat2;
        @FindBy(xpath="//label[@for='dg1']")WebElement children1;
	    @FindBy(xpath="//label[@for='dg2']")WebElement children2;
        @FindBy(xpath="//input[@id='requirements']")WebElement requirements;
	    @FindBy(xpath="//textarea[@id='description']")WebElement descriptions;
	    @FindBy(xpath="//textarea[@id='instructions']")WebElement instructions;
	    @FindBy(xpath="//input[@name='submitDog']")WebElement submitdog;
	    @FindBy(xpath="//button[@class='close-btn margintop20']")WebElement cancel;
	    @FindBy(xpath="(//a[@title='Delete'])[2]")WebElement delete;
	    
	@FindBy(xpath="//a[@aria-label='Previous']")WebElement Previous;
	@FindBy(xpath="//a[@class='clickPage']")WebElement pagenumber;
	@FindBy(xpath="//i[@class='fa fa-angle-right']")WebElement Next;
		
        public void doglist() {
        	 linkedtext.click();
        	 
        }
        public void editdog() throws InterruptedException {
        	
        	edit.click();
        }
            public void dogname(String name) throws InterruptedException {
            	dogname.clear();
            	dogname.sendKeys(name);
               }
            public void weightofdog(int weightoptions) throws InterruptedException {
            	weight.click();
            	Thread.sleep(3000);
            	weightt.get(weightoptions).click();
       }

        public void breedofdog(int breedoptions) throws InterruptedException {
        	breed.click();
        	Thread.sleep(3000);
          dogbreed.get(breedoptions).click();
     	
        }
        
        public void ageofdog(int ageoptions) throws InterruptedException {
        	age.click();
        	Thread.sleep(3000);
          dogage.get(ageoptions).click();
        }
        public void selectgender(String gender) throws InterruptedException {
        	
        	    if (gender.equalsIgnoreCase("Male")) {
        	        genderm.click();
        	    } else {
        	        genderf.click();
        	    }   
              	Thread.sleep(3000);

        	}
        public void otherdogs(String dogs) throws InterruptedException {
        	 if (dogs.equalsIgnoreCase("yes")) {
     	        dog1.click();
     	    } else {
     	        dog2.click();
     	    }      
          	Thread.sleep(3000);
     }
        public void cat(String cats) throws InterruptedException {
       	 if (cats.equalsIgnoreCase("yes")) {
    	        cat1.click();
    	    } else {
    	        cat2.click();
    	    }      
    	    
         	Thread.sleep(3000);
    }
        public void children(String child) throws InterruptedException {
          	 if (child.equalsIgnoreCase("yes")) {
       	        children1.click();
       	    } else {
       	        children2.click();
       	    }      
       	        Thread.sleep(3000);
       }
        public void requirement(String req) {
        	requirements.clear();
        	requirements.sendKeys(req);
        }
        public void description(String dec) {
        	descriptions.clear();
        	descriptions.sendKeys(dec);
       }
        public void instruction(String ins) throws InterruptedException {
        	instructions.clear();
        	instructions.sendKeys(ins);
          	Thread.sleep(3000);
        }
        public void submit(String agree) throws InterruptedException {
         	 if (agree.equalsIgnoreCase("submit")) {
      	        submitdog.click();
      	    } else {
      	        cancel.click();
      	    }      
      	    	Thread.sleep(3000);
      }
        public void deletedog() throws InterruptedException {
        	delete.click();
  	    	Thread.sleep(3000);
        	driver.switchTo().alert().dismiss();

        }
        public void pagenations() throws InterruptedException {
			JavascriptExecutor js=(JavascriptExecutor)driver;
	      js.executeScript("arguments[0].scrollIntoView();",Next);
			 Thread.sleep(3000);
			 Previous.click();
			 Thread.sleep(3000);
			 pagenumber.click();
			 Thread.sleep(3000);
	         Next.click();
			 Thread.sleep(3000);
	    	 System.out.println("successfully....");
}
	    	        
        
          }