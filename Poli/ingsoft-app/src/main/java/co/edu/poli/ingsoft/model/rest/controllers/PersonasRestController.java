package co.edu.poli.ingsoft.model.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.edu.poli.ingsoft.model.entities.Personas;
import co.edu.poli.ingsoft.model.services.PersonasService;

@CrossOrigin(origins= {"http://localhost:4200​​​​​​​"})
@RestController
@RequestMapping("/api")
public class PersonasRestController {
	
	@Autowired
	private PersonasService personasService;
	
	@GetMapping("/personas")
	public List<Personas> index(){
		return personasService.findAll();
	}
	 													// En la url viaja variables unicas
	@GetMapping("/personas/{id}")          				// Le damos la ruta y le enviamos una id y la enviamos
	public Personas find(@PathVariable Long id) { 		// y caturamos Hacemos el mapeo y viende del id
		return personasService.findById(id);
	}
	
	@PostMapping("/personas")							// El formato es jSON Y EL MEDIO ES EL HTTP
	@ResponseStatus(HttpStatus.CREATED)
	public Personas create(@RequestBody Personas p) {
		return personasService.save(p);
	}
	
	@DeleteMapping("/personas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)				// When an endpoint returns successfully, Spring provides an HTTP 200 (OK) response.
	public void delete(@PathVariable Long id) {			// //If we want to specify the response status of a controller method, we can mark that method with @ResponseStatus. It has two interchangeable arguments for the desired response status: code, and value.
		personasService.delete(id);
	}
														// Put para actualizar
	@PutMapping("/personas/{id}")   					//
	@ResponseStatus(HttpStatus.CREATED)
	public Personas update(@PathVariable Long id, @RequestBody Personas p ) {	
		Personas per = personasService.findById(id);
		per.setNombres(p.getNombres());
		per.setApellidos(p.getApellidos());
		per.setEmail(p.getEmail());
		per.setFechaNac(p.getFechaNac());
		per.setGenero(p.getGenero());
		return personasService.save(per);
	}
}















