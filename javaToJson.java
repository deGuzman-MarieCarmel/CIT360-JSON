package javaJsonParsing;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class javaToJson {
	
	private static final String filePath = "C:\\Users\\marie\\git\\CIT360\\javaJsonParsing\\src\\javaJsonParsing\\myProfile.json";

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();

        myProfile profile = createProfile();
        
        try {

            // Java objects to JSON file
            mapper.writeValue(new File(filePath), profile);
            
            // print Java objects to JSON string
            String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(profile);
            System.out.println(jsonInString);
        }
        
        catch (IOException e) {
            e.printStackTrace();
        }

	}
	
	private static myProfile createProfile() {

		myProfile profile = new myProfile();

		profile.setName("Kylie de Guzman");
		profile.setAge(14);
		profile.setOccupation(new String[]{"student", "fan fiction writer", "mia maid president"});
		profile.setHobbies(Arrays.asList("writing", "singing", "watching TV"));

        return profile;

    }

}
