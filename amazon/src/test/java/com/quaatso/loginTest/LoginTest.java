package com.quaatso.loginTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.quaatso.pageObjects.HomePage;
import com.quaatso.pageObjects.SignInPage;
import com.quaatso.pageObjects.UserPage;

public class LoginTest {

	HomePage homePage;
	UserPage userPage;
	SignInPage signInPage;

	@BeforeMethod
	public void init() {
		homePage = new HomePage();
		homePage.open();
	}

	@Test
	public void verifyLoginWithValidCredential() {
		homePage.hoverMouseOverSignInElement();
		signInPage = homePage.clickOnSignInButton();
		signInPage.enterUserName("dummyUserName");
		signInPage.enterPassword("password");
		userPage = signInPage.clickOnLoginButton();
		String actualTitle = userPage.getUserPageTitle();
		String expectedTitle = "expectedTitle";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
