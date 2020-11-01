package com.persistence;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.entities.Rol;

/**
 * Session Bean implementation class RolDao
 */
@Singleton
public class RolDao implements RolDaoLocal {
	
	@PersistenceContext
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public RolDao() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void create(Rol o) {
		
		
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
