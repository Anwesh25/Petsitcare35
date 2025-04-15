package petsitcare_User_TestCases;

import org.testng.annotations.Test;

import Base.Baseclass;
import petsitcare_Admin_PageObjects.Dashboard_PO_01;

	public class TC_01Login extends Baseclass{
		@Test
		public void Login() throws InterruptedException {
			
			Dashboard_PO_01 login= new Dashboard_PO_01(driver);
			login.signin();
			login.username("buyer.ncrypted@gmail.com");
			login.password("123456");
			login.login();
}
}