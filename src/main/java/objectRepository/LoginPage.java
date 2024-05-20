package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//for declaration of webelements
	@FindBy(xpath = "//input[@name=\"username\"]")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement loginbtn;

	//initialization of WebElements
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//Accessing the WebElements

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	/**
	 * this is the business library  for login operation
	 * @param username
	 * @param password
	 * 
	 */
	public void login(String uname,String pass) {
		getUsername().sendKeys(uname);
		getPassword().sendKeys(pass);
		getLoginbtn().click();
	}
	


}
