package com.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Funcionalidad
 *
 */
@Entity
@Table(name="funcionalidades")
@SequenceGenerator(name = "default_gen", sequenceName = "funcionalidad_seq", allocationSize = 1)
public class Funcionalidad extends Base implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Funcionalidad() {
		super();
	}
   
}
