package com.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.entities.Rol;
import com.persistence.RolDaoLocal;

/**
 * Session Bean implementation class RolBean
 */
@Stateless
public class RolBean implements RolBeanRemote {
	
	@EJB
	private RolDaoLocal rolDao;

    /**
     * Default constructor. 
     */
    public RolBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean create(Rol o) {
		return rolDao.create(o);
		
	}

	@Override
	public Rol read(Long id) {
		// TODO Auto-generated method stub
		return rolDao.read(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return rolDao.readAll();
	}

	@Override
	public boolean update(Rol o) {
		return rolDao.update(o);
		
	}

	@Override
	public boolean delete(Long id) {
		return rolDao.delete(id);
		
	}

}
