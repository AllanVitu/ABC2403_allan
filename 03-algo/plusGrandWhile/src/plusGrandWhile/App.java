package plusGrandWhile;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nombreUtilisateur;
		
		int plusGrand = Integer.MIN_VALUE;
		
		int i = 1;
		
		
		while(i <= 20) {
			System.out.println("Saisissez un nombre " + i + " : ");
			nombreUtilisateur = sc.nextInt();
			i++;
			
			if (nombreUtilisateur > plusGrand) {
				plusGrand = nombreUtilisateur;
			}
		}
		
		System.out.println("Le plus grand des nombres saisis est : " + plusGrand);
		
	sc.close();
	}

}
