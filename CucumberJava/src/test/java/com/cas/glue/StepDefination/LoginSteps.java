package com.cas.glue.StepDefination;

import org.openqa.selenium.support.PageFactory;

import com.cas.Framework.Keywords;
import com.cas.tests.pageobject.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("user on login page")
	public void user_on_login_page() {
	    //System.out.println("Inside Steps-user on login page");
	    Keywords.openBrowser();
	    Keywords.launchUrl();
	    LoginPage lp= PageFactory.initElements(Keywords.driver, LoginPage.class);
	    lp.enterUname("paragkharat123@gmail.com");
	    lp.enterPass("123434");
	    
	    LoginPage.ClickOnSignButton();
	}

//	@When("user enters username and password")
//	public void user_enters_username_and_password() {
//	    System.out.println("Inside Steps-user enters username and password");
//	}
//
//	@And("user click on login button")
//	public void user_click_on_login_button() {
//	    System.out.println("Inside Steps-user click on login button");
//	}
//
//	@Then("user is navigated to home page")
//	public void user_is_navigated_to_home_page() {
//	    System.out.println("Inside Steps-user is navigated to home page");
//	}
}
