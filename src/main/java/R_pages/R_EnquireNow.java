package R_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import R_base.R_TestBase;

public class R_EnquireNow extends R_TestBase {

	// Page Factory

	@FindBy(id = "first_name")
	WebElement FName;
	
	@FindBy(name = "last_name")
	WebElement LName;
	
	@FindBy(name = "address")
	WebElement Address;
	
	@FindBy(name = "city")
	WebElement City;
	
	@FindBy(name = "state")
	WebElement Province;
	
	@FindBy(name = "zip")
	WebElement PostalCode;
	
	@FindBy(name = "phone")
	WebElement PhoneNumber;
	
	@FindBy(name = "email")
	WebElement Email;
	
	@FindBy(xpath = "//label[contains(text(),\"Bachelor's Degree\")]")
	WebElement Education;
	
	@FindBy(name = "skills")
	WebElement Skills;
	
	@FindBy(name = "experience")
	WebElement Experience;
	
	@FindBy(name = "course_id")
	WebElement Course;
	
	@FindBy(name = "preferred_day")
	WebElement PreferredDays;
	
	@FindBy(name = "preferred_time")
	WebElement PreferredTime;
	
	@FindBy(id = "inlineRadio1")
	WebElement StartImediately;
	
	@FindBy(xpath = "//label[contains(text(),'Google')]")
	WebElement Source;
	
	@FindBy(id = "chkAgree")
	WebElement Terms;
	
	@FindBy(id = "btnSubmit")
	WebElement Submit;

	// Initializing Page Objects
	public R_EnquireNow() {
			PageFactory.initElements(driver, this); // this keyword will initialize all the object we have created for this
													// class to the driver
		}
	
	// Actions


		public String validatePageTitle() {
			return driver.getTitle();
		}

		public void enterFName() throws InterruptedException {
			FName.sendKeys("fake");
			Thread.sleep(2000);
		}
		
		public void enterLName() throws InterruptedException {
			LName.sendKeys("name");
			Thread.sleep(2000);
		}
		
		public void enterAddress() throws InterruptedException {
			Address.sendKeys("123 street");
			Thread.sleep(2000);
		}
		
		public void enterCity() throws InterruptedException {
			City.sendKeys("London");
			Thread.sleep(2000);
		}
		
		public void enterProvince() throws InterruptedException {
			Province.sendKeys("Ontario");
			Thread.sleep(2000);
		}
		
		public void enterPostalCode() throws InterruptedException {
			PostalCode.sendKeys("N5AB7D");
			Thread.sleep(2000);
		}
		
		public void enterPhone() throws InterruptedException {
			PhoneNumber.sendKeys("1234567890");
			Thread.sleep(2000);
		}
		
		public void enterEmail() throws InterruptedException {
			Email.sendKeys("abcd@gmail.com");
			Thread.sleep(2000);
		}
		
		public void checkEducation() throws InterruptedException {
			Education.click();
			Thread.sleep(2000);
		}
		
		public void enterSkills() throws InterruptedException {
			Skills.sendKeys("Good Programmer");
			Thread.sleep(2000);
		}
		
		public void enterExperience() throws InterruptedException {
			Experience.sendKeys("1");
			Thread.sleep(2000);
		}
		
		public void chooseCourse() throws InterruptedException {
			Select courseList = new Select(driver.findElement(By.name("course_id")));
			Thread.sleep(2000);
			courseList.selectByVisibleText("API");
			Thread.sleep(2000);
		}
		
		public void chooseDays() throws InterruptedException {
			Select daysList = new Select(driver.findElement(By.name("preferred_day")));
			Thread.sleep(2000);
			daysList.selectByVisibleText("Weekends");
			Thread.sleep(2000);
		}
		
		public void chooseTime() throws InterruptedException {
			Select timeList = new Select(driver.findElement(By.name("preferred_time")));
			Thread.sleep(2000);
			timeList.selectByVisibleText("Evening");
			Thread.sleep(2000);
		}
		
		public void checkStartTime() throws InterruptedException {
			StartImediately.click();
			Thread.sleep(2000);
		}
		
		public void checkSource() throws InterruptedException {
			Source.click();
			Thread.sleep(2000);
		}
		
		public void checkTerms() throws InterruptedException {
			Terms.click();
			Thread.sleep(2000);
		}
		
		public void clickSubmit() throws InterruptedException {
			Submit.click();
			Thread.sleep(2000);
		}

}












