package com.venucvg.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestApplicationProperties {
	
	
  @Test
  public void TestURL() {
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
