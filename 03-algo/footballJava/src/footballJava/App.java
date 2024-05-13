package footballJava;

import java.util.Scanner;


public class App {

	public static void main(String[] args) {
	
		Scanner sc;
		
		sc = new Scanner(System.in);	
		
		
		int age;
		String categorie;
		
		
		System.out.println("Saisissez votre age");
		
		System.out.println("Categorie FooBall");
		
		age= sc.nextInt();		
		
		if (age < 5) {
			categorie = "trop jeune";
		}
		else if (age < 7) {
			categorie = "Débutant";
		}
		else if (age < 9) {
			categorie = "Poussin";
		}
		else if (age < 11) {
			categorie = "Benjamin";
		}
		else if (age < 13) {
			categorie = "Pupille";
		}
		else if (age < 15) {
			categorie = "Minime";
		}
		else if (age < 17) {
			categorie = "Cadet";
		}
		else if (age < 19) {
			categorie = "Junior";
		}
		else if (age < 35) {
			categorie = "senior";
		}
		else {
			categorie = "Veteran";
		}
		System.out.println("Votre categorie est " + categorie + ".");
		
		
		
		sc.close();
	}

}
