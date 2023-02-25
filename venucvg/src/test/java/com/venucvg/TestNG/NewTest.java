package com.venucvg.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
	
  @Test
  public void Google() {
	  driver.get("https://www.google.com/");
  }
  @BeforeTest
  public void IntializeBrowser() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void TearDown() {
	  driver.quit();
  }

}
