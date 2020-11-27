package com.persistence;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import com.entities.Informacion;

/**
 * Session Bean implementation class InformacionDao
 */
@Singleton
public class InformacionDao implements InformacionDaoLocal {
	
	@PersistenceContext
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public InformacionDao() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean create(Informacion o) {
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
	public Informacion read(Long id) {
		return em.find(Informacion.class, id);
	}

	@Override
	public List<Informacion> readAll() {
		TypedQuery<Informacion> query = em.createNamedQuery("Informacion.readAll", Informacion.class);
		return query.getResultList();
	}

	@Override
	public boolean update(Informacion o) {
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
			Informacion i = em.find(Informacion.class, id);
			em.remove(i);
			em.flush();
			return true;
		} catch (PersistenceException e) {
			e.getMessage();
			return false;
		}
	}

}
