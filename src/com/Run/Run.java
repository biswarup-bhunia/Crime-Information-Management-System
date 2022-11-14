package com.Run;

import java.util.Scanner;

import com.Application.Main;
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

			System.out.println("Enter you choice :- ");
			System.out.println("Press & Enter 1. For add a Crimes ");
			System.out.println("Press & Enter 2. For add a Criminal ");
			System.out.println("Press & Enter 3. For searching Criminals data ");
			System.out.println("Press & Enter 4. For search the Crimes ");
			System.out.println("Press & Enter 5. For changes to the status on Crime File ");
			System.out.println("Press & Enter 6. For showcase the Number of solved and unsolved Crimes File ");
			System.out.println("Press & Enter 7. For showcase the no of crimes in the current month ");
			System.out.println("Press & Enter 8. For showcase the Area wise Crimes and Criminals ");
			System.out.println("Press & Enter 0. To Exit the  apllication :-");
			System.out.println();
			System.out.println();
			System.out.println("Enter you Choice :- ");

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
				System.out.println("Please Enter right Keyword :- ");
				break;

			}
			if (i == 1) {
				break;
			}

		}

	}

}
