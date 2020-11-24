package com.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Enumerated;

/**
 * Entity implementation class for Entity: Departamento
 *
 */
@Entity
@Table(name="departamentos")
@SequenceGenerator(name = "default_gen", sequenceName = "departamento_seq", allocationSize = 1)
public class Departamento implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
	@Enumerated(EnumType.STRING)
	private Departamentos departamentos;

	public Departamento() {
		super();
	}

	public Departamentos getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Departamentos departamentos) {
		this.departamentos = departamentos;
	}
	
   
}
