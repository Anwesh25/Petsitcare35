package petsitcare_User_TestCases;

import org.testng.annotations.Test;

import petsitcare_User_PageObjects.LoginPage_PO_01;
import petsitcare_User_PageObjects.Recivedservice_PO_14;
import petsitcare_user_base.User_base;

public class TC_14_Recivedservice extends User_base {

    LoginPage_PO_01 login;
	Recivedservice_PO_14 rs;
	
	@Test(priority=6)
	 public void validLoginTest() throws InterruptedException {
        login = new LoginPage_PO_01(driver);
        login.signin();
        login.username("buyer.ncrypted@gmail.com");
        login.password("123456");
        login.login();
        
        
			rs=new Recivedservice_PO_14(driver);
			rs.recivedservice();
			rs.profilepic();
			rs.search("House sitting");
			rs.message();
			rs.sendmessage("hh");
			rs.popup("submit");
			rs.pagenumber(3);
			rs.accept();
			rs.reject();
			rs.servicereason("not good");
			rs.rejectreason("cancel");
			rs.answer(1);
			rs.close();
			rs.previous();
			rs.next();
			
			
			
	}		

}
