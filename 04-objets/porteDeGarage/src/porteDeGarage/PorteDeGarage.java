package porteDeGarage;

public class PorteDeGarage{
	
	boolean estVerouille;
	
	float pourcenDOuverture;
	
	float pourcenDouvertureMax;
	
	float pourcenOuvertureMin;
	
	
	
	public PorteDeGarage(){
		
		estVerouille = true;
		
		pourcenDOuverture = 0;
		
		pourcenDouvertureMax = 100;
		
		pourcenOuvertureMin = 0;
	}
	
	
	public PorteDeGarage(boolean _estVerouille, float _pourcenDOuverture, float _pourcenDouvertureMax, float _pourcenOuvertureMin ) {
		
		this.estVerouille = _estVerouille;
		
		this.pourcenDOuverture = _pourcenDOuverture;
		
		this.pourcenDouvertureMax = _pourcenDouvertureMax;
		
		this.pourcenOuvertureMin = _pourcenOuvertureMin;
	}
	
	public boolean verouiller() {
		
		boolean verouiller;
		
		if(this.estVerouille == false && this.pourcenDOuverture == 0) {
			
			verouiller = true;
			
			estVerouille = true;
			
		} else {
			
			verouiller = false;
		}
		
		return verouiller;
	}
	
	
	public boolean deverouiller() {
		
		boolean deverouiller;
		
		if(this.estVerouille == true && this.pourcenDOuverture == 0) {
			
			deverouiller = true;
			
			estVerouille = false;
		
		} else {
			deverouiller = false;
		}
		
		return deverouiller;
	}
}

