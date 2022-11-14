package com.cims.userCases;

import java.util.Scanner;

import com.cims.Dao.CrimeInformationManagementSystemDao;
import com.cims.Dao.CrimeInformationManagementSystemDaoImpl;
import com.cims.bean.Crime_files;

public class RegisCrimeUseCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Press & Enter Date in this format yyyy/mm/dd ");

			String dt = sc.nextLine();

			System.out.println("Press & Enter Victims ");

			String vt = sc.nextLine();

			System.out.println("Press & Enter of Crime Name like Robbery,Snatching etc !! ");

			String dtcrime = sc.nextLine();

			System.out.println("Press & Enter main Suspect Name ");

			String suspect = sc.nextLine();

			System.out.println("Press & Enter Description of Crime ");

			String descrime = sc.nextLine();
			System.out.println("Press & Enter area of Crime ");

			String area = sc.nextLine();

			System.out.println("Press & Enter pincode of Area ");

			int pin = sc.nextInt();

			Crime_files cf = new Crime_files(dt, vt, descrime, suspect, dtcrime);
			cf.setAre_of_crime(area);
			cf.setPincode(pin);

			CrimeInformationManagementSystemDao dao = new CrimeInformationManagementSystemDaoImpl();

			String ans = dao.registerCrimeFile(cf);

			System.out.println(ans);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Please Enter right data : ");
		}

	}

}
