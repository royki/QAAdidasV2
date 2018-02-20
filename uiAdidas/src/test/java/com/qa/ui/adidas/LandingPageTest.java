package com.qa.ui.adidas;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ui.adidas.pages.LandingPage;
import com.qa.ui.adidas.pages.SignupPage;

/**
 * @author royki
 */

public class LandingPageTest extends TestBase {

	LandingPage landpage;
	// SignupPage signuppage;

	public LandingPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		landpage = new LandingPage();
	}

	@Test(priority=1)
	public void landingPageTitleTest() {
		String title = landpage.homePageTitle();
		System.out.print(title);
		Assert.assertEquals(title, "adidas virallinen verkkosivusto | adidas Suomi");
	}

	@Test(priority=2)
	public void logoAdidasTest() {
		boolean flag = landpage.adidasLogo();
		Assert.assertTrue(flag);
	}

	@Test(priority=3)
	public void registerPageTest() {
		landpage = landpage.Register(prop.getProperty("firstName"), prop.getProperty("lastName"), prop.getProperty("day"),
				prop.getProperty("month"), prop.getProperty("year"), prop.getProperty("email"),
				prop.getProperty("password"));
		// Assert.assertEquals(arg0, arg1);		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
