package R_tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import R_base.R_TestBase;
import R_pages.R_HomePage;

public class R_HomePageTest extends R_TestBase {
	
	R_HomePage r_homepage;
	
	public R_HomePageTest() {
		super(); // to use properties of parent class constructor
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization(); // called this method from TestBase class
		r_homepage = new R_HomePage(); // created LoginPage class object
	}
	
//	
//	
//	@Test
//	public void HomePageTitleTest() {
//		String title = r_homepage.validatePageTitle();
//		Assert.assertEquals(title, "Home - Roicians");
//	}
//	

//	@Test
//	public void HeaderFb() throws InterruptedException {
//		r_homepage.verifyHeaderFb();
//	}
//	
//	@Test
//	public void HeaderTw() throws InterruptedException {
//		r_homepage.verifyHeaderTw();
//	}
//	
//	@Test
//	public void HeaderDr() throws InterruptedException {
//		r_homepage.verifyHeaderDr();
//	}
//	
//	@Test
//	public void HeaderIn() throws InterruptedException {
//		r_homepage.verifyHeaderIn();
//	}
//	
//	@Test
//	public void HeaderLi() throws InterruptedException {
//		r_homepage.verifyHeaderLi();
//	}
	
//	@Test
//	public void HeaderPhoneTest() throws InterruptedException {
//		r_homepage.verifyHeaderPhone();
//	}
	
	
//	@Test
//	public void logoTest() throws InterruptedException {
//		r_homepage.verifyLogo();
//	}
	
//	@Test
//	public void BodyServicesTest() throws InterruptedException {
//		r_homepage.verifyBodyService();
//	}
//	
//	@Test
//	public void BodyTrainingTest() throws InterruptedException {
//		r_homepage.verifyBodyTraining();
//	}
//	
//	@Test
//	public void BodyCareerTest() throws InterruptedException {
//		r_homepage.verifyBodyCareer();
//	}
//	
//	@Test
//	public void BodyEventsTest() throws InterruptedException {
//		r_homepage.verifyBodyEvents();
//	}
	
//	@Test
//	public void BodyMoreAboutUsTest() throws InterruptedException {
//		r_homepage.verifyBodyMoreAboutUs();
//	}
//	
//	@Test
//	public void BodyContactUsTest() throws InterruptedException {
//		r_homepage.verifyBodyContactUs();
//	}
	
//	@Test
//	public void BodyHoverWDDTest() throws InterruptedException {
//		r_homepage.verifyHoverWDD();
//	}
//	
//	@Test
//	public void BodyHoverSTTest() throws InterruptedException {
//		r_homepage.verifyHoverST();
//	}
//	
//	@Test
//	public void BodyHoverITCTest() throws InterruptedException {
//		r_homepage.verifyHoverITC();
//	}
//	
//	@Test
//	public void BodyHoverTrainingTest() throws InterruptedException {
//		r_homepage.verifyHoverTraining();
//	}
	
//	@Test
//	public void OtherLeftTest() throws InterruptedException {
//		r_homepage.verifyOtherLeft();
//	}
//	
//	@Test
//	public void OtherRightTest() throws InterruptedException {
//		r_homepage.verifyOtherRight();
//	}
	
//	@Test
//	public void WhoWeAreTest() throws InterruptedException { //Not navigating to About Us page
//		r_homepage.verifyWhoWeAreRead();
//	}
	
//	@Test
//	public void PlayTest() throws InterruptedException { 
//		r_homepage.verifyPlay();
//	}

//	@Test
//	public void VideoLeftTest() throws InterruptedException {
//		r_homepage.verifyVideoLeft();
//	}
//	
//	@Test
//	public void VideoRightTest() throws InterruptedException {
//		r_homepage.verifyVideoRight();
//	}
	
//	@Test
//	public void EventLeftTest() throws InterruptedException {
//		r_homepage.verifyEventLeft();
//	}
//	
//	@Test
//	public void EventRightTest() throws InterruptedException {
//		r_homepage.verifyEventRight();
//	}
	
//	@Test
//	public void FooterReadTest() throws InterruptedException { //Not navigating to About Us page
//		r_homepage.verifyFooterRead();
//	}
	
//	@Test
//	public void EmailTest1() throws InterruptedException { // error stated email already existed
//		r_homepage.verifyEmail1();
//	}
//	
//	@Test
//	public void EmailTest2() throws InterruptedException { // error stated invalid email
//		r_homepage.verifyEmail2();
//	}
//	
//	@Test
//	public void EmailTest3() throws InterruptedException { // confirmation with thank you for subscribing
//		r_homepage.verifyEmail3();
//	}
	
//	@Test
//	public void EnquireNowTest() throws InterruptedException { // confirmation with thank you for subscribing
//		r_homepage.verifyEnquireNow();
//	}
	
//	@Test
//	public void CareerTest() throws InterruptedException { // confirmation with thank you for subscribing
//		r_homepage.verifyCareer();
//	}
	
	
	
	

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
