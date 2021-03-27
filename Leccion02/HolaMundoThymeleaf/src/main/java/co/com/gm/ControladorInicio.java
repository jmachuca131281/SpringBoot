/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.gm;

import co.com.gm.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jmach
 */
// @ Para que Spring reconozca la case se agrega la siguiente anotación
//@RestController
@Controller
@Slf4j
public class ControladorInicio {
    @Value("${index.saludo}")
    private String saludo;
    @GetMapping("/")  // Mapeamos a el path
    public String inicio(Model model){
        var mensaje = "Hola mundo con Thymeleaf test";
        
        var persona = new Persona();
        persona.setNombre("José");
        persona.setApellido("Machuca");
        persona.setEmail("jmachuca@gmail.com");
        persona.setTelefono("234019283");
        
        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        model.addAttribute("persona", persona);
        return "index";
    }
}
