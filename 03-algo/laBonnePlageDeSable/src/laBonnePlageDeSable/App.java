package laBonnePlageDeSable;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nombreUtilisateur;
		
		do {
			System.out.println("Saisissez un chiffre entre 1 et 3");
			nombreUtilisateur = sc.nextInt();
			}
		
		while (nombreUtilisateur < 1 || nombreUtilisateur > 3);
		
		System.out.println("Bravo vous avez réussi ! " + nombreUtilisateur);
		
		sc.close();
	}

}
