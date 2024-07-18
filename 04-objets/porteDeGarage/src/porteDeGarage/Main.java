package porteDeGarage;

public class Main {

	public static void main(String[] args) {
		
		PorteDeGarage porteDuPauvre = new PorteDeGarage();
		
		PorteDeGarage portePrenium = new PorteDeGarage(true, 10f, 90f, 0f);
		
		boolean estVerouiller = porteDuPauvre.verouiller();
		
		boolean deverouiller = portePrenium.deverouiller();

	}

}
