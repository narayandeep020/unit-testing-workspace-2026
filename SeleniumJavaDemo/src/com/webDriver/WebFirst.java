package com.webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebFirst {
	public static void main(String[] args) throws InterruptedException {
		// Set up ChromeDriver path
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium_and_chromedriver_java8\\chromedriver-win64\\chromedriver.exe");

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();

		// Open a website
		driver.get("https://www.java.com");

		// Print page title
		System.out.println("Page Title: " + driver.getTitle());

		Thread.sleep(3000);

		// Close the browser
		driver.quit();
	}
}
