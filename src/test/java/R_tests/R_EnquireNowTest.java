package R_tests;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import R_base.R_TestBase;
import R_pages.R_EnquireNow;
import R_pages.R_HomePage;

public class R_EnquireNowTest extends R_TestBase {
	
	R_HomePage r_homepage;
	R_EnquireNow r_enquirenow;
	
	public R_EnquireNowTest() {
		super(); 
	}
	
	@BeforeMethod
	public void SetUp() throws InterruptedException {
		initialization(); 
		r_homepage = new R_HomePage(); 
		r_enquirenow = new R_EnquireNow();
		r_homepage.verifyEnquireNow();
	}
	
//	@Test
//	public void HomePageTitleTest() { 							// title is wrong
//		String title = r_enquirenow.validatePageTitle();
//		Assert.assertEquals(title, "Enquire Now - Roicians");
//	}
	
	@Test
	public void validEnquireNowFormTest()throws InterruptedException {
		r_enquirenow.enterFName();
		r_enquirenow.enterLName();
		r_enquirenow.enterAddress();
		r_enquirenow.enterCity();
		r_enquirenow.enterProvince();
		r_enquirenow.enterPostalCode();
		r_enquirenow.enterPhone();
		r_enquirenow.enterEmail();
		r_enquirenow.checkEducation();
		r_enquirenow.enterSkills();
		r_enquirenow.enterExperience();
		r_enquirenow.chooseCourse();
		r_enquirenow.chooseDays();
		r_enquirenow.chooseTime();
		r_enquirenow.checkStartTime();
		r_enquirenow.checkSource();
		r_enquirenow.checkTerms();
		r_enquirenow.clickSubmit();
	}
	
//	@Test(priority = 1)
//	public void fnameTest() throws InterruptedException {
//		r_enquirenow.enterFName();
//	}
//	
//	@Test(priority = 2)
//	public void lnameTest() throws InterruptedException {
//		r_enquirenow.enterLName();
//	}
//	
//	@Test(priority = 3)
//	public void addressTest() throws InterruptedException {
//		r_enquirenow.enterAddress();
//	}
//	
//	@Test(priority = 4)
//	public void cityTest() throws InterruptedException {
//		r_enquirenow.enterCity();
//	}
//	
//	@Test(priority = 5)
//	public void provinceTest() throws InterruptedException {
//		r_enquirenow.enterProvince();
//	}
//	
//	@Test(priority = 6)
//	public void postalTest() throws InterruptedException {
//		r_enquirenow.enterPostalCode();
//	}
//	
//	@Test(priority = 7)
//	public void phoneTest() throws InterruptedException {
//		r_enquirenow.enterPhone();
//	}
//	
//	@Test(priority = 8)
//	public void emailTest() throws InterruptedException {
//		r_enquirenow.enterEmail();
//	}
//	
//	@Test(priority = 9)
//	public void educationTest() throws InterruptedException {
//		r_enquirenow.checkEducation();
//	}
//	
//	@Test(priority = 10)
//	public void skillsTest() throws InterruptedException {
//		r_enquirenow.enterSkills();
//	}
//	
//	@Test(priority = 11)
//	public void experienceTest() throws InterruptedException {
//		r_enquirenow.enterExperience();
//	}
	
//	@Test(priority = 12)
//	public void courseTest() throws InterruptedException {
//		r_enquirenow.chooseCourse();
//	}
//	
//	@Test(priority = 13)
//	public void daysTest() throws InterruptedException {
//		r_enquirenow.chooseDays();
//	}
//	
//	@Test(priority = 14)
//	public void timeTest() throws InterruptedException {
//		r_enquirenow.chooseTime();
//	}
	
//	@Test(priority = 15)
//	public void startTimeTest() throws InterruptedException {
//		r_enquirenow.checkStartTime();
//	}
//	
//	@Test(priority = 16)
//	public void sourceTest() throws InterruptedException {
//		r_enquirenow.checkSource();
//	}
//	
//	@Test(priority = 17)
//	public void termsTest() throws InterruptedException {
//		r_enquirenow.checkTerms();
//	}
//	
//	@Test(priority = 18)
//	public void submitTest() throws InterruptedException {
//		r_enquirenow.clickSubmit();
//	}
//	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
