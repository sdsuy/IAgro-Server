package com.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.entities.Actividad;
import com.persistence.ActividadDaoLocal;

/**
 * Session Bean implementation class ActividadBean
 */
@Stateless
public class ActividadBean implements ActividadBeanRemote {
	
	@EJB
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
		return actividadDao.read(id);
	}

	@Override
	public List<Actividad> readAll() {
		return actividadDao.readAll();
	}

	@Override
	public boolean update(Actividad o) {
		return actividadDao.update(o);
	}

	@Override
	public boolean delete(Long id) {
		return actividadDao.delete(id);
	}

}
