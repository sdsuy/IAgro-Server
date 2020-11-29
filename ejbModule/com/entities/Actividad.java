package com.entities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

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
	private Usuario usuario;
	
//	@OneToMany(mappedBy="actividad")
	@OneToMany
	@JoinColumn(name = "actividad_id")
	private List<Informacion> info;
	
	private Date fecha;
	
	private Timestamp hora;
	
//	private String valor;

	public Actividad() {
		super();
	}


	public Formulario getForm() {
		return form;
	}


	public void setForm(Formulario form) {
		this.form = form;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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


//	public String getValor() {
//		return valor;
//	}
//
//
//	public void setValor(String valor) {
//		this.valor = valor;
//	}


	public List<Informacion> getInfo() {
		return info;
	}


	public void setInfo(List<Informacion> info) {
		this.info = info;
	}
	
	
   
}
