package com.persistence;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import com.entities.Funcionalidad;

/**
 * Session Bean implementation class FuncionalidadDao
 */
@Singleton
public class FuncionalidadDao implements FuncionalidadDaoLocal {
	
	@PersistenceContext
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public FuncionalidadDao() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void create(Funcionalidad o) {
		try {
			em.persist(o);
			em.flush();
		} catch (PersistenceException e) {
			e.getMessage();
		}
		
	}

	@Override
	public Funcionalidad read(Long id) {
		
		return em.find(Funcionalidad.class, id);
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
