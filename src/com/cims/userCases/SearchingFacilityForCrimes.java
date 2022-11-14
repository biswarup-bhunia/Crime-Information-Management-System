package com.cims.userCases;

import java.util.List;
import java.util.Scanner;

import com.cims.Dao.CrimeInformationManagementSystemDao;
import com.cims.Dao.CrimeInformationManagementSystemDaoImpl;
import com.cims.bean.Crime_files;
import com.cims.bean.Criminal;
import com.cimsExceptions.CrimeSystemException;

public class SearchingFacilityForCrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		CrimeInformationManagementSystemDao dao = new CrimeInformationManagementSystemDaoImpl();

		int i = 0;

		while (true) {
			System.out.println();
			System.out.println("Press & Enter 1. if you want to Search by the crime_: name ");

			System.out.println("Press & Enter 2. if you want to Search by the Case :_file no ");

			System.out.println("Press & Enter 3. Go back to the home page : ");
			System.out.println();
			System.out.println();
			System.out.println("Enter you Choice :) ");
			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				System.out.println();
				System.out.println("Enter crime name: ");
				sc.nextLine();
				String name = sc.nextLine();

				List<Crime_files> res = null;
				try {
					res = dao.searchbyCrimesName(name);
					res.forEach(s -> System.out.println(s));
				} catch (CrimeSystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			case 2:
				System.out.println();
				System.out.println("Enter case:_file no ");
				sc.nextLine();
				int id = sc.nextInt();
				Crime_files res1 = null;
				try {
					res1 = dao.searchbyCrimesbyID(id);
					System.out.println(res1);
				} catch (CrimeSystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			case 3:
				i = 1;
				break;
			default:
				System.out.println();
				System.out.println("Please Enter correct keyword :-");
				break;

			}
			if (i == 1) {
				break;
			}

		}

	}

}
