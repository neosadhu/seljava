package com.seluitest.pageObjects.locators;

import org.openqa.selenium.By;

public class CommonLocators {
	
	public static By emailLogin = By.xpath("//input[@name = 'email' and @id = 'email']");
	public static By passwordLogin = By.xpath("//input[@name = 'passwd' and @id = 'passwd']");
	public static By signIn = By.xpath("//a[normalize-space(text())='Sign in']");
	public static By signOut = By.xpath("//a[normalize-space(text())='Sign out']");
	public static By submit = By.xpath("//button[contains(@id,'SubmitLogin')]");	
	public static By searchBox = By.xpath("//input[contains(@name,'search_query')]");
	public static By searchError = By.xpath("//p[contains(@class, 'alert-warning')]");
	public static By cart = By.xpath("//a[contains(@title, 'View my shopping cart')]");
	public static By searchSubmit = By.xpath("//button[@name = 'submit_search']");

}

