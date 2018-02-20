package com.qa.ui.adidas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author royki
 *
 */

// BaseClass
public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	/**
	 * Base resources DIR
	 */
	public static final String BASE_RESOURCES_FOLDER = "/src/test/resources/";

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fs = new FileInputStream(
					System.getProperty("user.dir") + BASE_RESOURCES_FOLDER +"config.properties");
			prop.load(fs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browser = prop.getProperty("browser");

		if (System.getProperty("os.name").contains("Linux")) {
			if (browser.equalsIgnoreCase("firefox")) {
				System.out.println(System.getProperty("user.dir"));
				// Firefox
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + BASE_RESOURCES_FOLDER + "geckodriver.exe");
				driver = new FirefoxDriver();
			}
			// Chrome
			else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + BASE_RESOURCES_FOLDER + "chromedriver.exe");
				driver = new ChromeDriver();
			}
		}
		// For Windows
		else if (System.getProperty("os.name").contains("Window")) {
			if (browser.equalsIgnoreCase("firefox")) {
				System.out.println(System.getProperty("user.dir"));
				// Firefox
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + BASE_RESOURCES_FOLDER + "geckodriver.exe");
				driver = new FirefoxDriver();
			}
			// Chrome
			else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + BASE_RESOURCES_FOLDER + "chromedriver.exe");
				driver = new ChromeDriver();
			}
		}
		// For Mac
		else if (System.getProperty("os.name").contains("Mac")) {
			System.out.println(System.getProperty("os.name"));
			// Firefox
			if (browser.equalsIgnoreCase("firefox")) {
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.firefox.marionette",
						System.getProperty("user.dir") + BASE_RESOURCES_FOLDER + "geckodriver");
				driver = new FirefoxDriver();
			}
			// Chrome
			else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + BASE_RESOURCES_FOLDER + "chromedriver");
				driver = new ChromeDriver();
			}
		}

		// Browser Settings
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		/*
		 * Need to refactor of different wait. For one page it's sufficient to test
		 */
		driver.manage().timeouts().pageLoadTimeout(TestConfig.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestConfig.IMPLICIT_WAIT, TimeUnit.SECONDS);

		// Initialize the Browsers
		driver.get(prop.getProperty("url"));
	}
}
