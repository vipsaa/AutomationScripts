package genericLibraryOrUtility;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
/**
 * This Is The Listeners Implementation Class To Monitor And Capture The TC and its Result
 * @author asta
 * @version 5.1.1
 */
public class ListernersImplimentationClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName + "Execution Started!!!!");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName + "Execution Successfull!!!!");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName + "Execution Failed!!!!");
		SeleniumUtility sutil = new SeleniumUtility();
		try {
			sutil.captureSS(methodName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
	Reporter.log(methodName + "Execution Skipped!!!!");
		
	}
	
	
		
	
	
}
