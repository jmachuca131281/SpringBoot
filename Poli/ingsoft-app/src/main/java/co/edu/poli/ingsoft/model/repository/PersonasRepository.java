package co.edu.poli.ingsoft.model.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.poli.ingsoft.model.entities.Personas;

public interface PersonasRepository extends CrudRepository<Personas, Long> {
	
}
