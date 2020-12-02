package com.entities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

/**
 * Entity implementation class for Entity: Actividad
 *
 */
@Entity
@Table(name="actividades")
@SequenceGenerator(name = "default_gen", sequenceName = "actividad_seq", allocationSize = 1)
@NamedQuery(name="Actividad.readAll", query="SELECT a FROM Actividad a")
@NamedQuery(name="Actividad.readAllByForm", query="SELECT DISTINCT a FROM Actividad a LEFT JOIN FETCH a.form f WHERE f.id = :id")
@NamedQuery(name="Actividad.readOneAndCasillasEInfo", query="SELECT DISTINCT a FROM Actividad a LEFT JOIN FETCH a.info i LEFT JOIN FETCH i.casilla c WHERE a.id = :id")
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
	
	@Column(name="fecha_hora")
	@CreationTimestamp
    private LocalDateTime fechaHora;
	
//	private Date fecha;
//	
//	private Timestamp hora;
	
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


//	public Date getFecha() {
//		return fecha;
//	}
//
//
//	public void setFecha(Date fecha) {
//		this.fecha = fecha;
//	}
//
//
//	public Timestamp getHora() {
//		return hora;
//	}
//
//
//	public void setHora(Timestamp hora) {
//		this.hora = hora;
//	}


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


	public LocalDateTime getFechaHora() {
		return fechaHora;
	}


	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}
	
	
   
}
