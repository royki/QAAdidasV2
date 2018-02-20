package com.qa.ui.adidas.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ui.adidas.TestBase;
import com.qa.ui.adidas.TestConfig;

/**
 * 
 * @author royki
 *
 */

public class SelectCountryPage extends TestBase{

	
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
	
	public void selectCountryPage() {
		PageFactory.initElements(driver, this);
		selectCountry.click();	
		driver.manage().timeouts().implicitlyWait(TestConfig.IMPLICIT_WAIT, TimeUnit.SECONDS);
		africa.click();
		driver.manage().timeouts().implicitlyWait(TestConfig.IMPLICIT_WAIT, TimeUnit.SECONDS);
		americas.click();
		driver.manage().timeouts().implicitlyWait(TestConfig.IMPLICIT_WAIT, TimeUnit.SECONDS);
		asia_pacific.click();
		driver.manage().timeouts().implicitlyWait(TestConfig.IMPLICIT_WAIT, TimeUnit.SECONDS);
		europe.click();
		driver.manage().timeouts().implicitlyWait(TestConfig.IMPLICIT_WAIT, TimeUnit.SECONDS);
		middle_east.click();	
		driver.manage().timeouts().implicitlyWait(TestConfig.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.navigate().back();
	}
}
