package com.cims.model;

public class Criminal {
	
	
	private int cri_Id ;
	
	public int getCri_Id() {
		return cri_Id;
	}
	public void setCri_Id(int cri_Id) {
		this.cri_Id = cri_Id;
	}
	public String getCri_name() {
		return cri_name;
	}
	public void setCri_name(String cri_name) {
		this.cri_name = cri_name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdentification() {
		return Identification;
	}
	public void setIdentification(String identification) {
		Identification = identification;
	}
	public String getArea_of_crime() {
		return Area_of_crime;
	}
	public void setArea_of_crime(String area_of_crime) {
		Area_of_crime = area_of_crime;
	}
	public int getCrime_file() {
		return crime_file;
	}
	public void setCrime_file(int crime_file) {
		this.crime_file = crime_file;
	}
	public int getArea_pincode() {
		return area_pincode;
	}
	public void setArea_pincode(int area_pincode) {
		this.area_pincode = area_pincode;
	}
	@Override
	public String toString() {
		System.out.println();
		return "********* Criminal -> Criminal-Id=" + cri_Id + ", Criminal-Name=" + cri_name + ",Criminal-Age=" + Age + ", Gender=" + gender
				+ "\n"+"Address=" + address + ", Identification-Mark=" + Identification + ", Area_of_crime=" + Area_of_crime
				+ "\n"+", Crime_file-No=" + crime_file + ", Area_pincode=" + area_pincode + "] *********";
	}
	
	public Criminal() {
		// TODO Auto-generated constructor stub
	}
	
	public Criminal(int cri_Id, String cri_name, int age, String gender, String address, String identification,
			String area_of_crime, int crime_file, int area_pincode) {
		super();
		this.cri_Id = cri_Id;
		this.cri_name = cri_name;
		Age = age;
		this.gender = gender;
		this.address = address;
		Identification = identification;
		Area_of_crime = area_of_crime;
		this.crime_file = crime_file;
		this.area_pincode = area_pincode;
	}
	public Criminal( String cri_name, int age, String gender, String address, String identification,
			String area_of_crime, int crime_file, int area_pincode) {
		super();
		
		this.cri_name = cri_name;
		Age = age;
		this.gender = gender;
		this.address = address;
		Identification = identification;
		Area_of_crime = area_of_crime;
		this.crime_file = crime_file;
		this.area_pincode = area_pincode;
	}
	private String cri_name ;
	private int Age ;
	
	private String gender ;
	private String address ;
	private String Identification ;
	private String Area_of_crime;
	private int crime_file;
	private int area_pincode;
	
	
	
	
	
	
	

}
