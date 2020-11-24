package com.persistence;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import com.entities.Usuario;

/**
 * Session Bean implementation class UsuarioDao
 */
@Singleton
public class UsuarioDao implements UsuarioDaoLocal {
	
	@PersistenceContext
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public UsuarioDao() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean create(Usuario o){
		try {
			em.persist(o.getRol());
			em.persist(o);
			em.flush();
			return true;
		} catch (PersistenceException e) {
			e.getMessage();
			return false;
		}
		
	}

	@Override
	public Usuario read(Long id) {
		
		return em.find(Usuario.class, id);
	}

	@Override
	public List<Usuario> readAll() {
		TypedQuery<Usuario> query = em.createNamedQuery("Usuario.readAll", Usuario.class);
		return query.getResultList();
	}

	@Override
	public boolean update(Usuario o) {
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
			Usuario o = em.find(Usuario.class, id);
			em.remove(o);
			em.flush();
			return true;
		} catch (PersistenceException e) {
			e.getMessage();
			return false;
		}
		
		
	}

}
