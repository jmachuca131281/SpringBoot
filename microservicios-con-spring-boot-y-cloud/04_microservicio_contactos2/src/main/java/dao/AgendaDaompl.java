package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Contacto;

@Repository // Indica que la clase es un repositorio, utilizado para encapsular el comportamiento de almacenamiento, recuperación y busqueda que emula una colección de objetos.
public class AgendaDaompl implements AgendaDao {
	
	@Autowired // Permite inyectar dependencias con otras.
	AgendaJpaSpring agenda;

	@Override // El método de la clase secundaria está sobrescribieno su método de la clase base.
	public void agregarContacto(Contacto contacto) {
		agenda.save(contacto);
	}

	@Override
	public Contacto recuperarContacto(String email) {
		return agenda.findByEmail(email);
	}

	@Override
	public void eliminarContacto(String email) {
		agenda.eliminarPorEmail(email);
	}

	@Override
	public List<Contacto> devolverContactos() {
		return agenda.findAll();
	}
	
	@Override
	public void eliminarContacto(int idContacto) {
		agenda.deleteById(idContacto);
	}

	@Override
	public Contacto recuperarContacto(int idContacto) {	
		return agenda.findById(idContacto).orElse(null);
	}

	@Override
	public void actualizarContacto(Contacto contacto) {
		agenda.save(contacto);
		
	}


}
