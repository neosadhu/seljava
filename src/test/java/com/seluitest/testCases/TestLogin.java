package com.seluitest.testCases;

import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.seluitest.pageObjects.HomePage;
import com.seluitest.pageObjects.locators.CommonLocators;

public class TestLogin {
	
    
	WebDriver driver;
	HomePage homePage;
	String[] str = {"Data1","Data2","Data3"};

	

//	@BeforeTest
//	public void setUp() {
//		String path = System.getProperty("user.dir");
//		System.out.println(path);
//		
//		String chromepath = path + "/drivers/chromedriver";
//		System.setProperty("webdriver.chrome.driver", chromepath);
//		driver = new ChromeDriver();
//		homePage = new HomePage(driver);
//		homePage.goToHomePage();
//		
//	}
//	
////	@AfterTest
////	public void tearDown() {
////		driver.quit();
////	}
//	
//
//	
//	@Test
//	public void testlog() {
//		homePage.login("bipop5000@gmail.com", "bipop5015");
//		
//	}
//	
//	
//	
//	@Test(dataProvider ="dp")
//	public void testSearchtwo(String searchQuery) {
//		homePage.enterText(CommonLocators.searchBox, searchQuery);
//		homePage.click(CommonLocators.searchSubmit);
//
//	}
//	
//	@Test
//	public void testClickCart() {
//		homePage.click(CommonLocators.cart);
//		
//	}
//	
//	@DataProvider(name="dp")
//	public Object[][] getData(){
//		
//		Object[][] data = new Object[str.length][1];
//		for (int i = 0; i< str.length; i++) {
//			data[i][0] = str[i];
//		}
//		
//		return data;
//	}
//	
//	
//	
//	
	
	
//	@DataProvider(name="dataprovider")
//	public Object[][] dprovider(){
//		
//	      HashMap<String, String> hash_map = new HashMap<String, String>();
//	      hash_map.put("1", "One"); 
//	      hash_map.put("2", "Two"); 
//	      hash_map.put("3", "Three"); 
//	      
//	      
//	      return new Object[][]{
//	          {hash_map}
//	      };
//
//	}

	
	@Test(dataProvider = "dataprovider")
//	public void newtest(String s) {
	public void newtest() {
		System.out.println("test");
		
	}

};
	



