package com.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Base
 *
 */
@MappedSuperclass

public class Base implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue
    private Long id;

	public Base() {
		super();
	}
   
}
