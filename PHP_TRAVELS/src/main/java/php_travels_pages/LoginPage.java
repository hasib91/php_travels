package php_travels_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import php_travels.Driver;

public class LoginPage extends Driver{

	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}


	public void userId(String label) {
		driver.findElement(By.name("email")).sendKeys(label);
	}

	public void userPass(String label) {
		driver.findElement(By.name("password")).sendKeys(label);
	}

	public void click(String label) {
		if(label.equals("Login"))
			driver.findElement(By.xpath("//a[@class='theme-btn theme-btn-small theme-btn-transparent ml-1 waves-effect']")).click();


		if(label.equals("submit"))
			driver.findElement(By.xpath("//button/span[contains(.,'Login')]")).click();

	}


	public String get() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(By.xpath("//section[@class=dashboard-area]//div/h2 ")).getText();
	}






}
