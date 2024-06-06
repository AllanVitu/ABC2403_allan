package addition2Doubles;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
	
	public static String prenomNom(String prenom, String nom) {
		
		String retour;
		
			
		retour = prenom + "." + nom;
		
		return retour;
	}
	
	public static double additionner(double valeur1, double valeur2) {
		
		double somme = 0;
		
		somme = valeur1 + valeur2; // Paramètre
		
		return somme;
	}
	
	public static void afficherJourHeureDuMoment() {
	    
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    
	    Date date = new Date();
	    
	    System.out.println(s.format(date));
	}
	
	public static void ajouterUneTaxeAUnPrix(float prix) {
		
		float taux1 = 5.5f;
		
		float prix1 = 10;
		
	}

	public static void main(String[] args) {
		
		String prenom = "Mickael";
		
		String nom = "DEVOLDERE";
		
		
		
		String resultat = App.prenomNom(prenom, nom);
		
		
		System.out.println(resultat);
		
		
		double resultat2 = App.additionner(2, 3); // argument
		
		
		App.afficherJourHeureDuMoment();
		
		System.out.println();
	}
	
}

