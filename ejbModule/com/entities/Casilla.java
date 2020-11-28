package com.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Actividad
 *
 */
@Entity
@Table(name="casillas")
@SequenceGenerator(name = "default_gen", sequenceName = "casilla_seq", allocationSize = 1)
@NamedQuery(name="Casilla.readAll", query="SELECT c FROM Casilla c")
public class Casilla extends Base implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
	private String parametro; 
	
	private String uni_medida;
	
	private String descripcion; 
	
	private Enum<?> tipo;
	
	
	public Casilla() {
		super();
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

	public Enum<?> getTipo() {
		return tipo;
	}

	public void setTipo(Enum<?> tipo) {
		this.tipo = tipo;
	}

	

   
}
