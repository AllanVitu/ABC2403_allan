package saluuuut;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		 
		System.out.println("Exercice Prenom");
		 
		String prenom;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir votre prénom :");
		
		prenom = sc.nextLine();
		
		System.out.println("Bonjour " + prenom);
		
		sc.close();
	}

}
