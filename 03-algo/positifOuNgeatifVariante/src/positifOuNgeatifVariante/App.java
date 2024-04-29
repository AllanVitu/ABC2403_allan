package positifOuNgeatifVariante;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int nombreEntier;
		
		System.out.println("Saisissez un nombre entier");
		
		nombreEntier = sc.nextInt();
		
		
		if(nombreEntier > 0) { // Si nombreEntier est supérieur à 0
			System.out.println("Ce nombre est positif");
		}

		else if (nombreEntier < 0){ // Si nombreEntier est inférieur à 0
			System.out.println("Ce nombre est négatif");
		}
		else { // Sinon
			System.out.println("Ni négatif ni positif");
		}
			
		sc.close();

	}

}
