package co.edu.poli.ingsoft.model.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.poli.ingsoft.model.entities.Tienda;
import co.edu.poli.ingsoft.model.services.TiendaService;

//org.spring framework
@RestController
@RequestMapping("/api")
public class TiendaRestController {
	// http:/localhost:8080/api/
	
		@Autowired
		private TiendaService tiendaService;
		
		@GetMapping("/tienda")
		public List<Tienda> index(){
			return tiendaService.findAll();
		}
}
