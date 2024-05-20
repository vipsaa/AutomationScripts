package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This Is a Business Library For admin page
 * @author asta
 * @version 5.1.1
 */

public class AdminPage {
	@FindBy(xpath = "(//input[@class=\"oxd-inpput oxd-input--active\"])[2]")
	private WebElement username;
	
	@FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
	private WebElement empname;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement searchbtn;

	public AdminPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getEmpname() {
		return empname;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
	public void validinputs(String uname, String ename) {
		getUsername().sendKeys(uname);
		getEmpname().sendKeys(ename);
		//getSearchbtn().click();
	}
	

}
