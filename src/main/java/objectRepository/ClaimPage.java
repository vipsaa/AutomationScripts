package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClaimPage {
	/**
	 * This is a Business Library for Claim page
	 * @author asta
	 * @version 5.1.1
	 */
	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
	private WebElement empname;
	
	@FindBy(xpath = "(//input[@placeholder=\"Type for hints...\"])[2]")
	private WebElement refid;

	public ClaimPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getEmpname() {
		return empname;
	}

	public WebElement getRefid() {
		return refid;
	}
	
	public void validinputsinclaimpage(String ename,String rid) {
		getEmpname().sendKeys(ename);
		getRefid().sendKeys(rid);
	}
	
	
}
