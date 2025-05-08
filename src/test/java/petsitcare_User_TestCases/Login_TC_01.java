package petsitcare_User_TestCases;

import org.testng.annotations.Test;
import petsitcare_User_PageObjects.LoginPage_PO_01;
import petsitcare_user_base.User_base;

public class Login_TC_01 extends User_base {
    LoginPage_PO_01 login;

    @Test(priority = 1)
    public void validLoginTest() throws InterruptedException {
        login = new LoginPage_PO_01(driver);
        login.signin();
        login.username("buyer.ncrypted@gmail.com");
        login.password("123456");
        login.login();
    }
}
