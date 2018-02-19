package com.qa.uiAdidas;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qa.uiAdidas.pages.HomePage;

import junit.framework.Assert;

/**
 * @author royki
 */
public class HomePageTest extends TestBase {
	
	HomePage hp;
	
	public HomePageTest() {
		super();
	}
	
	@Before
	public void setUp() {
		initialization();
		hp = new HomePage();		
	}
	
	@Test
	public void homePageTitle() {
		String title = hp.HomePageTitle();
		Assert.assertEquals(title, "adidas virallinen verkkosivusto | adidas Suomi");
	}
	
	@Test
	public void logoTest() {
		boolean flag = hp.adidasLogo();
		Assert.assertTrue(flag);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
