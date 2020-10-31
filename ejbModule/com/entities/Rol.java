package com.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Rol
 *
 */
@Entity
@Table(name="roles")
@SequenceGenerator(name = "default_gen", sequenceName = "rol_seq", allocationSize = 1)
public class Rol extends Base implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Rol() {
		super();
	}
   
}
