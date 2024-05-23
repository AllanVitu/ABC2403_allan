package paiementMonnaie;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		double total =0;
		double montantPaye = 0;
		double renduMonnaie = 0;
		
		
		int billets5Euros = 0;
		int pieces2Euros =0;
		int pieces50Cents = 0;
		int pieces20Cents = 0;
		int pieces10Cents = 0;
		
		
		System.out.println("Saisir un prix (0 pour terminer) : ");
		while (true) {
			double prix = sc.nextDouble();
			if (prix == 0) {
				break;
			}
		
			total += prix;
		}
		
		System.out.println("Le client doit payer : " + total + " Euros.");
		
		montantPaye = Math.ceil(total / 5) * 5;
		billets5Euros = (int) (montantPaye / 5);
		renduMonnaie = montantPaye - total;
		
		System.out.println("Le client doit donner " + billets5Euros + " billets de 5 Euros soit " + montantPaye + " Euros.");
        System.out.println("Rendu monnaie : " + renduMonnaie + " Euros.");
        
        while (renduMonnaie <= 2) {
        	renduMonnaie -= 0.2;
        	pieces2Euros++;
        }
        
        while (renduMonnaie >= 0.5) {
            renduMonnaie -= 0.5;
            pieces50Cents++;
        }

        while (renduMonnaie >= 0.2) {
            renduMonnaie -= 0.2;
            pieces20Cents++;
        }

        while (renduMonnaie >= 0.1) {
            renduMonnaie -= 0.1;
            pieces10Cents++;
        }
        
        System.out.println("Répartition de la monnaie à restituer au client : ");
        System.out.println("- " + pieces2Euros + " pièce(s) de 2 Euros");
        System.out.println("- " + pieces50Cents + " pièce(s) de 0.50 Euros");
        System.out.println("- " + pieces20Cents + " pièce(s) de 0.20 Euros");
        System.out.println("- " + pieces10Cents + " pièce(s) de 0.10 Euros");

        
		sc.close();
	}

}
