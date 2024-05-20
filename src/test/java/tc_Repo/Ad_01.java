package tc_Repo;

import org.testng.annotations.Test;
import genericLibraryOrUtility.BaseClass;
import genericLibraryOrUtility.ExcelUtility;
import objectRepository.AdminPage;
import objectRepository.DashboardPage;

public class Ad_01 extends BaseClass{
 @Test(retryAnalyzer = genericLibraryOrUtility.RetryAnalyzerImplementationClass.class)
 public void Adminmodule() throws Exception {
	 ExcelUtility eutil = new ExcelUtility();
	 String USERNAME = eutil.getSingleData("Admin",1,1);
	 String EMPNAME = eutil.getSingleData("Admin",1,2);
	 DashboardPage dp = new DashboardPage(driver);
	 dp.clickonadmin();
	
	 
	 
	 AdminPage ap = new AdminPage(driver);
	ap.validinputs(USERNAME, EMPNAME);
	System.out.println("Admin Module Test Done");
	 
 }
	
}
