package com.cims.userCases;

import java.util.Scanner;

import com.cims.Dao.CrimeInformationManagementSystemDao;
import com.cims.Dao.CrimeInformationManagementSystemDaoImpl;
import com.cims.model.Crime_files;

public class RegisCrimeUseCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {

		System.out.println("Enter Date in this format yyyy/mm/dd");

		String dt = sc.nextLine();

	

		System.out.println("Enter Victims ");

		String vt = sc.nextLine();

		System.out.println("Enter of crime Name like robbery kinadping etc !!");

		String dtcrime = sc.nextLine();

		System.out.println("Enter main suspect name ");

		String suspect = sc.nextLine();


		System.out.println("Enter Description of crime");

		String descrime = sc.nextLine();
		System.out.println("Enter area of crime ");

		String area= sc.nextLine();
		
		System.out.println("Enter pincode of area");

		int pin = sc.nextInt();
	   
		       Crime_files cf = new Crime_files(dt,vt, descrime, suspect, dtcrime) ;
		       cf.setAre_of_crime(area) ;
		       cf.setPincode(pin);
		
		
		CrimeInformationManagementSystemDao dao =  new CrimeInformationManagementSystemDaoImpl() ;
		
		
		String ans = dao.registerCrimeFile(cf);
		
		System.out.println(ans);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Please ENter right data :) ");
		}

	}

}
