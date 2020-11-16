package com.persistence;

import java.util.List;

import javax.ejb.Singleton;

import com.entities.Actividad;

/**
 * Session Bean implementation class ActividadDao
 */
@Singleton
public class ActividadDao implements ActividadDaoRemote {

    /**
     * Default constructor. 
     */
    public ActividadDao() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean create(Actividad o) {
		// TODO Auto-generated method stub
		return false;
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
