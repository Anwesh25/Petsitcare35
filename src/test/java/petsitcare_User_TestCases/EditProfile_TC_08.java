package petsitcare_User_TestCases;

import org.testng.annotations.Test;

import petsitcare_User_PageObjects.EditProfile_PO_08;
import petsitcare_User_PageObjects.LoginPage_PO_01;
import petsitcare_User_base.Base;

public class EditProfile_TC_08 extends Base{
	LoginPage_PO_01 lg;
	EditProfile_PO_08 EP;
	@Test
	public void editprofile() throws InterruptedException {
		lg= new LoginPage_PO_01(driver);
		lg.signin();
		lg.username("buyer.ncrypted@gmail.com");
		lg.password("123456");
		lg.login();
				 
			
		EP= new EditProfile_PO_08(driver);
		EP.editprofile();
		EP.Firstname("Srikanth");
		EP.Lastname("Kondrapally");
		EP.Address("Hyderabad, Bhagya Nagar Colony, Kukatpally, Hyderabad, Telangana, India");
		EP.birthdate();
		EP.selectgender("Female");
		EP.contactnumber("9898989899");
		EP.Emergencycontactnumber("0402323232");
		EP.save();
		
	}
	
}

