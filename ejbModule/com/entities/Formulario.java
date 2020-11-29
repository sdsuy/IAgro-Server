package com.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Formulario
 *
 */
@Entity
@Table(name="formulario")
@SequenceGenerator(name = "default_gen", sequenceName = "form_seq", allocationSize = 1)
@NamedQuery(name="Formulario.readAll", query="SELECT f FROM Formulario f")
@NamedQuery(name="Formulario.readCasillas", query="SELECT DISTINCT f FROM Formulario f LEFT JOIN FETCH f.casillas c WHERE f.id = :id")
public class Formulario extends Base implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Column(length = 50, nullable = false, unique = true)
	private String nombre;
	
	private String resumen;
	
	
	@ManyToOne
	private Usuario usuario;
	
	@ManyToMany
	private List<Casilla> casillas;
	
	@OneToMany(mappedBy = "form")
	private List<Actividad> actividades;

	public Formulario() {
		super();
	}

	public String getNombre() {
		return nombre;
	}
	

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public List<Casilla> getCasillas() {
		return casillas;
	}


	public void setCasillas(List<Casilla> casillas) {
		this.casillas = casillas;
	}

	public List<Actividad> getActividades() {
		return actividades;
	}

	public void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
	}
	
	


}
