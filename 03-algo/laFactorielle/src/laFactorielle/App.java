package laFactorielle;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nombreUtilisateur;
		int sommeFactorielle = 1;
		
		System.out.println("Saisissez un nombre");
		nombreUtilisateur = sc.nextInt();
		
		for(int i = 1; i <= nombreUtilisateur; i++) {
			sommeFactorielle *= i;
		}
		
		System.out.println("La factorielle de " + nombreUtilisateur + " est " + sommeFactorielle);
		
		
		sc.close();
	}
	
	
	

}
