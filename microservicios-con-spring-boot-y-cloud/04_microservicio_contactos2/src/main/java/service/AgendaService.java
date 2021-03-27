package service;
/**
 * Interfaces is an abstract type that is used to specify a behavior that classes must implement. ... 
 * Interfaces are declared using the interface keyword, and may only contain method signature and constant declarations (variable declarations
 *  that are declared to be both static and final 
 */

import java.util.List;

import model.Contacto;

public interface AgendaService {
	
	boolean agregarContacto(Contacto contacto);
	List<Contacto> recuperarContactos();
	void actualizarContacto(Contacto contacto);
	boolean eliminarContacto(int idContacto);
	Contacto buscarContacto(int idContacto);

}

