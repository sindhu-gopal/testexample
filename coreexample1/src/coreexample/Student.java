package coreexample;

public class Student {
	public static int Id;
	private String Name;
	private char gender;
	private int Telugumarks;
	private int Hindimarks;
	private int Mathsmarks;
	private int Sciencemarks;
	private int Socialmarks;
	
	public int getId() {
		return Id;
	}
	//this: to refer/access the current class properties and methods
	public void setId(int id) {
		this.Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getTelugumarks() {
		return Telugumarks;
	}
	public void setTelugumarks(int telugumarks) {
		Telugumarks = telugumarks;
	}
	public int getHindimarks() {
		return Hindimarks;
	}
	public void setHindimarks(int hindimarks) {
		Hindimarks = hindimarks;
	}
	public int getMathsmarks() {
		return Mathsmarks;
	}
	public void setMathsmarks(int mathsmarks) {
		Mathsmarks = mathsmarks;
	}
	public int getSciencemarks() {
		return Sciencemarks;
	}
	public void setSciencemarks(int sciencemarks) {
		Sciencemarks = sciencemarks;
	}
	public int getSocialmarks() {
		return Socialmarks;
	}
	public void setSocialmarks(int socialmarks) {
		Socialmarks = socialmarks;
	}

	

}
