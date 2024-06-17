package bouteilles;

public class Main {

	public static void main(String[] args) {
		
		Bouteille bouteille1 = new Bouteille();
		 
		Bouteille bouteille2 = new Bouteille(1.2f, 0.8f, true, "h2o");
 
		Bouteille bouteille3 = new Bouteille(bouteille2);
		
		Bouteille bouteille4 = new Bouteille(1.2f, 0.5f, true, "h2o");
 
		Bouteille bouteille5 = new Bouteille(1.2f, 1.3f, false, "h2o");
		
		
		
		float contenanceEnCLDeBouteille2 = bouteille2.donneContenanceEnCL();
 
		float contenuEnCLDeBouteille2 = bouteille2.donneContenanceEnCL();
		
		boolean bouteilleRempli = bouteille2.remplir(1.2f);
		
		boolean bouteilleVide = bouteille2.laVider(1.5f);
		
		boolean bouteilleOuvert = bouteille2.ouvrir();
		
		boolean bouteilleFermer = bouteille2.fermer();
	}

}
