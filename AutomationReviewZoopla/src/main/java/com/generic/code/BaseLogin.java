package com.generic.code;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.page.object.model.MasterPageFactoryLoginPage;
import com.util.BaseConfig;
import com.util.Highlighter;

public class BaseLogin {

public static WebDriver getLogin() throws IOException{
System.setProperty("webdriver. gecko. driver", "./Driver/geckodriver.exe");	
WebDriver driver = new FirefoxDriver();	
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

driver.get(BaseConfig.BaseConfigvalue("URL"));

MasterPageFactoryLoginPage pf = new MasterPageFactoryLoginPage(driver);


Highlighter.getcolor(driver, pf.getAcceptcookies());
pf.getAcceptcookies().click();

Highlighter.getcolor(driver, pf.getSignin());
pf.getSignin().click();

Highlighter.getcolor(driver, pf.getEmail());
pf.getEmail().sendKeys(BaseConfig.BaseConfigvalue("Email"));

Highlighter.getcolor(driver, pf.getPass());
pf.getPass().sendKeys(BaseConfig.BaseConfigvalue("Pass"));
Highlighter.getcolor(driver, pf.getSubmit());
pf.getSubmit().click();

return driver;
	
	
}
	

	
}
