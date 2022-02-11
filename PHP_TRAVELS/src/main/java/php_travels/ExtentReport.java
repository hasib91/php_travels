package php_travels;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	public static ExtentReports getReportObject() {
		
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("PHP_TRAVELS_Demo Automation");
		reporter.config().setDocumentTitle("Test Results");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Hasib Chaudhary");
		
		return extent;
		
		
	}
}
