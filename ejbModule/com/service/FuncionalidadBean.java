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
