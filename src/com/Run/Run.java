package com.Run;

import java.util.Scanner;

import com.Application.App;
import com.cims.Dao.CrimeInformationManagementSystemDao;
import com.cims.Dao.CrimeInformationManagementSystemDaoImpl;
import com.cims.userCases.CrimesStatusUsecase4;
import com.cims.userCases.RegisCrimeUseCase1;
import com.cims.userCases.RegisCriminalUseCase2;
import com.cims.userCases.SearchByTheArea;
import com.cims.userCases.SearchingCurrentMonth;
import com.cims.userCases.SearchingFacilityForCrimes;
import com.cims.userCases.SearchingfacilityUseCase3;
import com.cims.userCases.ShowsTheSOlvedANdUnSOlvedUseCase;

public class Run {

	public static final CrimeInformationManagementSystemDao dao = new CrimeInformationManagementSystemDaoImpl();

	public static void runnablechoice() {

		Scanner sc = new Scanner(System.in);
		int i = 0;
		int choice = 0;
		while (true) {

			System.out.println("Enter you choice !-:)");

			System.out.println("Enter 1. if you want add a crimes");

			System.out.println("Enter 2. if you want add a criminal");

			System.out.println("Enter 3. if you want search by the criminals");
			System.out.println("Enter 4. if you want search by the crimes");

			System.out.println("Enter 5. changes to the status of the crime_file");

			System.out.println("Enter 6. display the Number of solved and unsolved crimes_file");

			System.out.println("Enter 7. display the no of crimes in the current month");
			System.out.println("Enter 8. display the Area_wise_ Crimes AND Criminals ");
			System.out.println("Enter 9. To Exit this  apllication :)");
			System.out.println();
			System.out.println();
			System.out.println("ENter you CHoice :) ");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				RegisCrimeUseCase1.main(null);
				break;
			case 2:

				RegisCriminalUseCase2.main(null);

				break;
			case 3:
				SearchingfacilityUseCase3.main(null);

				break;

			case 4:
				SearchingFacilityForCrimes.main(null);
				break;

			case 5:
				CrimesStatusUsecase4.main(null);
				break;

			case 6:

				ShowsTheSOlvedANdUnSOlvedUseCase.main(null);
				break;

			case 7:
				SearchingCurrentMonth.main(null);
				break;

			case 8:

				SearchByTheArea.main(null);
				break;
			case 9:
				i = 1;
				break;

			default:
				System.out.println("Please Enter right Keyword :) -");
				break;

			}
			if (i == 1) {
				break;
			}

		}

	}

}
