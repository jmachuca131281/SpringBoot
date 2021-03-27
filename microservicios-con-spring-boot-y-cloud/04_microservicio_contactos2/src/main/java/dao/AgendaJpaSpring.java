package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import model.Contacto;

// Define la subinterfaz de JpaRepositori que proporciona los metodos CRUD
public interface AgendaJpaSpring extends JpaRepository<Contacto, Integer>{
	
	// Spring implementa automáticamente métodos, a partir del nombre del mismo o instrucción JPQL.
	Contacto findByEmail(String email); // Implementación a partir del nombre de método.
	@Transactional
	@Modifying // Anotación requerida para querys personalizado.
	@Query("Delete from Contacto c Where c.email=?1") // Implementación a partir de la query
	void eliminarPorEmail(String email);
	
	// @Query = JPQL es Java Persistence Query Language definida en la especificación de JPA.
	// Es utilizada para crear queries a las entidades en una DB relacional.
}
