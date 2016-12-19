package com.quaatso.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page {

	protected Header header = new Header();
	protected Footer footer = new Footer();

	WebDriver driver ; // a new instance of browser will be invoked

	// singleton pattern 
	public Page() {
		if (driver == null)
			driver = new FirefoxDriver(); // after first call a single object is created!!
	}

	/*
	 * 
	 * all code common to all pages of amazon should be here!!!!
	 */

}
