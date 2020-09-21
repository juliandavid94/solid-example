package co.com.informatica.solidexamplerest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.informatica.solidexamplerest.dto.Ballena;
import co.com.informatica.solidexamplerest.dto.Murcielago;
import co.com.informatica.solidexamplerest.dto.PersistenciaMamifero;
import co.com.informatica.solidexamplerest.dto.SimpleDTO;

@RequestMapping("/solid")
@RestController()
public class ModelerRestController {
	/**
	 * Principio de Segregación de la interfaz
	 * @return
	 */
	@GetMapping("/interface")
	public @ResponseBody SimpleDTO animalInstancia(){
		Ballena b = new Ballena(0);
		Murcielago m = new Murcielago(0);
		b.recorrerDistancia(2);
		m.recorrerDistancia(3);
		SimpleDTO res= new SimpleDTO(b.getDistanciaNadada(),
				"OK - ".concat(b.nadar()).concat(b.comer())
				.concat(m.volar()).concat(m.comer()));
		return res;
	}
	/**
	 * Principio de responsabilidad unica
	 * Principio de sustitución de liskov:
	 *  Una clase debería poder ser reemplazada por las subclases  
	 * @param m
	 * @return
	 */
	@PutMapping("/responsability/ballena")
	public @ResponseBody SimpleDTO crearBallena(@RequestBody Ballena b) {
		PersistenciaMamifero pm = new PersistenciaMamifero();
		pm.guardarMamifero(b);
		SimpleDTO res= new SimpleDTO(0,pm.guardarMamifero(b));
		return res;
	}
	/**
	 * Principio Responsabilidad unica de clase
	 * Principio de sustitución de liskov:
	 *  Una clase debería poder ser reemplazada por las subclases 
	 * @param e
	 * @return
	 */
	@PostMapping("/responsability/ballena")
	public @ResponseBody SimpleDTO actualizarBallena(@RequestBody Ballena b) {
		PersistenciaMamifero pm = new PersistenciaMamifero();		
		SimpleDTO res= new SimpleDTO(0, pm.actualizarMamifero(b));
		return res;
	}
	/**
	 * Principio Responsabilidad unica de clase
	 * Principio de sustitución de liskov:
	 *  Una clase debería poder ser reemplazada por las subclases 
	 * @param e
	 * @return
	 */
	@PutMapping("/responsability/murcielago")
	public @ResponseBody SimpleDTO crearMurcielago(@RequestBody Murcielago m) {
		PersistenciaMamifero pm = new PersistenciaMamifero();
		pm.guardarMamifero(m);
		SimpleDTO res= new SimpleDTO(0,pm.guardarMamifero(m));
		return res;
	}
	/**
	 * Principio Responsabilidad unica de clase
	 * Principio de sustitución de liskov:
	 * 	Una clase debería poder ser reemplazada por las subclases 
	 * @param b
	 * @return
	 */	
	@PostMapping("/responsability/murcielago")
	public @ResponseBody SimpleDTO actualizarMurcielago(@RequestBody Murcielago b) {
		PersistenciaMamifero pm = new PersistenciaMamifero();		
		SimpleDTO res= new SimpleDTO(0, pm.actualizarMamifero(b));
		return res;
	}
	
}
