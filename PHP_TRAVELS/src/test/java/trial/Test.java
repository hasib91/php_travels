package trial;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.get("https://www.phptravels.net/flights");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@class='theme-btn theme-btn-small theme-btn-transparent ml-1 waves-effect']")).click();

		driver.findElement(By.name("email")).sendKeys("user@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demouser");

		driver.findElement(By.xpath("//button/span[contains(.,'Login')]")).click();












		//WebDriver driver=new WebDriver();


		////		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//		//sts
		//		
		//		
		////		  WebDriverWait wait=new WebDriverWait(driver,10);
		////		  wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		//		
		//		
		//		
		//		
		//		//Demo Code
		//
		//
		//
		//		driver.get("https://www.hotstar.com/in");
		//		driver.manage().window().maximize();
		//
		//		

	}



	//		driver.get("https://eccportal.kalelogistics.com/login");
	//		driver.findElement(By.xpath("//input[@formcontrolname='EmailId']")).sendKeys("admin@shpl.com");;
	//		driver.findElement(By.xpath("//input[@formcontrolname='Password']")).sendKeys("@dm!n@2020");;
	//		driver.findElement(By.tagName("button")).click();

	//		Thread.sleep(5000);
	//		
	//		HomeDashboardPage hp=new HomeDashboardPage(driver);
	//		hp.click("+");


}

