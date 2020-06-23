package org.locators;

import org.baseclass.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Base {
	
	@FindBy(id="username")
	public WebElement usernameQuery; 
	
	public WebElement getUsernameQuery() {
		return usernameQuery;
	}

	public WebElement getPasswordQuery() {
		return passwordQuery;
	}

	public WebElement getForgotpassword() {
		return forgotpassword;
	}

	public WebElement getLoginButtton() {
		return loginButtton;
	}

	public WebElement getNewRegisterButton() {
		return newRegisterButton;
	}

	public WebElement getGoToBuild2() {
		return goToBuild2;
	}

	public WebElement getFooterElement() {
		return footerElement;
	}

	@FindBy(id="password")
	public WebElement passwordQuery;
	
	@FindBy(xpath="//div[@class=\"login_forgot\"]")
	public WebElement forgotpassword;
	
	@FindBy(id="login")
	public WebElement loginButtton;
	
	@FindBy(css="td[class=\"login_register\"]")
	public WebElement newRegisterButton;
	
	@FindBy(xpath="//strong[text()=\"Go to Build 2 \"]")
	public WebElement goToBuild2;
	
	@FindBy(xpath="//a[text()=\"Adactin.com\"]")
	public WebElement footerElement;
		
	
	public Loginpage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	

}
