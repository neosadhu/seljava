package seluitest;

import java.util.HashMap;

public class Scratch {

	public Scratch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	      
		
		HashMap<String, String> hash_map = new HashMap<String, String>();
	      hash_map.put("1", "One"); 
	      hash_map.put("2", "Two"); 
	      hash_map.put("3", "Three"); 
	      
	      Object[][] obj = new Object[][] {{hash_map}};
	      
	     System.out.println(hash_map.get("1")); // key = 1 value = One
	     
	     //System.out.println(obj[0][0].get("1"));
	     
	     System.out.println(((HashMap<String, String>) obj[0][0]).get("1"));

		
	}
}


