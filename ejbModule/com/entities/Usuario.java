package com.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity
@Table(name="usuarios")
@SequenceGenerator(name = "default_gen", sequenceName = "usuario_seq", allocationSize = 1)
public class Usuario extends Base implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Usuario() {
		super();
	}
   
}
