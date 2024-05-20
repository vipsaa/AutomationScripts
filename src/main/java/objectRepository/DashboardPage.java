package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	@FindBy(xpath = "//span[text() ='Admin']")
	private WebElement admin;
	
	@FindBy (xpath = "//span[text() ='PIM']")
	private WebElement pim;
	
	@FindBy (xpath = "//span[text() ='Claim']")
	private WebElement claim;
	
	@FindBy (xpath ="//span[@class='oxd-userdropdown-tab']")
	private WebElement dropdown;
	
	@FindBy (xpath = "//a[text()='Logout']")
	private WebElement logout;

	
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public WebElement getAdmin() {
		return admin;
	}


	public WebElement getPim() {
		return pim;
	}


	public WebElement getClaim() {
		return claim;
	}


	public WebElement getDropdown() {
		return dropdown;
	}


	public WebElement getLogout() {
		return logout;
	}
	
	
	public void logoutop() {
		getDropdown().click();
		getLogout().click();

		
	}
	public void clickonadmin() {
		getAdmin().click();
	}

	public void clickonadminandlogout() {
		getAdmin().click();
		logoutop();
	}
	
	public void clickonpim() {
		getPim().click();
	}
	public void clickonpimandlogout() {
		getPim().click();
		logoutop();
	}
	
	public void clickonclaim() {
		getClaim().click();
	} 
	public void clickonclaimandlogout() {
		getClaim().click();
		logoutop();
	}
}
