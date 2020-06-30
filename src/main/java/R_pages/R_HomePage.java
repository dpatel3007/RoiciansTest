package R_pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import R_base.R_TestBase;

public class R_HomePage extends R_TestBase {
	
	ChromeOptions options = new ChromeOptions();
	Actions action = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;

	
	// Page Factory

	@FindBy(linkText = "+1 (289) 499-4040")
	WebElement HeaderPhone;

	@FindBy(linkText = "info@roicians.com")
	WebElement HeaderEmail;
	
	@FindBy(xpath = "//a[contains(text(),'Enquire Now')]")
	WebElement EnquireNow;
	
	@FindBy(xpath = "//ul[@class='menuzord-menu menuzord-right menuzord-indented scrollable']//a[contains(text(),'Careers')]")
	WebElement Career;
	

	@FindBy(xpath = "//i[@class='fa fa-facebook text-white']")
	WebElement HeaderFb;

	@FindBy(xpath = "//i[@class='fa fa-twitter text-white']")
	WebElement HeaderTw;

	@FindBy(xpath = "//i[@class='fa fa-youtube text-white']")
	WebElement HeaderYo;

	@FindBy(xpath = "//i[@class='fa fa-instagram text-white']")
	WebElement HeaderIn;

	@FindBy(xpath = "//i[@class='fa fa-linkedin text-white']")
	WebElement HeaderLi;

	@FindBy(xpath = "//a[@class='menuzord-brand pull-left flip']//img")
	WebElement HeaderLogo;

	@FindBy(xpath = "//h3[@class='text-center mt-2'][contains(text(),'Services')]")
	WebElement BodyServices;
	
	@FindBy(xpath = "//h3[@class='text-center mt-2'][contains(text(),'Training')]")
	WebElement BodyTraining;
	
	@FindBy(xpath = "//h3[@class='text-center mt-2'][contains(text(),'Career')]")
	WebElement BodyCareer;
	
	@FindBy(xpath = "//h3[@class='text-center mt-2'][contains(text(),'Events')]")
	WebElement BodyEvents;
	
	@FindBy(xpath = "//a[contains(text(),'More About Us')]")
	WebElement BodyMoreAboutUs;
	
	@FindBy(xpath = "//a[@class='text-uppercase btn btn-dark btn-theme-colored btn-xl'][contains(text(),'Contact Us')]")
	WebElement BodyContactUs;
	
	@FindBy(xpath = "//div[@class='card__front bg-theme-colored border-1px border-theme-colored']//div[@class='icon-box mb-0']")
	WebElement HoverWDD;
	
	@FindBy(linkText = "Read More")
	WebElement HoverWDDRead;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@class='main-content']/section[@class='bg-light']/div[@class='container']/div[@class='row']/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement HoverST;
	
	@FindBy(xpath = "//div[@class='main-content']//div[3]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//a[1]")
	WebElement HoverSTRead;
	
	@FindBy(xpath = "//div[@class='card__front bg-theme-colored']//div[@class='display-table-cell']")
	WebElement HoverITConsultancy;
	
	@FindBy(xpath = "//div[@class='main-content']//div[4]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//a[1]")
	WebElement HoverITCRead;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@class='main-content']/section[@class='bg-light']/div[@class='container']/div[@class='row']/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement HoverTraining;
	
	@FindBy(xpath = "//div[@class='main-content']//div[5]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//a[1]")
	WebElement HoverTrainingRead;
	
	@FindBy(xpath = "//div[@class='owl-carousel-4col appendHtml owl-nav-top owl-carousel owl-theme owl-loaded']//div[@class='owl-prev']")
	WebElement OtherLeft;
	
	@FindBy(xpath = "//div[@class='owl-carousel-4col appendHtml owl-nav-top owl-carousel owl-theme owl-loaded']//div[@class='owl-next']")
	WebElement OtherRight;
	
	@FindBy(linkText = "Read More →")
	WebElement WhoWeAre;
	
	@FindBy(xpath = "//div[@class='owl-carousel-2col owl-nav-top owl-carousel owl-theme owl-loaded']//div[@class='owl-prev']")
	WebElement VideoLeft;
	
	@FindBy(xpath = "//div[@class='owl-carousel-2col owl-nav-top owl-carousel owl-theme owl-loaded']//div[@class='owl-next']")
	WebElement VideoRight;
	
	@FindBy(xpath = "//a[@class='bx-prev']")
	WebElement EventLeft;
	
	@FindBy(xpath = "//a[@class='bx-next']")
	WebElement EventRight;
	
	@FindBy(xpath = "//a[@class='text-theme-colored font-14']")
	WebElement FooterRead;
	
	@FindBy(xpath = "//input[@id='subscribeEmail']")
	WebElement EmailInput;
	
	@FindBy(xpath = "//i[@class='fa fa-paper-plane-o text-white']")
	WebElement EmailSend;
	
	@FindBy(xpath = "//i[@class='fa fa-facebook']")
	WebElement FooterFb;
	
	@FindBy(xpath = "//i[@class='fa fa-twitter']")
	WebElement FooterTw;
	
	@FindBy(xpath = "//i[@class='fa fa-youtube']")
	WebElement FooterYo;
	
	@FindBy(xpath = "//i[@class='fa fa-instagram']")
	WebElement FooterIn;
	
	@FindBy(xpath = "//i[@class='fa fa-linkedin']")
	WebElement FooterLi;
	
	
	
	
