package petsitcare_Admin_TestCases;




import petsitcare_Admin_base.Base;
import petsitcare_Admin_PageObjects.Dashboardpetsitcare;
import petsitcare_Admin_PageObjects.Subscriberspetsitcare;

import java.io.IOException;

import org.openqa.selenium.remote.ScreenshotException;
import org.testng.annotations.Test;

import utils.screenshotutil;

public class ManageSubscriberTestCase extends Base {

    @Test
    public void testSubscribersActions() throws InterruptedException, IOException {
       login lg=new login();
    	lg.login1();

        Thread.sleep(2000);
        Dashboardpetsitcare dashboard = new Dashboardpetsitcare(driver);
        dashboard.navigateToSubscribers();
        dashboard.subscribersOption();
        
        Subscriberspetsitcare subscribers = new Subscriberspetsitcare(driver);

        subscribers.clickHome();
        dashboard.navigateToSubscribers();
        dashboard.subscribersOption();
        
        
        
        Thread.sleep(3000);
        subscribers.selectRecords("50");
        
        Thread.sleep(3000);
        subscribers.clickExcel();
        
        Thread.sleep(3000);
        subscribers.searchSubscriber("Vinesh");
       

        Thread.sleep(3000);
        subscribers.deleteSubscriber();
        
        Thread.sleep(3000);
        // Optionally confirm delete too
         subscribers.confirmDelete();

    }
}



