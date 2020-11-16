package com.persistence;

import javax.ejb.Remote;

import com.entities.Actividad;

@Remote
public interface ActividadDaoRemote extends IDao<Actividad>{
	

}
