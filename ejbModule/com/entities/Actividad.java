package com.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Actividad
 *
 */
@Entity
@Table(name="Actividades")

public class Actividad implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue
	@Id
	private long id_actividad;
	
	@ManyToOne
	private Formulario form;
	

	public Actividad() {
		super();
	}


	public long getId_actividad() {
		return id_actividad;
	}


	public void setId_actividad(long id_actividad) {
		this.id_actividad = id_actividad;
	}


	public Formulario getForm() {
		return form;
	}


	public void setForm(Formulario form) {
		this.form = form;
	}
	
   
}
