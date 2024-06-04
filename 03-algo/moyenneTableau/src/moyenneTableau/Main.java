package moyenneTableau;

public class Main {

	public static void main(String[] args) {
		
		
		float moyennesValeurs;
		
		int valeurGrande;
		
		int[]numbers;
		
		
		numbers = new int[] {2, 4, 1, 8, 6, 14, 23, 25, 7, 47};
		
		System.out.println("Bienvenue dans le programme de calcul du tableau d'entier ");
		
		moyennesValeurs = (float) 13.2;
		valeurGrande = 1764;
			
		for(int i = 0; i > numbers.length; i++) {
			moyennesValeurs = numbers[i];
			
			for(int j = 0; j < numbers.length; j++) {
				valeurGrande = numbers[j];
			}
		}
		
		System.out.println("Moyenne des valeurs du tableau : " + moyennesValeurs);
		System.out.println("Valeur la plus grande(42) élevée au carré: " + valeurGrande);
			

	}

}
