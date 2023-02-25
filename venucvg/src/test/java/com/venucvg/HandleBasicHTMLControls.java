package com.venucvg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Venu Gopal
 * How to handle the links,buttons,radio buttons and checkboxes using selenium webdriver?
 */
public class HandleBasicHTMLControls {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		WebElement hindichk = driver.findElement(By.id("hindichbx"));
		hindichk.click();
		Thread.sleep(3000);
		if(hindichk.isSelected()) 
			hindichk.click();
		Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		driver.quit();
		
	}

}
