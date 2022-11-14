package com.cims.userCases;

import java.util.Scanner;

import com.cims.Dao.CrimeInformationManagementSystemDao;
import com.cims.Dao.CrimeInformationManagementSystemDaoImpl;
import com.cimsExceptions.CrimeSystemException;

public class ShowsTheSOlvedANdUnSOlvedUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		CrimeInformationManagementSystemDao dao = new CrimeInformationManagementSystemDaoImpl();
		int i = 0;
		while (true) {

			System.out.println("Press & Enter 1. to showcase the solved case");

			System.out.println("Press & Enter 2. to showcase the unsolved case");

			System.out.println("Press & Enter 3. Go back to the home page :) ");
			System.out.println();
			System.out.println();
			System.out.println("Enter you Choice :- ");

			int n = sc.nextInt();
			switch (n) {

			case 1:
				try {
					int x = dao.NumberofCaseSolved();
					System.out.println();
					System.out.println("Total case_solved " + x + " :)");
				} catch (CrimeSystemException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;

			case 2:
				try {
					int y = dao.NumberofCaseUnSolved();
					System.out.println();
					System.out.println("Total case_unsolved " + y + " :'':");
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
				System.out.println("Please Enter the right Keyword :- ");
				break;

			}
			if (i == 1) {
				break;
			}

		}

	}

}
