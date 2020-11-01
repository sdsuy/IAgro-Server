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
	public void create(Funcionalidad o) {
		
		funcionalidadDao.create(o);
		
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
	public void update(Funcionalidad o) {
		
		funcionalidadDao.update(o);
		
	}

	@Override
	public void delete(Long id) {
		
		funcionalidadDao.delete(id);
		
	}

}
