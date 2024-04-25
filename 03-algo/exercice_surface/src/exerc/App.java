package exerc;

import java.util.Scanner;

import java.lang.Math;

public class App {

	public static void main(String[] args) {

		System.out.println("Calcul de la surface d'un secteur circulaire");
		
		double rayon;
		double corner;
		double air;
		
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Saisir le rayon");
		rayon = sc.nextDouble();
		
		System.out.println("Saisir le corner");
		corner = sc.nextDouble();
		
		System.out.println("Saisir l'air");
		air = ("rayon " + "corner ") / 360;
	   
		
		
		sc.close();
	}

}
