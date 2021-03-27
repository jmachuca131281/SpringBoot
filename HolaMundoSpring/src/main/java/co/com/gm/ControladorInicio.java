/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jmach
 */
// @ Para que Spring reconozca la case se agrega la siguiente anotación
@RestController
@Slf4j
public class ControladorInicio {
    @GetMapping("/")  // Mapeamos a el path
    public String inicio(){
        log.info("Ejecutando el controlador REST");
        log.debug("Mas detalle del controlador");
        return "Hola mundo con Spring Boot test";
    }
}
