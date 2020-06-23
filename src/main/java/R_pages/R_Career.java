package R_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import R_base.R_TestBase;

public class R_Career extends R_TestBase {
	
	// Page Factory
	
	@FindBy(name = "first_name")
	WebElement FName;
	
	@FindBy(name = "last_name")
	WebElement LName;
	
	@FindBy(name = "email")
	WebElement Email;
	
	@FindBy(name = "Phone")
	WebElement Phone;
	
	@FindBy(name = "gender")
	WebElement Gender;
	
	@FindBy(name = "job_post")
	WebElement JobPost;
	
	@FindBy(name = "message")
	WebElement Message;
	
	@FindBy(name = "file")
	WebElement File;
	
	@FindBy(xpath = "//button[@class='btn btn-block btn-dark btn-theme-colored btn-sm mt-20 pt-10 pb-10']")
	WebElement ApplyNow;
	
	// Initializing Page Objects
		public R_Career() {
				PageFactory.initElements(driver, this); 
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
		
		public void enterEmail() throws InterruptedException {
			Email.sendKeys("abcd@gmail.com");
			Thread.sleep(2000);
		}
		
		public void enterPhone() throws InterruptedException {
			Phone.sendKeys("1234567890");
			Thread.sleep(2000);
		}
		
		public void chooseGender() throws InterruptedException {
			Select GSelection = new Select(driver.findElement(By.name("gender")));
			Thread.sleep(2000);
			GSelection.selectByVisibleText("Female");
			Thread.sleep(2000);
		}
		
		public void chooseJobPost() throws InterruptedException {
			Select JobSelection = new Select(driver.findElement(By.name("job_post")));
			Thread.sleep(2000);
			JobSelection.selectByVisibleText("Job 03");
			Thread.sleep(2000);
		}
		
		public void enterMessage() throws InterruptedException {
			Message.sendKeys("This is test message");
			Thread.sleep(2000);
		}
		
		public void fileUpload() throws InterruptedException {
			WebElement upload = driver.findElement(By.id("file"));
			Thread.sleep(2000);
			upload.sendKeys("/Users/BlacK_BearD/Downloads/Xpath-vs-CSS.pdf");
			Thread.sleep(2000);
		}
		
		public void applyNow() throws InterruptedException {
			ApplyNow.click();
			Thread.sleep(5000);
		}
	
	

}
