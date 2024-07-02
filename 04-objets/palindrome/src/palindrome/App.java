package palindrome;

public class App {

	public static void main(String[] args) {
		 
		boolean result = estUnpalindrome("LAVAL");
		
		boolean result2 = estUnpalindrome("COUCOU");

	}
	
	public static boolean estUnpalindrome(String mot) {
		
		boolean ok = true;
		
		int i = 0;
		
		int j = mot.length() - 1 - i;
		
		while(i < mot.length() /2 && ok == true) {
			
			if(mot.charAt(i) != mot.charAt(j)) {
				
				ok = false;
			}
			
			i++;
			
			j = mot.length() - 1 - i;
		}
		
		return ok;
	}

}
