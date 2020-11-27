package com.entities;

import java.io.Serializable;
import java.sql.Date;
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
public class Formulario extends Base implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Column(length = 50, nullable = false, unique = true)
	private String nombre;
	
	private String resumen;
	
	
	@ManyToOne
	private Usuario usuario;
	
	@ManyToMany
	private List<Casilla> casillas;
	
	

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


}
