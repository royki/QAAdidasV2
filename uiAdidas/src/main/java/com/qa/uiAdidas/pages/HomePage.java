package com.qa.uiAdidas.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.uiAdidas.TestBase;

/**
 * 
 * @author royki
 *
 */

public class HomePage extends TestBase {
	
	// Object Repository of HomePage
	@FindBy(xpath="//A[@manual_cm_sp='customer_info-_-Sign in']") // //*[@id=\"app\"]/div/div[1]/div[1]/div/div/div[1]/div/div/a[3]
	WebElement signin;
	
	@FindBy(xpath="//A[@data-auto-id='logo']") // /html/body/div[2]/div/div[1]/div[1]/div/div/div[2]/div/a
	WebElement logo;
	
	// Initialize Home Page Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String HomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean adidasLogo() {
		return logo.isDisplayed();
	}
	
	
}
