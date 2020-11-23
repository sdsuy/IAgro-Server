package com.persistence;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import com.entities.Actividad;

/**
 * Session Bean implementation class ActividadDao
 */
@Singleton
public class ActividadDao implements ActividadDaoLocal {
	
	@PersistenceContext
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public ActividadDao() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean create(Actividad o) {
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
	public Actividad read(Long id) {
		// TODO Auto-generated method stub
		return em.find(Actividad.class, id);
	}

	@Override
	public List<Actividad> readAll() {
		TypedQuery<Actividad> query = em.createNamedQuery("Actividad.readAll", Actividad.class);
		return query.getResultList();
	}

	@Override
	public boolean update(Actividad o) {
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
			Actividad o = em.find(Actividad.class, id);
			em.remove(o);
			em.flush();
			return true;
		} catch (PersistenceException e) {
			e.getMessage();
			return false;
		}
	}

}
