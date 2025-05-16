package petsitcare_Admin_TestCases;


	
	
  import petsitcare_Admin_PageObjects.subscribers_Po_17;
  import petsitcare_Admin_base.Base;

	import java.io.IOException;

	import org.testng.annotations.Test;

		
		//import utils.ScreenshotUtil;


		public class Managesubscriber_TC_17 extends Base {
			@Test
		 public void testSubscribersActions() throws InterruptedException, IOException {
				coomonmenu_content_TC_03 CC=new coomonmenu_content_TC_03();
				CC.commonmenu_content();
		 
		        Thread.sleep(2000);
		 
		        // Using the unified 'subscribers' POM class
		        subscribers_Po_17 subsPage = new subscribers_Po_17(driver);
		 
		        subsPage.navigateToSubscribers();  // Opens Manage Subscribers -> Subscribers
		 
		        
		        Thread.sleep(2000);
		        subsPage.selectRecords("50");      // Selects 50 records from dropdown
		 
		        Thread.sleep(2000);
		        subsPage.clickExcel();             // Clicks on Excel button to export
		 
		        Thread.sleep(2000);
		        subsPage.searchSubscriber("mansi");  // Searches for "mansi"
		 
		        Thread.sleep(2000);
		        subsPage.deleteSubscriber();       // Clicks delete icon
		 
		        Thread.sleep(2000);
		        subsPage.cancelDelete();           // Cancels the delete operation
		    }

		    }
		


