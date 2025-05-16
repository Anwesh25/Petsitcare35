package petsitcare_User_TestCases;

import org.testng.annotations.Test;

import petsitcare_User_PageObjects.LoginPage_PO_01;
import petsitcare_User_PageObjects.Myservices_PO_10;
import petsitcare_user_base.User_base;

public class TC_10_myservice extends User_base {
    
    Myservices_PO_10 ms;

    @Test(priority = 2)
    public void validLoginTest() throws InterruptedException {
    	Login_TC_01 Lg=new Login_TC_01();
    	Lg.validLoginTest();
    

        ms = new Myservices_PO_10(driver);
        ms.jsp();
        ms.myservice();
        ms.service();
        ms.search();
        ms.edit();
        ms.remove();
        ms.pagenations();
    }
}
