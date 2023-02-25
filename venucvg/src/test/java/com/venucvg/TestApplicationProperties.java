package com.venucvg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestApplicationProperties {
	/**
	 * @author Venu Gopal
	 * How to get URL, Title, HTML Page Source using Selenium WebDriver?
	 */

	public static void main(String[] args) {
		
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("http://www.seleniumhq.org");
			
			//URL
			String currentUrl = driver.getCurrentUrl();
			System.out.println("Current URL - "+currentUrl);
			
			//Title
			String title = driver.getTitle();
			System.out.println("Title - "+title);
			
			//HTML Page Source
			String pageSource = driver.getPageSource();
			System.out.println(pageSource);
			
			driver.quit();
		 
	}

}
