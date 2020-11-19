package com.persistence;

import javax.ejb.Remote;

import com.entities.Formulario;
import com.entities.Rol;

@Remote
public interface FormularioDaoRemote extends IDao<Formulario> {
	
	

}
