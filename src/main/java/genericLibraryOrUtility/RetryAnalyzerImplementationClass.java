package genericLibraryOrUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementationClass  implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		int count = 1;
		int retrycount=3;
		while(count<=retrycount) {
			count++;
			return true;
		}
		return false;
	}
	
}
