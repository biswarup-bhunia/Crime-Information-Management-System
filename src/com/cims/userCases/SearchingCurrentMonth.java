package com.cims.userCases;

import java.time.LocalDate;
import java.time.Month;

import com.cims.Dao.CrimeInformationManagementSystemDao;
import com.cims.Dao.CrimeInformationManagementSystemDaoImpl;
import com.cimsExceptions.CrimeSystemException;

public class SearchingCurrentMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate currentdate = LocalDate.now();
//		int currentDay = currentdate.getDayOfMonth();

		Month currentMonth = currentdate.getMonth();
		CrimeInformationManagementSystemDao dao =  new CrimeInformationManagementSystemDaoImpl() ;
		try {
		int 	x= dao.NumberofCrimeCurrentMonth();
		System.out.println("This "+currentMonth +" therea are "+x+ " crimes ");
		} catch (CrimeSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
