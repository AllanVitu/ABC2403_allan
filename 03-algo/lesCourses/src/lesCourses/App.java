package lesCourses;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int factoriellede8 = App.calculerFactorielle(8);
		int factoriellede16 = App.calculerFactorielle(16);
		
		int n = 8;
		int p = 2;
		
		int X = App.calculerFactorielle(n) / App.calculerFactorielle((n -p));

	}
	
	public static int calculerFactorielle(int nombreUtilisateur) {

		int sommeFactorielle = 1;
		
		for(int i = 1; i <= nombreUtilisateur; i++) {
			sommeFactorielle *= i;
		}
		
		return sommeFactorielle;
	}

}
