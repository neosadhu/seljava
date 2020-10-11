package com.seluitest.testCases;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class TestDataProvider {
	
//	@Test(dataProvider="DataContainer")
//	public void testfirstmethod(JsonElement j) {
//		System.out.println(j.getAsJsonObject().toString());
//		
//	}
	
	
	@Test(dataProvider="Testmethod")
	public void testSecondmethod(JsonObject j) {
		System.out.println(j);
		
	}
      
     
//    // A data provider which will provide single value to a test method thrice.
//    @DataProvider(name="DataContainer")
//    public Object[][] myDataProvider() throws FileNotFoundException {
//         
//		FileReader f =  new FileReader("/Users/cn183852/Desktop/seluitest/src/main/java/seluitest/jsonfile.json");
//		JsonArray jsonarr = new JsonParser().parse(f).getAsJsonArray();
//		Object [][] data = new Object[jsonarr.size()][1];
//		for (int i = 0; i < jsonarr.size(); i++) {
//            data[i][0] = jsonarr.get(i);
//        }
//		return data;
//    }

    // A data provider which will provide single value to a test method thrice.
    @DataProvider(name="Testmethod")
    public Object[][] myseconddataProvider() throws FileNotFoundException {
		
    	FileReader f =  new FileReader("/Users/cn183852/Desktop/seluitest/src/main/java/seluitest/jsonfile.json");
		JsonArray jsonarr = new JsonParser().parse(f).getAsJsonArray();
		Object [][] data = new Object[jsonarr.size()][1];
		for (int i = 0; i < jsonarr.size(); i++) {
            data[i][0] = jsonarr.get(i).getAsJsonObject();
        
		}
		return data;
        
    	}
    	
	

}
