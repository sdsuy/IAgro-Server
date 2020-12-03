package com.persistence;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import com.entities.Actividad;
import com.entities.Informacion;

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
			for(Informacion info: o.getInfo()) {
				em.persist(info);
			}
//			em.persist(o.getInfo());
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
	public List<Actividad> readAllByForm(Long id) {
		TypedQuery<Actividad> query = em.createNamedQuery("Actividad.readAllByForm", Actividad.class);
		query.setParameter("id", id);
		return query.getResultList();
	}

	@Override
	public boolean update(Actividad o) {
		try {
			for(Informacion info: o.getInfo()) {
				em.merge(info);
			}
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

	@Override
	public Actividad readOneAndCasillasEInfo(Long id) {
		TypedQuery<Actividad> query = em.createNamedQuery("Actividad.readOneAndCasillasEInfo", Actividad.class);
		query.setParameter("id", id);
		try {
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

}
