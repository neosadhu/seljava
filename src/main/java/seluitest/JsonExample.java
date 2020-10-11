package seluitest;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class JsonExample {

	public static void main(String[] args) throws JsonIOException, JsonSyntaxException, FileNotFoundException {
		
		FileReader f =  new FileReader("/Users/cn183852/Desktop/seluitest/src/main/java/seluitest/jsonfile.json");

		//JsonObject jsonobject = new JsonParser().parse(f).getAsJsonObject();
		
		JsonArray jsonarr = new JsonParser().parse(f).getAsJsonArray();
		System.out.println(jsonarr.get(1));
		JsonObject jk = jsonarr.get(1).getAsJsonObject();
		
		for (JsonElement j : jsonarr) {
			//System.out.println(j);
			JsonObject json = j.getAsJsonObject();
			System.out.println(json.get("testCase"));
		}
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
