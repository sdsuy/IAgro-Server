package com.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Funcionalidad
 *
 */
@Entity
@Table(name="funcionalidades")
@SequenceGenerator(name = "default_gen", sequenceName = "funcionalidad_seq", allocationSize = 1)
@NamedQuery(name="Funcionalidad.readAll", query="SELECT f FROM Funcionalidad f")
public class Funcionalidad extends Base implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Column(length = 20, nullable = false, unique = true)
	private String nombre;
	
	@Column(length = 40)
	private String descripcion;

	public Funcionalidad() {
		super();
	}

	public Funcionalidad(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
   
}
