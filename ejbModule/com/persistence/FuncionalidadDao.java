package com.persistence;

import java.util.List;

import javax.ejb.Singleton;

import com.entities.Funcionalidad;

/**
 * Session Bean implementation class FuncionalidadDao
 */
@Singleton
public class FuncionalidadDao implements FuncionalidadDaoLocal {

    /**
     * Default constructor. 
     */
    public FuncionalidadDao() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void create(Funcionalidad o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Funcionalidad read(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Funcionalidad> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Funcionalidad o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
