package ufps.model;

import java.io.Serializable;

public class Participante implements Serializable {
	
	private String nombre;
	private String email;
	private String telefono;
	private String estado;

	public Participante() {
		// TODO Auto-generated constructor stub
	}

	public Participante(String nombre, String email, String telefono) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.estado = "Activo";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	

}
