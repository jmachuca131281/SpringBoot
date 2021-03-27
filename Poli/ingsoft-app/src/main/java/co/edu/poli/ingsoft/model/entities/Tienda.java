package co.edu.poli.ingsoft.model.entities;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tienda")
public class Tienda {
	@Id
	private Long id;
	private String clientes;
	private String productos;
	private Date fecha;
	private String email;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getClientes() {
		return clientes;
	}
	public void setClientes(String clientes) {
		this.clientes = clientes;
	}
	public String getProductos() {
		return productos;
	}
	public void setProductos(String productos) {
		this.productos = productos;
	}
	public Date getFechaNac() {
		return fecha;
	}
	public void setFechaNac(Date fechaNac) {
		this.fecha = fechaNac;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
