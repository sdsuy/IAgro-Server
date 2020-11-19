package com.persistence;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import com.entities.Casilla;
import com.entities.Usuario;

/**
 * Session Bean implementation class CasillaDao
 */
@Singleton
public class CasillaDao implements CasillaDaoLocal {
	
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
	public Casilla read(Long id) {
		
		return em.find(Casilla.class, id);
	}

	@Override
	public List<Casilla> readAll() {
		TypedQuery<Casilla> query = em.createNamedQuery("Casilla.readAll", Casilla.class);
		return query.getResultList();
	}

	@Override
	public boolean update(Casilla o) {
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
			Casilla o = em.find(Casilla.class, id);
			em.remove(o);
			em.flush();
			return true;
		} catch (PersistenceException e) {
			e.getMessage();
			return false;
		}
	}

}
