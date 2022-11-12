package com.cims.Dao;

import java.util.List;

import com.cims.model.Crime_files;
import com.cims.model.Criminal;
import com.cimsExceptions.CrimeSystemException;

public interface CrimeInformationManagementSystemDao {

	public String registerCriminal(Criminal c) ;
	
	public String registerCrimeFile(Crime_files c) ;
	
	public Criminal searchbyCriminalID(int id )throws CrimeSystemException ;
	
	public  List<Criminal> searchbyCriminalName(String name)throws CrimeSystemException ;
	
	
	public  Crime_files searchbyCrimesbyID(int id )throws CrimeSystemException ;
	
	public  List<Crime_files> searchbyCrimesName(String name)throws CrimeSystemException ;
	
	public  String CrimebychangeStatus(int id ,  String value)throws CrimeSystemException ;
	
	
	public int NumberofCaseSolved()throws CrimeSystemException;
	public int NumberofCaseUnSolved()throws CrimeSystemException;
	
	public int NumberofCrimeCurrentMonth()throws CrimeSystemException;
	
	public List<Crime_files> displaycrimebyArea(String area, int pin)throws CrimeSystemException  ;

	public List<Criminal> displaycriminalbyArea(String area , int pin) throws CrimeSystemException ;
}
