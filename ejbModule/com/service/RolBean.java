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
	public void create(Rol o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rol read(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Rol o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
