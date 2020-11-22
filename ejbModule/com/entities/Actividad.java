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
@Table(name="actividades")
@SequenceGenerator(name = "default_gen", sequenceName = "actividad_seq", allocationSize = 1)
@NamedQuery(name="Actividad.readAll", query="SELECT a FROM Actividad a")
public class Actividad extends Base implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Formulario form;
	
	@ManyToOne
	private Usuario user;
	
	private Date fecha;
	
	private Timestamp hora;
	
	private String valor;

	public Actividad() {
		super();
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
