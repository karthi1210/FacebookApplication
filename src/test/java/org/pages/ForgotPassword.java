package org.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class ForgotPassword extends BaseClass{
	
	public ForgotPassword() {
	
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
			private WebElement forgottenPassword;
	
	@FindBy(css ="input#identify_email")
	private WebElement inputMobOrEmail;
	
	@FindBy(css ="button#did_submit")
	private WebElement searchButton;

	public WebElement getForgottenPassword() {
		return forgottenPassword;
	}

	public WebElement getInputMobOrEmail() {
		return inputMobOrEmail;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	

}
