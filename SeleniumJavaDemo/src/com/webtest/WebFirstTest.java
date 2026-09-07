package com.webtest;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WebFirstTest {

	private WebDriver driver;

	@Before
	public void setUp() {
		// Point to your ChromeDriver executable
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium_and_chromedriver_java8\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void testJavaHomePageTitle() {
		driver.get("https://www.java.com");
		String title = driver.getTitle();
//		System.out.println(title);
		assertEquals("Java | Oracle", title);
	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
