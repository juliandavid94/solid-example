package co.com.informatica.solidexamplerest.dto;

/**
 * 
 * @author Efren
 *
 */
public class Ballena extends Mamifero implements IMamiferoNadador {
	
	private int distanciaNadada;
	
	public Ballena() {
		
	}
	public Ballena(int distanciaNadada) {
		super();
		this.distanciaNadada = distanciaNadada;
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "Ballena comiendo ";
	}

	@Override
	public String nadar() {
		// TODO Auto-generated method stub
		return "Ballena nadando ";
	}
	
	

	public int getDistanciaNadada() {
		return distanciaNadada;
	}

	@Override
	public void recorrerDistancia(int a) {
		// TODO Auto-generated method stub
		this.distanciaNadada = this.distanciaNadada +a;
		
	}


}
