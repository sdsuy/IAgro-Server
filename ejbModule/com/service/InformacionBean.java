package com.service;

import java.util.List;

import javax.ejb.Stateless;

import com.entities.Informacion;
import com.persistence.InformacionDaoLocal;

/**
 * Session Bean implementation class InformacionBean
 */
@Stateless
public class InformacionBean implements InformacionBeanRemote {
	
	private InformacionDaoLocal informacionDao;

    /**
     * Default constructor. 
     */
    public InformacionBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean create(Informacion o) {
		return informacionDao.create(o);
	}

	@Override
	public Informacion read(Long id) {
		return informacionDao.read(id);
	}

	@Override
	public List<Informacion> readAll() {
		return informacionDao.readAll();
	}

	@Override
	public boolean update(Informacion o) {
		return informacionDao.update(o);
	}

	@Override
	public boolean delete(Long id) {
		return informacionDao.delete(id);
	}

}
