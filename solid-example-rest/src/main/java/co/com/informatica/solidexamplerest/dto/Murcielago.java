package co.com.informatica.solidexamplerest.dto;
/**
 * Principios SOLID
 * I: Principio de segregación de interfaz
 * 
 * Solo se implementa la intefaz necesaria 
 * @author Efren
 *
 */
public class Murcielago extends Mamifero implements IMamiferoVolador{

	private int distanciaVolada;
	
	public Murcielago() {
		
	}
	public Murcielago(int distanciaVolada) {
		super();
		this.distanciaVolada = distanciaVolada;
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "Murcielago volando ";
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "Murcielago comiendo ";
	}

	@Override
	public void recorrerDistancia(int a) {
		// TODO Auto-generated method stub
		this.distanciaVolada = distanciaVolada +a;
	}

}
