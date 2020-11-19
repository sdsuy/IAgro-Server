package com.persistence;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import com.entities.Formulario;

/**
 * Session Bean implementation class FormularioDao
 */
@Singleton
public class FormularioDao implements FormularioDaoLocal {
	
	@PersistenceContext
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public FormularioDao() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean create(Formulario o) {
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
	public Formulario read(Long id) {
		return em.find(Formulario.class, id);
	}

	@Override
	public List<Formulario> readAll() {
		TypedQuery<Formulario> query = em.createNamedQuery("Formulario.readAll", Formulario.class);
		return query.getResultList();
	}

	@Override
	public boolean update(Formulario o) {
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
			Formulario form = em.find(Formulario.class, id);
			em.remove(form);
			em.flush();
			return true;
		} catch (PersistenceException e) {
			e.getMessage();
			return false;
		}
		
	}

}
