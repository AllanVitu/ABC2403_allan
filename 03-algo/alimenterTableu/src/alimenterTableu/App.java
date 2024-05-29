package alimenterTableu;

import java.util.Scanner;

public class App {
	
	public static int ma1erFonction(String question) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(question);
		
		int valeur = sc.nextInt();
		
		sc.close();
		
		return valeur;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tailleTableau;
		
		int[] tab;
		
		int i; 
		
		int positif;
		
		int negatif;
		
		positif = 0;
		
		negatif = 0;
		
		
		tailleTableau = sc.nextInt();
		
		tailleTableau = App.ma1erFonction("Entrer le nombres de valeurs que vous souhaitez saisir : ");
		
		tab = new int[tailleTableau];
		
		for(i = 0; i < tailleTableau; i++) {
			System.out.println("Saisissez la valeur N°" + (i+1) + "/" + tailleTableau);
			
			tab[i] = sc.nextInt();
			
			tab[i] = App.ma1erFonction("Saisissez la valeur N°" + (i+1) + "/" + tailleTableau);
			
			if(tab[i] >= 0) {
				
				positif++;
			} else { // ligne pour le else
				
				negatif++;
			}
		} // fin for
		System.out.println("Vous avez sais: " + positif + "nombres positifs");
		
		System.out.println("Vous avez sais: " + negatif + "nombres négatifs");
		
		
		
		sc.close();
		
	}

}
