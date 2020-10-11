package com.seluitest.pageObjects;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.seluitest.pageObjects.BasePage;
import com.seluitest.pageObjects.locators.CommonLocators;

public class HomePage extends BasePage{
		

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void goToHomePage() {
		driver.get("http://automationpractice.com/index.php");
		
	}

	public void login(String user, String pass) {
		click(CommonLocators.signIn);
		enterText(CommonLocators.emailLogin,user);
		enterText(CommonLocators.passwordLogin, pass);
		click(CommonLocators.submit);
			
	}
	
	

//	public static void main(String[] args) {
//
//		String path = System.getProperty("user.dir");
//		System.out.println(path);
//		
////		String chromepath = path + "/drivers/chromedriver";
////		System.setProperty("webdriver.chrome.driver", chromepath);
////		WebDriver driver = new ChromeDriver();
////		HomePage homepage = new HomePage(driver);
////		homepage.login("bipop5000@gmail.com","bipop5015");
//		
//	}
	
}
	

