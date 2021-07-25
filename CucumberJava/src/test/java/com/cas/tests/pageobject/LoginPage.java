package com.cas.tests.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cas.Framework.Keywords;
public class LoginPage {
static // static By signin= By.xpath("//button[@name='login']");
	WebElement login;
	WebElement email;
	WebElement pass;
	
	public void enterUname(String value) {
		email.sendKeys(value);
	}
	public void enterPass(String password) {
		pass.sendKeys(password);
	}
	
public static  void ClickOnSignButton() {
	login.click();
}


}
