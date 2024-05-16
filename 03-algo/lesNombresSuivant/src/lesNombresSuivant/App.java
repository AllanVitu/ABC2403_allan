package lesNombresSuivant;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nombreUtilisateur;
		
		int plusDix = 1;
		
		
		System.out.println("Entrez un nombre :");
		nombreUtilisateur = sc.nextInt();
		
		while (plusDix <= 10) {
			System.out.println(nombreUtilisateur + plusDix + " " );
			plusDix++;
		}
		
	
		sc.close();
	}

}
