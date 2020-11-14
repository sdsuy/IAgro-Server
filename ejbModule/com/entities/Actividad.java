package com.entities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Actividad
 *
 */
@Entity
@Table(name="Actividades")
@SequenceGenerator(name = "default_gen", sequenceName = "actividad_seq", allocationSize = 1)
public class Actividad implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue
	@Id
	private long id_actividad;
	
	@ManyToOne
	private Formulario form;
	
	private Usuario user;
	
	private Date fecha;
	
	private Timestamp hora;
	
	private String valor;

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


	public Usuario getUser() {
		return user;
	}


	public void setUser(Usuario user) {
		this.user = user;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Timestamp getHora() {
		return hora;
	}


	public void setHora(Timestamp hora) {
		this.hora = hora;
	}


	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}
	
   
}
