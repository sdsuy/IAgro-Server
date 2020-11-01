package com.persistence;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import com.entities.Rol;
import com.entities.Usuario;

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
		
		try {
			em.persist(o);
			em.flush();
		} catch (PersistenceException e) {
			e.getMessage();
		}
		
	}

	@Override
	public Rol read(Long id) {
		
		return em.find(Rol.class, id);
	}

	@Override
	public List<Rol> readAll() {
		TypedQuery<Rol> query = em.createQuery("readAll",Rol.class);
		return null;
	}

	@Override
	public void update(Rol o) {
		try {
			em.merge(o);
			em.flush();
		} catch (PersistenceException e) {
			e.getMessage();
		}
		
		
	}

	@Override
	public void delete(Long id) {
		try {
			Rol o = em.find(Rol.class, id);
			em.remove(o);
			em.flush();
		} catch (PersistenceException e) {
			e.getMessage();
		}
		
		
	}

}