//	@FindBy(xpath = "//a[@class='text-theme-colored font-13 mb-30")
//	WebElement Play;
//	
//	@FindBy(xpath = "//div[@class='owl-carousel-2col owl-nav-top owl-carousel owl-theme owl-loaded']//i[@class='pe-7s-angle-left']")
//	WebElement Pause;
	

	// Initializing Page Objects
	public R_HomePage() {
		PageFactory.initElements(driver, this); // this keyword will initialize all the object we have created for this
												// class to the driver
	}

	// Actions


	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	public R_EnquireNow verifyEnquireNow() throws InterruptedException {
		EnquireNow.click();
		Thread.sleep(2000);
		return new R_EnquireNow();
	}
	
	public R_Career verifyCareer() throws InterruptedException {
		Career.click();
		Thread.sleep(2000);
		return new R_Career();
	}

	public void verifyHeaderFb() throws InterruptedException {
		HeaderFb.click();
		Thread.sleep(5000);
		for (String winHandle : driver.getWindowHandles()) {//Switch command to new window 
		    driver.switchTo().window(winHandle);
		    String title=driver.getTitle();
		    System.out.println(title);
		}
		
	}

	public void verifyHeaderTw() throws InterruptedException {
		HeaderTw.click();
		Thread.sleep(5000);
		for (String winHandle : driver.getWindowHandles()) {//Switch command to new window 
		    driver.switchTo().window(winHandle);
		    String title=driver.getTitle();
		    System.out.println(title);
		}
	}

	public void verifyHeaderDr() throws InterruptedException {
		HeaderYo.click();
		Thread.sleep(5000);
		for (String winHandle : driver.getWindowHandles()) {//Switch command to new window 
		    driver.switchTo().window(winHandle);
		    String title=driver.getTitle();
		    System.out.println(title);
		}
	}

	public void verifyHeaderIn() throws InterruptedException {
		HeaderIn.click();
		Thread.sleep(5000);
		for (String winHandle : driver.getWindowHandles()) {//Switch command to new window 
		    driver.switchTo().window(winHandle);
		    String title=driver.getTitle();
		    System.out.println(title);
		}
	}

	public void verifyHeaderLi() throws InterruptedException {
		HeaderLi.click();
		Thread.sleep(5000);
		for (String winHandle : driver.getWindowHandles()) {//Switch command to new window 
		    driver.switchTo().window(winHandle);
		    String title=driver.getTitle();
		    System.out.println(title);
		}
	}
	
	public void verifyFooterFb() throws InterruptedException {
		FooterFb.click();
		Thread.sleep(5000);
		for (String winHandle : driver.getWindowHandles()) {//Switch command to new window 
		    driver.switchTo().window(winHandle);
		    String title=driver.getTitle();
		    System.out.println(title);
		}
	}
	
	public void verifyFooterTw() throws InterruptedException {
		FooterTw.click();
		Thread.sleep(5000);
		for (String winHandle : driver.getWindowHandles()) {//Switch command to new window 
		    driver.switchTo().window(winHandle);
		    String title=driver.getTitle();
		    System.out.println(title);
		}
	}
	
	public void verifyFooterYo() throws InterruptedException {
		HeaderYo.click();
		Thread.sleep(5000);
		for (String winHandle : driver.getWindowHandles()) {//Switch command to new window 
		    driver.switchTo().window(winHandle);
		    String title=driver.getTitle();
		    System.out.println(title);
		}
	}
	
	public void verifyFooterIn() throws InterruptedException {
		FooterIn.click();
		Thread.sleep(5000);
		for (String winHandle : driver.getWindowHandles()) {//Switch command to new window 
		    driver.switchTo().window(winHandle);
		    String title=driver.getTitle();
		    System.out.println(title);
		}
	}
	
	public void verifyFooterLi() throws InterruptedException {
		FooterLi.click();
		Thread.sleep(5000);
		for (String winHandle : driver.getWindowHandles()) {//Switch command to new window 
		    driver.switchTo().window(winHandle);
		    String title=driver.getTitle();
		    System.out.println(title);
		}
	}
	
	public void verifyHeaderPhone() throws InterruptedException {
		HeaderPhone.click();
		Thread.sleep(2000);		
		options.addArguments("--disable-notifications");
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);			
	}

	public R_HomePage verifyLogo() throws InterruptedException {
		HeaderLogo.click();
		Thread.sleep(2000);
		return new R_HomePage();
	}
	
	public R_Services verifyBodyService() throws InterruptedException {
		BodyServices.click();
		Thread.sleep(2000);
		return new R_Services();
	}
	
	public R_Training verifyBodyTraining() throws InterruptedException {
		BodyTraining.click();
		Thread.sleep(2000);
		return new R_Training();
	}
	
	public R_Career verifyBodyCareer() throws InterruptedException {
		BodyCareer.click();
		Thread.sleep(2000);
		return new R_Career();
	}
	
	public R_Events verifyBodyEvents() throws InterruptedException {
		BodyCareer.click();
		Thread.sleep(2000);
		return new R_Events();
	}
	
	public R_AboutUs verifyBodyMoreAboutUs() throws InterruptedException {
		BodyMoreAboutUs.click();
		Thread.sleep(2000);
		return new R_AboutUs();
	}
	
	public R_ContactUs verifyBodyContactUs() throws InterruptedException {
		BodyContactUs.click();
		Thread.sleep(2000);
		return new R_ContactUs();
	}
	
	public R_WDD verifyHoverWDD() throws InterruptedException {
		action.moveToElement(HoverWDD).build().perform();
		Thread.sleep(2000);
		HoverWDDRead.click();
		Thread.sleep(2000);
		return new R_WDD();
	}
	
	public R_ST verifyHoverST() throws InterruptedException {
		action.moveToElement(HoverST).build().perform();
		Thread.sleep(2000);
		HoverSTRead.click();
		Thread.sleep(2000);
		return new R_ST();
	}
	
	public R_ITC verifyHoverITC() throws InterruptedException {
		action.moveToElement(HoverITConsultancy).build().perform();
		Thread.sleep(2000);
		HoverITCRead.click();
		Thread.sleep(2000);
		return new R_ITC();
	}
	
	public R_Training verifyHoverTraining() throws InterruptedException {
		action.moveToElement(HoverTraining).build().perform();
		Thread.sleep(2000);
		HoverTrainingRead.click();
		Thread.sleep(2000);
		return new R_Training();
	}
	
	public void verifyOtherLeft() throws InterruptedException {
		OtherLeft.click();
		Thread.sleep(2000);
		OtherLeft.click();
		Thread.sleep(2000);
		OtherLeft.click();
	}
	
	public void verifyOtherRight() throws InterruptedException {
		OtherRight.click();
		Thread.sleep(2000);
		OtherRight.click();
		Thread.sleep(2000);
		OtherRight.click();
	}
	
	public R_AboutUs verifyWhoWeAreRead() throws InterruptedException {
		WhoWeAre.click();
		Thread.sleep(2000);
		return new R_AboutUs();
	}
	
