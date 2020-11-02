package com.persistence;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

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
	public boolean create(Funcionalidad o) {
		try {
			em.persist(o);
			em.flush();
			return true;
		} catch (PersistenceException e) {
			e.getMessage();
			return false;
		}
		
	}

	@Override
	public Funcionalidad read(Long id) {
		
		return em.find(Funcionalidad.class, id);
	}

	@Override
	public List<Funcionalidad> readAll() {
		
		TypedQuery<Funcionalidad> query = em.createQuery("readAll",Funcionalidad.class);
		return query.getResultList();
	}

	@Override
	public boolean update(Funcionalidad o) {
		
		try {
			em.merge(o);
			em.flush();
			return true;
		} catch (PersistenceException e) {
			e.getMessage();
			return false;
		}
		
	}

	@Override
	public boolean delete(Long id) {
		try {
			Funcionalidad o = em.find(Funcionalidad.class, id);
			em.remove(o);
			em.flush();
			return true;
		} catch (PersistenceException e) {
			e.getMessage();
			return false;
		}
		
		
	}

}
