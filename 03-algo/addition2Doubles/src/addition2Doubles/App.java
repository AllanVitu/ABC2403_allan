package addition2Doubles;

import java.util.Scanner;

public class App {
	
	public static String prenomNom(String prenom, String nom) {
		
		String retour;
		
			
		retour = prenom + " " + nom;
		
		System.out.println(prenom + " " + nom);
		
		return retour;
	}

	public static void main(String[] args) {
		
		App.prenomNom("Mickael", "Devoldere");
		
		double resultat = App.additionner(2, 3);
		
	}

	public static double additionner(double valeur1, double valeur2) {
		
		double somme = 0;
		
		somme = valeur1 + valeur2;
		
		return somme;
	}
	
	
}

