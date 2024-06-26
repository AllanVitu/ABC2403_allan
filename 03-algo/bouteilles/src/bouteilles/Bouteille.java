package bouteilles;

public class Bouteille {
	
	//attributes
	
	private float contenanceEnL;
	
	private float contenuEnL;
	
	private boolean ouvert;
	
	private String typeDeContenu;
	
	
	//access/modifier
	
	//constructor
	
	public Bouteille() {
		
		contenanceEnL = 1;
		
		contenuEnL = 1;
		
		ouvert = false;
		
		typeDeContenu = "H2O";
	}
	
	
	//Constructor classic
	
	public Bouteille(float _contenanceEnL, float _contenuEnL, boolean _ouvert, String _typeDeContenu ) {
		
		
		this.contenanceEnL = _contenanceEnL;
		
		this.contenuEnL = _contenuEnL;
		
		this.ouvert = _ouvert;
		
		this.typeDeContenu = _typeDeContenu;
	}
	
	
	//Constructor par recopie oude clonage
	
	public Bouteille(Bouteille _bouteilleARecopier) { // pourquoi recopier mes paramettres bouteille?
		
		this.contenanceEnL = _bouteilleARecopier.contenanceEnL;
		
		this.contenuEnL = _bouteilleARecopier.contenanceEnL;
		
		this.ouvert = _bouteilleARecopier.ouvert;
		
		this.typeDeContenu = _bouteilleARecopier.typeDeContenu;
	}
	
	
	
	
	
	//Other methods
	
	public float donneContenanceEnCL() {
		
		float result;
		
		result = this.contenanceEnL * 100;
		
		return result;
	}
	
	public Boolean estPleine() {
		
		Boolean open;
		
		open = this.ouvert;
		
		return open;
	}
	
	public Boolean estPleines() {
		
		boolean plein;
		
		if(this.contenuEnL == this.contenanceEnL) {
		
			plein = true;
		
		}
	else plein = false;
		
	return plein;
	}

	public Boolean remplir(float quantite) {
		
		Boolean retour = false;
		
		if(this.ouvert && quantite <= (this.contenanceEnL - this.contenuEnL)) { // Pourquoi faire?
			
			retour = true;
			
			contenuEnL += quantite;
		}
		
		return retour;
	}
	
	public Boolean laVider(float quantite) {
		
		Boolean retour;
		
		if(this.contenanceEnL - quantite >= 0 && this.ouvert == true) {     // == est une comparaison
			
			this.contenanceEnL -= quantite;
			
			retour = true;
		}
		else {
			retour = false;
		}
			
		return retour;
	}
	
	public boolean ouvrir() {
		
		boolean retour;
		
		if(this.ouvert == false) {
			
			this.ouvert = true;
			
			retour = true;
		}
		else {
			
			retour = false;
		}
		return retour;
	}
	
	public boolean fermer() {
		
		boolean retour;
		
		if(this.ouvert == true) {
			
			this.ouvert = false;
			
			retour = true;
		} 
		else {
			
			retour = false;
		}
		
		return retour;
	}
}
	
