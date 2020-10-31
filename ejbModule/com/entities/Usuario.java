package com.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity
@Table(name="usuarios")
@SequenceGenerator(name = "default_gen", sequenceName = "usuario_seq", allocationSize = 1)
public class Usuario extends Base implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Column(length = 40, nullable = false)
	private String nombre;
	
	@Column(length = 40, nullable = false)
	private String apellido;
	
	@Column(length = 20)
	private String documento;
	
	@Column(length = 20, nullable = false)
	private String clave;
	
	@Column(length = 40)
	private String email;
	
	@ManyToOne(optional = false)
	private Rol rol;
	

	public Usuario() {
		super();
	}

	public Usuario(String nombre, String apellido, String documento, String clave, String email, Rol rol) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.clave = clave;
		this.email = email;
		this.rol = rol;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	


	
   
}