//	public void verifyPlay() throws InterruptedException {
//		js.executeScript("document.getElementsById(\"video\").play()");
//		Thread.sleep(2000);
//	}
	
	public void verifyVideoLeft() throws InterruptedException {
		VideoLeft.click();
		Thread.sleep(2000);
		VideoLeft.click();
		Thread.sleep(2000);
		VideoLeft.click();
	}
	
	public void verifyVideoRight() throws InterruptedException {
		VideoRight.click();
		Thread.sleep(2000);
		VideoRight.click();
		Thread.sleep(2000);
		VideoRight.click();
	}
	
	public void verifyEventLeft() throws InterruptedException {
		EventLeft.click();
		Thread.sleep(2000);
		EventLeft.click();
		Thread.sleep(2000);
		EventLeft.click();
	}
	
	public void verifyEventRight() throws InterruptedException {
		EventRight.click();
		Thread.sleep(2000);
		EventRight.click();
		Thread.sleep(2000);
		EventRight.click();
	}
	
	public R_AboutUs verifyFooterRead() throws InterruptedException {
		FooterRead.click();
		Thread.sleep(2000);
		return new R_AboutUs();
	}
	
	public void verifyEmail1() throws InterruptedException {
		EmailInput.sendKeys("dhruv@gmail.com");
		Thread.sleep(2000);
		EmailSend.click();
		Thread.sleep(2000);
	}
	
	public void verifyEmail2() throws InterruptedException {
		EmailInput.sendKeys("dhruv.com");
		Thread.sleep(2000);
		EmailSend.click();
		Thread.sleep(2000);
	}
	
	public void verifyEmail3() throws InterruptedException {
		EmailInput.sendKeys("dhruvabc@gmail.com");
		Thread.sleep(2000);
		EmailSend.click();
		Thread.sleep(2000);
	}
	
	
	
	
	

}
