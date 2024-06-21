package bureauElectrics;

import java.math.BigDecimal;

public class BureauUltime extends Bureau{
	
	private BigDecimal hauteurEnCm;
	
	public BureauUltime() {
		
		hauteurEnCm = BigDecimal.valueOf(80);
		
	}
	
	public Bureau(BigDecimal _hauteurEnCm) {
		
		hauteurEnCm = _hauteurEnCm;
	}
	
}
