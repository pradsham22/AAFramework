package resources;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterFR {
	static ExtentReports extent;
	
	public static ExtentReports getExtentReport() {
		String path = System.getProperty("user.dir") + "\\reports\\Index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Amazon IN - Automation Test");
		reporter.config().setDocumentTitle("Automation Test Summary");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Pradeep B.");
//		System.out.println(path);
		return extent;
		
		
	}
}
