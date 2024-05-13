package tarifAssurance;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		String bleu;
		
		String vert;
		
		String orange;
		
		String rouge;
		
		
		System.out.println("Saisissez la couleur bleu, vert, orange ou rouge");
		
		bleu = "conducteur fidele";
		bleu = sc.nextLine();
		
		
		vert = "conducteur fidele";
		vert = sc.nextLine();
		
		
		orange = "conducteur +25ans titulaire du permis depuis -2ans, sans accident";
		orange = sc.nextLine();
		
		
		rouge = "conducteur -25ans titulaire du permis depuis +2ans, sans accidant";
		rouge = sc.nextLine();
		
		
		sc.close();
	}

}
