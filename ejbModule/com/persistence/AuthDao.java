package com.persistence;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.entities.Usuario;

/**
 * Session Bean implementation class AuthDao
 */
@Singleton
public class AuthDao implements AuthDaoLocal {
	
	@PersistenceContext
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public AuthDao() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Usuario login(String username, String password) {
		TypedQuery<Usuario> query = em.createNamedQuery("Usuario.login", Usuario.class);
		query.setParameter("nickname", username);
		query.setParameter("clave", password);
		try {
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

}
