package tc_Repo;

import genericLibraryOrUtility.BaseClass;
import genericLibraryOrUtility.ExcelUtility;
import objectRepository.DashboardPage;
import objectRepository.PimPage;

public class PI_01 extends BaseClass{
	public void pimModule() throws Exception {
		ExcelUtility eutil = new ExcelUtility();
		String empname=eutil.getSingleData("Pim", 1, 1);
		String eid = eutil.getSingleData("Pim", 1, 2);
		String sname = eutil.getSingleData("Pim", 1, 3);
		DashboardPage dp = new DashboardPage(driver);
		dp.clickonpim();
		
		
		PimPage ppage = new PimPage(driver);
		ppage.validinputsonpimpage(empname, eid, sname);
		System.out.println("Pim Module Test Done");
		
		
	}

}
