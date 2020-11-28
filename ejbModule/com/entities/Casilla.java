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
	
	@Column(nullable = false, unique = true)
	private String parametro; 
	
	@Column(name = "uni_medida")
	private String unidadMedida;
	
	private String descripcion; 
	
	@Enumerated(EnumType.STRING)
	private Tipos tipo;
	
	
	public Casilla() {
		super();
	}

	public String getParametro() {
		return parametro;
	}

	public void setParametro(String parametro) {
		this.parametro = parametro;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Tipos getTipo() {
		return tipo;
	}

	public void setTipo(Tipos tipo) {
		this.tipo = tipo;
	}
   
}
