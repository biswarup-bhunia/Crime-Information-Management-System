package com.cims.userCases;

import java.util.Scanner;

import com.cims.Dao.CrimeInformationManagementSystemDao;
import com.cims.Dao.CrimeInformationManagementSystemDaoImpl;
import com.cims.model.Crime_files;
import com.cims.model.Criminal;

public class RegisCriminalUseCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		try {

		System.out.println("Enter Criminal name");

		String cn = sc.nextLine();

		System.out.println("Enter age ");

		int age = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter Gender ");

		String gender = sc.nextLine();

		System.out.println("Enter Address");

		String add = sc.nextLine();

		System.out.println("Enter Indefication");

		String iden = sc.nextLine();
		System.out.println("Enter Area of police station where the criminal was first arrest");

		String area = sc.nextLine();
		System.out.println("Enter pincode of substation");

		int pin = sc.nextInt();
		System.out.println("Enter Case file id");

		int caseid = sc.nextInt();

		Criminal cr = new Criminal(cn, age, gender, add, iden, area, caseid, pin);

		
		
		CrimeInformationManagementSystemDao dao =  new CrimeInformationManagementSystemDaoImpl() ;
		
		
		String ans = dao.registerCriminal(cr);
		
		System.out.println(ans);
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Please ENter right data :) ");
		}

	}

}
