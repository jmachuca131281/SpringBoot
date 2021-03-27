package co.edu.poli.ingsoft.model.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.poli.ingsoft.model.entities.Personas;
import co.edu.poli.ingsoft.model.repository.PersonasRepository;
import co.edu.poli.ingsoft.model.services.PersonasService;

@Service
public class PersonasServiceImpl implements PersonasService {
	
	@Autowired
	private PersonasRepository personasRepo;
	
	@Override 												//declara lo que remplaza la escritura del metodo.
	public List<Personas> findAll() { 						// Devuelve un interable de personas y se combierte a un alista de personas.
		return (List<Personas>) personasRepo.findAll();
	}

	@Override
	public Personas findById(Long id) {						// Invocamos el repositorio y a travez de personas y en el caso que no devuelva nada un nul en orelse 
		// TODO Auto-generated method stub					//
		return personasRepo.findById(id).orElse(null);		// 
	}

	@Override
	public Personas save(Personas p) {						//
		// TODO Auto-generated method stub					//
		return personasRepo.save(p);						//
	}

	@Override
	public void delete(Long id) {							// 
		// TODO Auto-generated method stub					//
		personasRepo.deleteById(id);						// Methodo deleteById
	}
	
}
