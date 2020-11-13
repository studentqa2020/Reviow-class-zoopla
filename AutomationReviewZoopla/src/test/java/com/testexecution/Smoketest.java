package com.testexecution;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.generic.code.BaseLogin;

public class Smoketest {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		driver = BaseLogin.getLogin();
		
		driver.quit();
	}	
	
	
}
