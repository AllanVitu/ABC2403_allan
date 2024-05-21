package grandEst;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nombreUtilisateur;
		int plusGrand = Integer.MIN_VALUE;
		
		for (int i = 1; i <= 20; i++) {
			System.out.println("Saisissez un nombre " + i + " : ");
			nombreUtilisateur = sc.nextInt();
			
		if (nombreUtilisateur > plusGrand) {
			plusGrand = nombreUtilisateur;
		}
	}
		
		System.out.println("Le plus grand des nombres saisis est : " + plusGrand);
		
		sc.close();
	}

}
