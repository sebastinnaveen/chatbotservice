package com.vz;



import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
@RequestMapping("/chatbot")
public class chatController {

	chatInformation ochat = new chatInformation();
	@RequestMapping(value="/{chatInput}",method=RequestMethod.GET,produces={MediaType.APPLICATION_JSON_VALUE})
	public String getResponse(@PathVariable("chatInput") String chatInput) throws ParseException
	{
		
		String apiResponse = "[{\"action\":\"get\",\"zipcode\":\"\",\"text\":\"verizon offers\"}]";
		  String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
		 JSONParser parser = new JSONParser();
		 Object objParse = parser.parse(apiResponse);
         JSONArray array = (JSONArray)objParse;
         JSONObject jsonApiRes = (JSONObject)array.get(0);
         System.out.println(array.size());
         
         if(jsonApiRes.get("zipcode")!=null && jsonApiRes.get("zipcode")!="")
         {
        	 ochat.title = "Fios offers";
        	 ochat.desc="Fios triple play offers at $69.99";
        	 ochat.url="http://www.verizon.com";
        	 
         }
         else
         {
        	 ochat.title = (String) jsonApiRes.get("text");
        	 ochat.desc="Pelase enter your zipcode";
        	 ochat.url="";
         }
		
		Gson gson = new Gson();
		String json = gson.toJson(ochat);
		System.out.println(json);
		return json;
		
	}
}
