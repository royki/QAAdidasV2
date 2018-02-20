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
 
// TODO - Refactor Code, custome-xpath
public class LandingPage extends TestBase {
	
	// Object Repository of HomePage

	@FindBy(xpath = "//A[@manual_cm_sp='customer_info-_-Sign in']") // //*[@id=\"app\"]/div/div[1]/div[1]/div/div/div[1]/div/div/a[3]
	WebElement signin;

	@FindBy(xpath = "//A[@data-auto-id='logo']") // /html/body/div[2]/div/div[1]/div[1]/div/div/div[2]/div/a
	WebElement logo;

//	@FindBy(linkText="Sign in")
//	WebElement signIn;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/div[1]/div/div/div[1]/div/div/a[3]")
	WebElement signIn;
	
//	@FindBy(linkText="Register")
//	WebElement register;
	
	@FindBy(xpath="//*[@id=\"frameContainer\"]/div[2]/div/a")
	WebElement register;
	
	@FindBy(id="dwfrm_profile_customer_firstname")
	WebElement firstName;
	
	@FindBy(id="dwfrm_profile_customer_lastname")
	WebElement lastName;
	
	@FindBy(id="dwfrm_profile_customer_birthday_dayofmonth")
	WebElement putDay;
	
	@FindBy(id="dwfrm_profile_customer_birthday_month")
	WebElement putMonth;
	
	@FindBy(id="dwfrm_profile_customer_birthday_year")
	WebElement putYear;

	@FindBy(id="dwfrm_profile_login_username")
	WebElement userName;
	
	@FindBy(id="dwfrm_profile_login_newpassword")
	WebElement passWord;
	
	@FindBy(xpath = "//form[@id='dwfrm_profile']/fieldset/div[9]/div/label/i")
	WebElement checkBox1;
	
	@FindBy(xpath = "//form[@id='dwfrm_profile']/fieldset/div[10]/label/i")
	WebElement checkBox2;
	
	@FindBy(id="recaptcha-verify-button")
	WebElement captchaVerify;
	
	@FindBy(name="dwfrm_profile_register")
	WebElement submitBtn;
	
	@FindBy(xpath = "//div[@id='app']/div/div[2]/div/div[2]/header/div/a/i")
	WebElement closePopup;
	
	
	// Initialize Home Page Objects
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String homePageTitle() {
		closePopup.click();
		return driver.getTitle();
	}

	
	public boolean adidasLogo() {
		closePopup.click();
		return logo.isDisplayed();
	}
	
	public LandingPage Register(String fname, String lname, String d, String m, String y, String u, String p){
		closePopup.click();
		signIn.click();
		register.click();
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		putDay.sendKeys(d);
		putMonth.sendKeys(m);
		putYear.sendKeys(y);
		userName.sendKeys(u);
		passWord.sendKeys(p);
		checkBox1.click();
		checkBox2.click();
		submitBtn.click();		
		return new LandingPage();
	}
	
	
}
