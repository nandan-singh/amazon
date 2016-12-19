package com.quaatso.pageObjects;

public class HomePage extends Page {

	public void hoverMouseOverSignInElement() {
		// code to hover mouse hover signin element
	}

	/*
	 * on clicking sign-in button --> user moved to SignIn page
	 */
	public SignInPage clickOnSignInButton() {
		// code to click over signInButton
		return new SignInPage();
	}

	public void open() {
		driver.get("url");
	}

}
