package com.qa.ui.adidas.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ui.adidas.TestBase;

/**
 * 
 * @author royki
 *
 */

public class HomePage extends TestBase {
	
	@FindBy(xpath="//div[@id='app']/div/div[2]/div/div[2]/main/div/div[2]/a/span[2]")
	WebElement selectCountry;
	
	@FindBy(id="africa")
	WebElement africa;
	
	@FindBy(id="americas")
	WebElement americas;
	
	@FindBy(id="asia-pacific")
	WebElement asia_pacific;
	
	
	@FindBy(id="europe")
	WebElement europe;
	
	
	@FindBy(id="middle-east")
	WebElement middle_east;
	
	
	@FindBy(id="other")
	WebElement other;

	// Object Repository of HomePage
	@FindBy(xpath = "//A[@manual_cm_sp='customer_info-_-Sign in']") // //*[@id=\"app\"]/div/div[1]/div[1]/div/div/div[1]/div/div/a[3]
	WebElement signin;

	@FindBy(xpath = "//A[@data-auto-id='logo']") // /html/body/div[2]/div/div[1]/div[1]/div/div/div[2]/div/a
	WebElement logo;

	// Initialize Home Page Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage selectCountry() {
		selectCountry.click();
		africa.click();
		americas.click();
		asia_pacific.click();
		europe.click();
		middle_east.click();
		
		return new HomePage();
	}
	
	public String HomePageTitle() {
		return driver.getTitle();
	}

	public boolean adidasLogo() {
		return logo.isDisplayed();
	}
}
