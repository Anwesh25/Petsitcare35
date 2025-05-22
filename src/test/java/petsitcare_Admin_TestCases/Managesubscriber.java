package petsitcare_Admin_TestCases;

import petsitcare_Admin_PageObjects.subscribers;
import petsitcare_Admin_base.Base;

import java.io.IOException;

import org.testng.annotations.Test;

public class Managesubscriber extends Base {
    
    @Test
    public void testSubscribersActions() throws InterruptedException, IOException {
        login lg = new login();
        lg.login1();  // Logs into the application

        Thread.sleep(2000);

        // Using the unified 'subscribers' POM class
        subscribers subsPage = new subscribers(driver);

        subsPage.navigateToSubscribers();  // Opens Manage Subscribers -> Subscribers

        
        Thread.sleep(2000);
        subsPage.selectRecords("50");      // Selects 50 records from dropdown

        Thread.sleep(2000);
        subsPage.clickExcel();             // Clicks on Excel button to export

        Thread.sleep(2000);
        subsPage.searchSubscriber("mansi");  // Searches for "sunil"

        Thread.sleep(2000);
        subsPage.deleteSubscriber();       // Clicks delete icon

        Thread.sleep(2000);
        subsPage.cancelDelete();           // Cancels the delete operation
    }
}
