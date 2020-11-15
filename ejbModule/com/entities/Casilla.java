package com.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;
import javax.persistence.GeneratedValue;

/**
 * Entity implementation class for Entity: Actividad
 *
 */
@Entity
@Table(name="casillas")

public class Casilla implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	private long id_casilla;
	
	@ManyToMany
	private List<Formulario> formulario;
	
	private String parametro; 
	
	private String uni_medida;
	
	private String descripcion; 
	
	
	
	//tipo de valor (*): variable según el tipo de dato como entero, string, double,
	//boolean.
	


	public Casilla() {
		super();
	}
	
	public long getId_casilla() {
		return id_casilla;
	}



	public void setId_casilla(long id_casilla) {
		this.id_casilla = id_casilla;
	}



	public String getParametro() {
		return parametro;
	}

	public void setParametro(String parametro) {
		this.parametro = parametro;
	}

	public String getUni_medida() {
		return uni_medida;
	}

	public void setUni_medida(String uni_medida) {
		this.uni_medida = uni_medida;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public List<Formulario> getFormulario() {
		return formulario;
	}

	public void setFormulario(List<Formulario> formulario) {
		this.formulario = formulario;
	}
	
   
}
