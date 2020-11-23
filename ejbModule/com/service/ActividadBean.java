package com.service;

import java.util.List;

import javax.ejb.Stateless;

import com.entities.Actividad;
import com.persistence.ActividadDaoLocal;

/**
 * Session Bean implementation class ActividadBean
 */
@Stateless
public class ActividadBean implements ActividadBeanRemote {
	
	private ActividadDaoLocal actividadDao;

    /**
     * Default constructor. 
     */
    public ActividadBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean create(Actividad o) {
		
		return actividadDao.create(o);
	}

	@Override
	public Actividad read(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Actividad> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Actividad o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
