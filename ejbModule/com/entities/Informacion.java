package com.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Informacion
 *
 */
@Entity
@Table(name="informacion")
@SequenceGenerator(name = "default_gen", sequenceName = "info_seq", allocationSize = 1)
public class Informacion extends Base implements Serializable  {

	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Casilla casilla;
	
	@ManyToOne
	private Actividad actividad;
	
	private String valor;

	public Informacion() {
		super();
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Casilla getCasilla() {
		return casilla;
	}

	public void setCasilla(Casilla casilla) {
		this.casilla = casilla;
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}
   
}
