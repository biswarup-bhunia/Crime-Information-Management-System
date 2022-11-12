package com.cims.userCases;

import java.util.Scanner;

import com.cims.Dao.CrimeInformationManagementSystemDao;
import com.cims.Dao.CrimeInformationManagementSystemDaoImpl;
import com.cimsExceptions.CrimeSystemException;

public class CrimesStatusUsecase4 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String value=null;
		int n = 0 ;
		CrimeInformationManagementSystemDao dao =  new CrimeInformationManagementSystemDaoImpl() ;
		while(true) {
			

			System.out.println("ENter case_no of crime - file ");
		        n = sc.nextInt();
			System.out.println("enter 1  change to solved ");
			System.out.println("enter 2  change to unsolved ");
			System.out.println("enter 3  Go back to the home page :) ");
			System.out.println();
			System.out.println();
			System.out.println("ENter you CHoice :) ");
			int st = sc.nextInt();
			
			if(st == 1) {
				value = "Solved" ;
				
			}else if(st==2) {
				value = "Unsolved";
				
			}else if(st==3) {
			break;
				
			}else {
				System.out.println("Enter right keyword :)");
			}
			
			try {
				String res= dao.CrimebychangeStatus(n, value);
				System.out.println(res);
			} catch (CrimeSystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	

		
		
		
		
		
		
		

	}

}
