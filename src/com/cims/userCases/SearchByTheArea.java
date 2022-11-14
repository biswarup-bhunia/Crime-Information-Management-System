package com.cims.userCases;

import java.util.List;
import java.util.Scanner;

import com.cims.Dao.CrimeInformationManagementSystemDao;
import com.cims.Dao.CrimeInformationManagementSystemDaoImpl;
import com.cims.bean.Crime_files;
import com.cims.bean.Criminal;
import com.cimsExceptions.CrimeSystemException;

public class SearchByTheArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		CrimeInformationManagementSystemDao dao = new CrimeInformationManagementSystemDaoImpl();
		int i = 0;
		while (true) {

			System.out.println("Press & Enter 1. to display the area wise crimes ");

			System.out.println("Press & Enter 2. to display the area wise criminal ");

			System.out.println("Press & Enter 3. Go back to the home page : ");
			System.out.println();
			System.out.println();
			System.out.println("Enter you Choice :- ");

			int n = sc.nextInt();
			sc.nextLine();
			switch (n) {

			case 1:
				try {

					System.out.println("Enter area name ");
					String name = sc.nextLine();

					System.out.println("Enter  area pin_Code ");

					int pin = sc.nextInt();
					List<Crime_files> x = dao.displaycrimebyArea(name, pin);
					System.out.println();

					x.forEach(s -> System.out.println(s));

				} catch (CrimeSystemException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;

			case 2:
				try {

					System.out.println("Enter area name ");
					String name = sc.nextLine();

					System.out.println("Enter  area pin_Code ");
					int pin = sc.nextInt();
					List<Criminal> x = dao.displaycriminalbyArea(name, pin);
					System.out.println();

					x.forEach(s -> System.out.println(s));
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
				System.out.println("Please Enter the right Keyword : ");
				break;

			}
			if (i == 1) {
				break;
			}

		}
	}

}
