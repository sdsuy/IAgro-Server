package com.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.entities.Formulario;
import com.persistence.FormularioDaoLocal;

/**
 * Session Bean implementation class FormularioBean
 */
@Stateless
public class FormularioBean implements FormularioBeanRemote {
	
	@EJB
	private FormularioDaoLocal formularioDao;

    /**
     * Default constructor. 
     */
    public FormularioBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean create(Formulario o) {
		
		return formularioDao.create(o);
	}

	@Override
	public Formulario read(Long id) {
		
		return formularioDao.read(id);
	}

	@Override
	public List<Formulario> readAll() {
		
		return formularioDao.readAll();
	}

	@Override
	public boolean update(Formulario o) {
		
		return formularioDao.update(o);
	}

	@Override
	public boolean delete(Long id) {
		
		return formularioDao.delete(id);
	}

}
