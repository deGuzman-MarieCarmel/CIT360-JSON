package javaJsonParsing;

import java.util.List;

public class myProfile {
	
	private String name;
	private int age;
	private String[] occupation;              //  Array
	private List<String> hobbies;            //  List
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String nameStr) {
		this.name = nameStr;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(	int ageNum) {
		this.age = ageNum;
	}
	
	public String[] getOccupation() {
		return this.occupation;
	}
	
	public void setOccupation(String[] occupationStr) {
		this.occupation = occupationStr;
	}
	
	public List<String> getHobbies() {
		return this.hobbies;
	}
	
	public void setHobbies(List<String> hobbiesStr) {
		this.hobbies = hobbiesStr;
	}

}
