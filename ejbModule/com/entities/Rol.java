package com.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Rol
 *
 */
@Entity
@Table(name="roles")
@SequenceGenerator(name = "default_gen", sequenceName = "rol_seq", allocationSize = 1)
public class Rol extends Base implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Column(length = 20)
	private String nombre;
	
	@Column(length = 40)
	private String descripcion;
	
	@ManyToMany
	private List<Funcionalidad> funcionalidades;
	
	public Rol() {
		super();
	}

	public Rol(String nombre, String descripcion, List<Funcionalidad> funcionalidades) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.funcionalidades = funcionalidades;
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

	public List<Funcionalidad> getFuncionalidades() {
		return funcionalidades;
	}

	public void setFuncionalidades(List<Funcionalidad> funcionalidades) {
		this.funcionalidades = funcionalidades;
	}
   
	
}
