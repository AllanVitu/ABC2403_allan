package rechercheChiffreExist;

public class Main {

	public static void main(String[] args) {
		
		int[] tab;
		
		tab = new int[] {1, 2, 3, 4, 5};
		
		int chiffre = 3;
		
		
		boolean result = Main.chercheChiffre(tab, 3);
	}
	
	
	public static boolean chercheChiffre(int[] tab, int rechercheChiffre) {
		
		boolean trouve = false;
		
		int i = 0;
		
		
		while(i < tab.length && !trouve) {
			
			if(tab[i] == rechercheChiffre) {
				
				trouve = true;
			}
		
			i++;
		
		}
			
		return trouve;
	}
}

