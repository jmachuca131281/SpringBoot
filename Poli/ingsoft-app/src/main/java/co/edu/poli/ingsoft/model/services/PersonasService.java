package co.edu.poli.ingsoft.model.services;

import java.util.List;

import co.edu.poli.ingsoft.model.entities.Personas;
import co.edu.poli.ingsoft.model.entities.Tienda;

public interface PersonasService {		//// Interfaz o fachada de la implementación	
	public List<Personas> findAll();    //
	public Personas findById(Long id);  //
	public Personas save(Personas p);   //
	public void delete(Long id);   		//
}
