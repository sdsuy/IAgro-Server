package com.persistence;

import java.util.List;

import javax.ejb.Local;

import com.entities.Actividad;

@Local
public interface ActividadDaoLocal extends IDao<Actividad>{
	
	List<Actividad> readAllByForm(Long id);
	Actividad readOneAndCasillasEInfo(Long id);
	
}
