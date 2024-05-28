package leconYoutube;

public class App {

	public static void main(String[] args) {
		
		int[] tab = {1, 2, 3};
		
		int[][] tab2 = {{1, 2, 3}, {4, 5, 6}};
		
		for (int i = 0 ; i < tab.length ; ++i)
			System.out.println(tab[i]);
		
		for (int el : tab)
			System.out.println(el);
	}

}
