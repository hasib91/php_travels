package php_travel_test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import php_travels.Driver;
import php_travels_pages.LoginPage;

public class LoginTest extends  Driver{

	public WebDriver driver;

	public static Logger log =LogManager.getLogger(Driver.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		log.info("Initializing..");
		driver=initializeDriver();		
	}

	@Test
	public void login() throws InterruptedException {
		LoginPage login=new LoginPage(driver);	
		login.click("Login");
		login.userId((prop.getProperty("userName")));
		login.userPass((prop.getProperty("passWord")));
		login.click("submit");
		assertEquals(login.get(), "Hi, Tester Welcome Back");
	}

}


