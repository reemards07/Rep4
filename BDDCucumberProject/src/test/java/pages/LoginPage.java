package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
	@FindBy(xpath="//span[@class='user-display']")
	WebElement userDisplayTxt;
	
	public void login(String uname, String pword) {
		email.sendKeys(uname);
		pwd.sendKeys(pword);
		loginBtn.click();
	}
	
	public String confirmLogin() {
		String userDisplayText=userDisplayTxt.getText();
		return userDisplayText;
	}
}
