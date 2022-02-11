package php_travels;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public WebDriver driver ;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException {


		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\eclipse-practice\\PHP_TRAVELS\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");


		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver.exe");

			driver=new ChromeDriver();
			driver.get("https://www.phptravels.net/flights");
		}
		

		driver.manage().window().maximize();
		return driver;

	}


	public String getScreenShot(String testCaseName,WebDriver driver) throws IOException {

		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String	destinationFile=System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";;
		FileUtils.copyFile(src,new File(destinationFile));
		return destinationFile;
	
	
	}


}
