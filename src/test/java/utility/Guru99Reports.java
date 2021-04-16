package utility;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Guru99Reports {
	
	ExtentReports extent;
	
	public void config()

	{

	// ExtentReports , ExtentSparkReporter

	String path =System.getProperty("user.dir")+"\\reports\\guru99Reports.html";

	ExtentSparkReporter reporter = new ExtentSparkReporter(path);

	reporter.config().setReportName("Guru 99 Reports");

	reporter.config().setDocumentTitle("Guru99");

	extent = new ExtentReports();

	extent.attachReporter(reporter);

	extent.setSystemInfo("Testing Team", "Red Team");

	}
	
	public void GetreportName(String reportName) {
		extent.createTest(reportName);
	}
	public void reportFlush() {
		extent.flush();
	}


}
