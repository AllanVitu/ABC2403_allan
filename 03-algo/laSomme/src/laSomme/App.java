package laSomme;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nombreDeDepart;
		int sommeDesEntiers = 0;
		
		
		System.out.println("Saisissez un nombre");
		nombreDeDepart = sc.nextInt();
		
		for(int i = 0; i <= nombreDeDepart; i++)
		{
			sommeDesEntiers += i;
		}
		
		System.out.println("La somme des nombres jusque " + nombreDeDepart + " est " + sommeDesEntiers);
		
		sc.close();
	}

}
