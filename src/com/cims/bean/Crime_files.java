package com.cims.bean;

public class Crime_files {

	private int case_no;

	private String date;
	private String victims;
	private String Details_of_crime;
	private String main_suspect;
	private String cname;
	private String status;
	private String area_of_crime;
	private int pincode;

	public String getAre_of_crime() {
		return area_of_crime;
	}

	public void setAre_of_crime(String are_of_crime) {
		this.area_of_crime = are_of_crime;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Crime_files() {
	}

	public Crime_files(int case_no, String date, String victims, String details_of_crime, String main_suspect,
			String cname, String area_of_crime, int pin, String st) {
		super();
		this.case_no = case_no;
		this.date = date;
		this.victims = victims;
		Details_of_crime = details_of_crime;
		this.main_suspect = main_suspect;
		this.cname = cname;
		this.area_of_crime = area_of_crime;
		this.pincode = pin;
		this.status = st;

	}

	public Crime_files(int case_no, String date, String victims, String details_of_crime, String main_suspect,
			String cname) {
		super();
		this.case_no = case_no;
		this.date = date;
		this.victims = victims;
		Details_of_crime = details_of_crime;
		this.main_suspect = main_suspect;
		this.cname = cname;
	}

	public Crime_files(String date, String victims, String details_of_crime, String main_suspect, String cname) {
		super();

		this.date = date;
		this.victims = victims;
		Details_of_crime = details_of_crime;
		this.main_suspect = main_suspect;
		this.cname = cname;
		this.status = "Progress";
	}

	public int getCase_no() {
		return case_no;
	}

	public void setCase_no(int case_no) {
		this.case_no = case_no;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVictims() {
		return victims;
	}

	public void setVictims(String victims) {
		this.victims = victims;
	}

	public String getDetails_of_crime() {
		return Details_of_crime;
	}

	public void setDetails_of_crime(String details_of_crime) {
		Details_of_crime = details_of_crime;
	}

	public String getMain_suspect() {
		return main_suspect;
	}

	public void setMain_suspect(String main_suspect) {
		this.main_suspect = main_suspect;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		System.out.println();
		System.out.println();
		return "********* Crime_files [case_no=" + case_no + ", Date=" + date + ", Victims=" + victims
				+ ", Details_of_crime=" + "\n" + Details_of_crime + ", Main_suspect=" + main_suspect + ", Crime-name="
				+ cname + ", Status-=" + status + "\n" + ",are_of_crime=" + area_of_crime + ", pincode=" + pincode
				+ "] *********";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
