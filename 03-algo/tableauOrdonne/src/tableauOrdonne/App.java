package tableauOrdonne;

import java.util.Scanner;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] tab;
		int newTab;
		int[] tab2;
		
		
		
		tab = new int[] {1, 4, 5, 10, 20, 22, 25, 30, 32};
		
		tab2 = new int[tab.length + 1];	
		
		System.out.println("Saisissez une valeur à ajouter");
		
		newTab = sc.nextInt();
		
		for(int i = 0; i < tab2.length; i++ ) {
			tab2[i] = tab[i];
			
			tab2[tab.length] = newTab;
		}
		
		
		Arrays.toString(tab2);
		
		System.out.println("Tableau final : " + Arrays.toString(tab2));
		
		
		sc.close();
	}

}
