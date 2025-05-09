package petsitcare_User_TestCases;

import org.testng.annotations.Test;

import petsitcare_User_PageObjects.LoginPage_PO_01;
import petsitcare_User_PageObjects.Myservices_PO_10;
import petsitcare_user_base.User_base;

public class TC_10_myservice extends User_base {
    LoginPage_PO_01 login;
    Myservices_PO_10 ms;

    @Test(priority = 2)
    public void validLoginTest() throws InterruptedException {
        login = new LoginPage_PO_01(driver);
        login.signin();
        login.username("buyer.ncrypted@gmail.com");
        login.password("123456");
        login.login();
    

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
