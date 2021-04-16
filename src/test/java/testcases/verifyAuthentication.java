package testcases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectcases.loginPage;
import objectcases.registerPage;
import utility.BrowserFactory;
import utility.Guru99Reports;

public class verifyAuthentication {

	static public WebDriver driver = BrowserFactory.startBrowser("chrome", "http://demo.guru99.com/test/newtours/index.php");
	static public registerPage signup = new registerPage(driver);
	static public loginPage login = new loginPage(driver);
	static public Guru99Reports report = new Guru99Reports();

	@BeforeTest
	public void extentReport() {
		report.config();
	}

	
	@Test(priority = 1)
	public void registerClick() {
		report.GetreportName("register click");
		signup.RegisterButtonclick();
	}
	
	@Test(priority = 2)
	public void fillDetails() throws InterruptedException {
		report.GetreportName("fill details");
		signup.UserdetailsForm(
				"Sayak", 
				"Lahiri",
				"7980712754",
				"firefox.mozila1999@gmail.com",
				"Agarpara",
				"Kolkata", 
				"West Bengal", 
				"700058");
		
		//to select dropdown
		signup.Countrydropdown("INDIA");
		
		//to register user by User name and password
		signup.User_Information("Sayak","8697594232","8697594232");
		
		//click to navigate to signIn page
		signup.SignInClick();
		
	}
	
	

	@Test(priority=3)
	public void login() {
		report.GetreportName("login page ");
		login.Login_Guru99("Sayak","8697594232");
	}

	@AfterTest
	public void close() {
		driver.quit();
		report.reportFlush();
	}


}
