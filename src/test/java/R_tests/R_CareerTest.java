package R_tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import R_base.R_TestBase;
import R_pages.R_Career;
import R_pages.R_HomePage;

public class R_CareerTest extends R_TestBase {
	
	R_HomePage r_homepage;
	R_Career r_career;
	
	public R_CareerTest() {
		super(); 
	}
	
	@BeforeMethod
	public void SetUp() throws InterruptedException {
		initialization(); 
		r_homepage = new R_HomePage(); 
		r_career = new R_Career();
		r_homepage.verifyCareer();
	}
	
	@Test
	public void validCareerFormTest()throws InterruptedException {
		r_career.enterFName();
		r_career.enterLName();
		r_career.enterEmail();
		r_career.enterPhone();
		r_career.chooseGender();
		r_career.chooseJobPost();
		r_career.enterMessage();
		r_career.fileUpload();
		r_career.applyNow(); 
		
		//jpeg: The filetype you are attempting to upload is not allowed.
		//jpg: The filetype you are attempting to upload is not allowed.
		//email: abab@ababa : accepting
		//phone: accepting characters, accepting less or greater than 10 numbers
		//You have applied for job successfully. instead of your application is successfully submitted, shortlisted candidates will be contacted accordingly





		


	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
