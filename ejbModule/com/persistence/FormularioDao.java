package com.persistence;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.entities.Formulario;

/**
 * Session Bean implementation class FormularioDao
 */
@Singleton
public class FormularioDao implements FormularioDaoRemote {
	
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Formulario read(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Formulario> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Formulario o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
