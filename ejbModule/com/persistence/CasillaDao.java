package com.persistence;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.entities.Casilla;

/**
 * Session Bean implementation class CasillaDao
 */
@Singleton
public class CasillaDao implements CasillaDaoRemote {
	
	@PersistenceContext
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public CasillaDao() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean create(Casilla o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Casilla read(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Casilla> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Casilla o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
