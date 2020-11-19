package com.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.entities.Casilla;
import com.persistence.CasillaDaoLocal;

/**
 * Session Bean implementation class CasillaBean
 */
@Stateless
public class CasillaBean implements CasillaBeanRemote {
	
	@EJB
	private CasillaDaoLocal casillaDao;

    /**
     * Default constructor. 
     */
    public CasillaBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean create(Casilla o) {
		return casillaDao.create(o);
	}

	@Override
	public Casilla read(Long id) {
		return casillaDao.read(id);
	}

	@Override
	public List<Casilla> readAll() {
		return casillaDao.readAll();
	}

	@Override
	public boolean update(Casilla o) {
		return casillaDao.update(o);
	}

	@Override
	public boolean delete(Long id) {
		return casillaDao.delete(id);
	}

}
