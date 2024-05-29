package sommeValeurs2Tableaux;

public class App {

	public static void main(String[] args) {
		
		int[] tab; // Déclaration du 1er Tableau
		int[] tab2;//Déclaration du 2nd Tableau
		int resultatTab;//Résultat du calcul
		
		resultatTab = 0;//Initialization du résultat à 0
		
		tab = new int[] { 4, 8, 7, 12};// Initialization du 1er Tableau
		
		tab2 = new int[] { 3, 6};// Initialization du 2nd Tableau
		
		for(int i =0; i < tab.length; i++) {
			
			for(int j =0; j < tab2.length; j++) {
				
				resultatTab += tab[i] * tab2[j];
			}
		}
	
		System.out.println(resultatTab);
	
	}

}
