package ParallelWithBaseTest;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Factory.ComplexReportFactory;

public class Test001P extends BaseTest {

	@Test
	public void test001() {
		long startTime = System.nanoTime();
		ExtentTest testReporter = ComplexReportFactory.getTest();
		testReporter.log(LogStatus.INFO, "Starting test test001");
		int a = 100;
		int b = 30;

		testReporter.log(LogStatus.INFO, "Loading the value of a to " + a);
		testReporter.log(LogStatus.PASS, "Loading the value of b to " + b);
	    System.out.println("The time spent on test001 " + (System.nanoTime() - startTime)/100000);
	}

	@Test
	public void test002() {
		long startTime = System.nanoTime();
		ExtentTest testReporter = ComplexReportFactory.getTest();
		testReporter.log(LogStatus.INFO, "Starting test test002");
		int a = 100;
		int b = 30;

		testReporter.log(LogStatus.INFO, "Loading the value of a to " + a);
		testReporter.log(LogStatus.FAIL, "Loading the value of b to " + b);
		System.out.println("The time spent on test002 " + (System.nanoTime() - startTime)/100000);
	}

}
