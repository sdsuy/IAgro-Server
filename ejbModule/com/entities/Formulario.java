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
	
	
	private Actividad actividad;
	
	@ManyToOne
	private Usuario usuario;
	
	@ManyToMany
	private List<Casilla> casillas;
	
	private String met_muestreo;
	
	private String equipamiento;
	
	private String resumen;
	
	private String departamento;
	
	private Date fecha;
	
	private String zona;
	
	private String tip_muestreo;
	
	private Long geopunto;
	
	private String localidad;
	
	private String est_muestreo;
	

	public Formulario() {
		super();
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getMet_muestreo() {
		return met_muestreo;
	}


	public void setMet_muestreo(String met_muestreo) {
		this.met_muestreo = met_muestreo;
	}


	public String getEquipamiento() {
		return equipamiento;
	}


	public void setEquipamiento(String equipamiento) {
		this.equipamiento = equipamiento;
	}


	public String getResumen() {
		return resumen;
	}


	public void setResumen(String resumen) {
		this.resumen = resumen;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getZona() {
		return zona;
	}


	public void setZona(String zona) {
		this.zona = zona;
	}


	public String getTip_muestreo() {
		return tip_muestreo;
	}
	
	public List<Casilla> getCasillas() {
		return casillas;
	}


	public void setCasillas(List<Casilla> casillas) {
		this.casillas = casillas;
	}


	public void setTip_muestreo(String tip_muestreo) {
		this.tip_muestreo = tip_muestreo;
	}


	public Long getGeopunto() {
		return geopunto;
	}


	public void setGeopunto(Long geopunto) {
		this.geopunto = geopunto;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getEst_muestreo() {
		return est_muestreo;
	}


	public void setEst_muestreo(String est_muestreo) {
		this.est_muestreo = est_muestreo;
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

}
