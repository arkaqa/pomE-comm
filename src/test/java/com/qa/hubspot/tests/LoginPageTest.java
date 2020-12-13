package com.qa.hubspot.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hubspot.base.BaseTest;
import com.qa.hubspot.utils.Constants;

public class LoginPageTest extends BaseTest {

	
	@Test(priority=1)
	public void verifyLoginPageTitleTest() {
		String title = loginpage.getLoginPageTitle();
		System.out.println("Login page title is: " +title);
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
		
	}
	@Test
	public void verifyForgottenLinkExists() {
		boolean forgottenLink = loginpage.isForgottenLinkExists();
		Assert.assertTrue(forgottenLink);
	}
	@Test
	public void verifyLogin() {
		loginpage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
	}
}
