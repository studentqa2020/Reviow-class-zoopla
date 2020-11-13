package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactoryLoginPage {

public	MasterPageFactoryLoginPage(WebDriver driver) {
PageFactory.initElements(driver, this); 	
}

	
	


@FindBy(xpath="//*[@class='ui-button-primary ui-cookie-accept-all-medium-large']")	
private WebElement acceptcookies;

@FindBy(xpath="(//*[@class='css-18j99f0 e11d441i1'])[4]")	
private WebElement signin;

@FindBy(xpath="//*[@id='signin_email']")
private WebElement email;

@FindBy(xpath="//*[@id='signin_password']")
private WebElement	pass;

@FindBy(xpath="//*[@id='signin_submit']")
private WebElement	submit;



public WebElement getAcceptcookies() {
	return acceptcookies;
}

public WebElement getSignin() {
	return signin;
}
public WebElement getEmail() {
	return email;
}
public WebElement getPass() {
	return pass;
}
public WebElement getSubmit() {
	return submit;
}







}
