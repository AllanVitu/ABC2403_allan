package tableauExemple;

public class App {

	public static void main(String[] args) {
		
		int a;
		int b =2;
		
		
		int[] tableau;
		int[] tableau2;
		
		
		tableau = new int[3]; //Premiere solution
		tableau2 = new int[] {1,3,5,7,9}; //Deuxieme solution
		
		System.out.println("Longueur de tableau: " + tableau.length);
		System.out.println("Longueur de tableau2: " + tableau2.length);
		
		tableau[0] = 3;
		tableau[1] = 5;
		tableau[2] = 22;
		
		System.out.println("Element 0 de tableau = " + tableau[0]);
		
		int c = tableau[0] + tableau[2];
		
		
		for(int i = 0; i < tableau.length; i++) {   //[POUR I de 0 à longueur(tableau), incrémenter I] = Pseudo-code
			System.out.println("Element " + i + " de tableau = " + tableau[i]);
		}
	}

}
