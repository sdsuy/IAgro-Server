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
	public void create(Usuario o){
		try {
			em.persist(o);
			em.flush();
			
		} catch (PersistenceException e) {
			e.getMessage();
		
		}
		
	}

	@Override
	public Usuario read(Long id) {
		
		return em.find(Usuario.class, id);
	}

	@Override
	public List<Usuario> readAll() {
		TypedQuery<Usuario> query = em.createQuery("readAll", Usuario.class);
		return query.getResultList();
	}

	@Override
	public void update(Usuario o) {
		em.merge(o);
		em.flush();
		
	}

	@Override
	public void delete(Long id) {
		Usuario o = em.find(Usuario.class, id);
		em.remove(o);
		em.flush();
		
	}

}
