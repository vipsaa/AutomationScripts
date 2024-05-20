package genericLibraryOrUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import objectRepository.DashboardPage;
import objectRepository.LoginPage;

public class BaseClass {
	/**
	 * This is the Base Class for all the common fields
	 * @author asta
	 * @version 5.1.1
	 * 
	 */

	public static WebDriver driver = null;
	public PropertiesUtility putil = new PropertiesUtility();
	
@BeforeSuite
public void connectdb() {
	System.out.println("DB Connection succesfull");
}

@BeforeSuite
	public void launchBrowser() throws Exception {
		String URL = putil.getDataFromProperties("url");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(URL);
		System.out.println("Browser Launched Successfully");
	}
	@BeforeSuite
	public void loginuser() throws Exception {
		String USERNAME = putil.getDataFromProperties("username");
		String PASSWORD = putil.getDataFromProperties("password");
		LoginPage lp = new LoginPage(driver);
		lp.login(USERNAME, PASSWORD);
		System.out.println("Login Operations Done");
	}
	@AfterMethod
	public void logout() {
		DashboardPage dp = new DashboardPage(driver);
		dp.logoutop();
		System.out.println("Log Out Done");
		
	}
@AfterClass
	public void closeBrowser() {
		driver.quit();
		System.out.println("Browser CLosed");
	}
	@AfterSuite
	public void closeDbCOnnection() {
		System.out.println("Db Connection CLosed Successfully");
	}
	

	
}
