package rechercheChiffreExist;

public class Main {

	public static void main(String[] args) {
		
		int[] tab;
		
		tab = new int[] {56, 30, 15, 1, 5};
		
		int chiffre = 1;
		
		
		boolean result = Main.chercheChiffre(tab, 1);
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

