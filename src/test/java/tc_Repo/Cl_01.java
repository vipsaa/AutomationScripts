package tc_Repo;

import genericLibraryOrUtility.BaseClass;
import genericLibraryOrUtility.ExcelUtility;
import objectRepository.ClaimPage;
import objectRepository.DashboardPage;

public class Cl_01 extends BaseClass{
		public void claimModule() throws Exception {
			ExcelUtility eutil = new ExcelUtility();
			String ename =eutil.getSingleData("Claim", 1, 1);
			String refid = eutil.getSingleData("Claim", 1, 2);
			DashboardPage dp = new DashboardPage(driver);
			dp.clickonclaim();
			
			
			ClaimPage cp = new ClaimPage(driver);
			cp.validinputsinclaimpage(ename, refid);
			System.out.println("Claim Page Test Done");
	 
 }
}
