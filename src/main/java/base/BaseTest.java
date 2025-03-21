import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest {
    static ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("reports/TestReport.html");
    static ExtentReports extent = new ExtentReports();
    static ExtentTest test;

    public static void startReport(String testName) {
        extent.attachReporter(htmlReporter);
        test = extent.createTest(testName);
    }

    public static void endReport() {
        extent.flush();
    }
}
