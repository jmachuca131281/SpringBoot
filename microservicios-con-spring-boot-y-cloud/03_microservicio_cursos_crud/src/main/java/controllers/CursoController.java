package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cursos.model.Curso;

@RestController
public class CursoController {

	private List<Curso> cursos;

	@PostConstruct
	public void init() {
		cursos = new ArrayList<>();
		cursos.add(new Curso("Spring", 24, "Tarde"));
		cursos.add(new Curso("Spring Boot", 43, "tarde"));
		cursos.add(new Curso("Python", 23, "Tarde"));
		cursos.add(new Curso("Java EE", 43, "Fin de semana"));
		cursos.add(new Curso("Java básico", 54, "Mañana"));
	}

	@GetMapping(value="cursos", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> getCursos(){
		return cursos;
	}

	@GetMapping(value="curso", produces=MediaType.APPLICATION_JSON_VALUE)
	public Curso getCurso() {
		return new Curso("JAVA", 100, "Mañana");
	}

	@GetMapping(value="cursos/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> buscarCursos(@PathVariable("name") String nombre){
		List<Curso> aux = new ArrayList<>();
		for(Curso c:cursos) {
			if(c.getNombre().contains(nombre)) {
				aux.add(c);
			}
		}
		return aux;
	}
	
	@DeleteMapping(value="curso/{name}")
	public void eliminarCurso(@PathVariable("name") String nombre) {
		cursos.removeIf(c -> c.getNombre().equals(nombre));
	}
	
	@PostMapping(value="curso", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> altaCurso(@RequestBody Curso curso){
		cursos.add(curso);
		return cursos;
	}

	@PutMapping(value="curso", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> actualizaCurso(@RequestBody Curso curso){
		for (int l = 0; l < cursos.size(); l++) {
			if(cursos.get(l).getNombre().equals(curso.getNombre())) {
				cursos.set(l, curso);
			}
		}
		return cursos;
	}
	
	
}


















