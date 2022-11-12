package com.cims.userCases;

import java.util.List;
import java.util.Scanner;

import com.cims.Dao.CrimeInformationManagementSystemDao;
import com.cims.Dao.CrimeInformationManagementSystemDaoImpl;
import com.cims.model.Crime_files;
import com.cims.model.Criminal;
import com.cimsExceptions.CrimeSystemException;

public class SearchingfacilityUseCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for the criminals database
		Scanner sc = new Scanner(System.in);

		CrimeInformationManagementSystemDao dao = new CrimeInformationManagementSystemDaoImpl();

		int i = 0;

		while (true) {

			System.out.println("ENter 1. if you want to Search by the criminal name ");

			System.out.println("ENter 2. if you want to Search by the crimes id ");

			System.out.println("ENter 3. Go back to the home page :) ");
			System.out.println();
			System.out.println();
			System.out.println("ENter you CHoice :) ");
			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				System.out.println();
				sc.nextLine();
				System.out.println("ENter criminal name ");
				String name = sc.nextLine();

				List<Criminal> res = null;
				try {
					res = dao.searchbyCriminalName(name);
					res.forEach(s -> System.out.println(s));
				} catch (CrimeSystemException e) {
					// TODO Auto-generated catch block
					System.out.println( e.getMessage());
				}

				

				break;

			case 2:
				System.out.println();
				System.out.println("ENter criminal Id ");
				sc.nextLine();
				int id = sc.nextInt();
				Criminal res1 = null;
				try {
					res1 = dao.searchbyCriminalID(id);
					System.out.println(res1);
				} catch (CrimeSystemException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			
				break;

			case 3:
				i = 1;
				break;

			default:
				System.out.println();
				System.out.println("Please ENter correct keyword :)");
				break;

			}
			if (i == 1) {
				break;
			}

		}

	}

}
