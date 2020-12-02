package com.service;

import java.util.List;

import javax.ejb.Remote;

import com.entities.Actividad;


@Remote
public interface ActividadBeanRemote extends IBean<Actividad>{
	
	List<Actividad> readAllByForm(Long id);
	Actividad readOneAndCasillasEInfo(Long id);

}
