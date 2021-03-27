package co.edu.poli.ingsoft.model.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.poli.ingsoft.model.entities.Tienda;
import co.edu.poli.ingsoft.model.repository.TiendaRepository;
import co.edu.poli.ingsoft.model.services.TiendaService;

@Service
public class TiendaServiceImpl implements TiendaService{
	@Autowired
	private TiendaRepository tiendaRepo;
	 //declara lo que remplaza la escritura del metodo.
	public List<Tienda> findAll() { // Devuelve un interable de personas y se combierte a un alista de personas.
		return (List<Tienda>) tiendaRepo.findAll();
	}
}
