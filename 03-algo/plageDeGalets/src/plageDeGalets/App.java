package plageDeGalets;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int nombreUtilisateur;
		
		 
		do {
			System.out.println("Saisissez un nombre entre 10 et 20");
			nombreUtilisateur = sc.nextInt();
			
		
			if (nombreUtilisateur > 20) {
			System.out.println("Plus petit !");
			}
		
			else if (nombreUtilisateur < 10) {
			System.out.println("Plus Grand !");
			}
			
		}
		while (nombreUtilisateur < 10 || nombreUtilisateur > 20);
		
		System.out.println("Yes, you did it ! ");
			
		
		sc.close();

	}

}
