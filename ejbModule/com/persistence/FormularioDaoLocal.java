package com.persistence;

import javax.ejb.Local;
import javax.ejb.Remote;

import com.entities.Formulario;
import com.entities.Rol;

@Local
public interface FormularioDaoLocal extends IDao<Formulario> {
	
	

}
