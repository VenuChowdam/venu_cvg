package com.venucvg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDowns {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		
		//Single selection dropdown
//		WebElement courseElement = driver.findElement(By.id("course"));
//		Select courseNameDropdown = new Select(courseElement);
//		List<WebElement> courseNameDropdownOptions = courseNameDropdown.getOptions();
//		for (WebElement option : courseNameDropdownOptions) {
//			System.out.println(option.getText());
//		}
//		courseNameDropdown.selectByIndex(1);  //Java
//		Thread.sleep(3000);
//		courseNameDropdown.selectByValue("net");  //Dot net
//		Thread.sleep(3000);
//		courseNameDropdown.selectByVisibleText("Javascript");  //Javascript
//		Thread.sleep(3000);
//		String selectedText = courseNameDropdown.getFirstSelectedOption().getText();
//		System.out.println("Selected visible text -" +selectedText);
//		driver.quit();
		
		//Multiful selection dropdowns
		WebElement ideElement = driver.findElement(By.id("ide"));
		Select ideElementDropdown = new Select(ideElement);
		List<WebElement> ideElementDropdownOptions = ideElementDropdown.getOptions();
		for (WebElement option : ideElementDropdownOptions) {
			System.out.println(option.getText());
		}
		ideElementDropdown.selectByIndex(0);  //Eclipse
		Thread.sleep(3000);
		ideElementDropdown.selectByValue("ij");  //IntelliJ Idea
		Thread.sleep(3000);
		ideElementDropdown.selectByVisibleText("NetBeans");  //NetBeans
		Thread.sleep(3000);
		
		ideElementDropdown.deselectByValue("nb");
		
		List<WebElement> selectedOptions = ideElementDropdown.getAllSelectedOptions();
		for (WebElement selectedOption : selectedOptions) {
			System.out.println("Selected visible text -"+selectedOption.getText());
			
		}
		driver.quit();

	}

}
