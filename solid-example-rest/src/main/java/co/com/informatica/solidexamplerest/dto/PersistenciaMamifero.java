package co.com.informatica.solidexamplerest.dto;

/**
 * S: Principio de responsabilidad unica
 * 
 * @author Efren
 *
 */
public class PersistenciaMamifero {
	
	public String guardarMamifero(Mamifero m) {
		return "Guardando Mamifero".concat(m instanceof Ballena? "Ballena": m instanceof Murcielago ? "Murcielago" :"" );
		
	}
	
	public String actualizarMamifero(Mamifero m) {
		return "Actualizando Mamifero ".concat(m instanceof Ballena? "Ballena": m instanceof Murcielago ? "Murcielago" :"");
	}

}
