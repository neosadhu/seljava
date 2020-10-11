package com.seluitest.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//http://automationpractice.com/index.php

public class BasePage {
	
	public WebDriver driver;
	
	public static String PAGE_URL= "http://automationpractice.com/index.php";
	
	public BasePage (WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void click(By locator) {		
		WebDriverWait wait = new WebDriverWait(driver,5);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.click();
		
		
	}
		
	public void enterText(By locator, String text) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.sendKeys(text);
		
		
		
	}
	

}
