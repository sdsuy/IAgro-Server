package com.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.entities.Funcionalidad;
import com.persistence.FuncionalidadDaoLocal;

/**
 * Session Bean implementation class FuncionalidadBean
 */
@Stateless
public class FuncionalidadBean implements FuncionalidadBeanRemote {
	
	@EJB
	private FuncionalidadDaoLocal funcionalidadDao;

    /**
     * Default constructor. 
     */
    public FuncionalidadBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean create(Funcionalidad o) {
		
		return funcionalidadDao.create(o);
		
	}

	@Override
	public Funcionalidad read(Long id) {
		
		return funcionalidadDao.read(id);
	}

	@Override
	public List<Funcionalidad> readAll() {
		
		return funcionalidadDao.readAll();
	}

	@Override
	public boolean update(Funcionalidad o) {
		
		return funcionalidadDao.update(o);
		
	}

	@Override
	public boolean delete(Long id) {
		
		return funcionalidadDao.delete(id);
		
	}

}
