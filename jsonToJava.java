package javaJsonParsing;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class jsonToJava {

	private static final String filePath = "C:\\Users\\marie\\git\\CIT360\\javaJsonParsing\\src\\javaJsonParsing\\myProfile.json";
	
	public static void main(String[] args) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		 try {			 
	            // JSON file to Java object
	            myProfile profile = mapper.readValue(new File(filePath), myProfile.class);
	            
	           // print Java Object
	           String printProfile = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(profile);
	           System.out.println(printProfile);
	        } 
		 
		 catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
