package objectcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class registerPage {
WebDriver driver;
	
	public registerPage(WebDriver driver) {
        this.driver = driver;
    	PageFactory.initElements(driver, this);
    	
}
	
	//register button click
	@FindBy(xpath="//a[contains(text(),'REGISTER')]")
	WebElement registerLink;
	
	//Selecting Form Details 
	@FindBy(xpath="//input[@name='firstName']")
	WebElement fname;
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lname;
	@FindBy(xpath="//input[@name='phone']")
	WebElement phone;
	@FindBy(xpath="//input[@id='userName']")
	WebElement email;
	@FindBy(xpath="//input[@name='address1']")
	WebElement adress;
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	@FindBy(xpath="//input[@name='state']")
	WebElement state;
	@FindBy(xpath="//input[@name='postalCode']")
	WebElement pc;
	@FindBy(xpath="//select[@name='country']") 
	WebElement country;

	//User information 
	@FindBy(xpath="//input[@id='email']")
	WebElement userName;
	@FindBy(xpath="//input[@name='password']")
	WebElement pass1;
	@FindBy(xpath="//input[@name='confirmPassword']")
	WebElement pass2;
	@FindBy(xpath="//input[@name='submit']")
	WebElement submit;
	
	//click to navigate on signin page
	@FindBy(linkText="sign-in")
	WebElement signInClick;

	public void RegisterButtonclick() {
		registerLink.click();
	}
	//form fillUp
	public void UserdetailsForm
	(
			String fname,
			String lname,
			String phone,
			String email,
			String adress,
			String city,
			String state,
			String pc
			) throws InterruptedException{
		
		this.fname.sendKeys(fname);
		this.lname.sendKeys(lname);
		this.phone.sendKeys(phone);
		this.email.sendKeys(email);
		this.adress.sendKeys(adress);
		this.city.sendKeys(city);
		this.state.sendKeys(state);
		this.pc.sendKeys(pc);
		this.country.click();
		Thread.sleep(3000);
		

	}
	
	//select country dropdown
		public void Countrydropdown(String cName) {
			Select dropdown = new Select(country); 
			dropdown.selectByVisibleText(cName);
			
		}
		
	
	
	//user registration
	public void User_Information(String uid, String pass , String pass_1) throws InterruptedException {
	
		userName.sendKeys(uid);
		Thread.sleep(3000);
		pass1.sendKeys(pass);
		Thread.sleep(3000);
		pass2.sendKeys(pass_1);
		submit.click();
	}

	//click to navigate in sign in page
	public void SignInClick() throws InterruptedException {
		Thread.sleep(3000);
		signInClick.click();
	}
	
	


}
