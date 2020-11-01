package com.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.persistence.FuncionalidadDaoLocal;

/**
 * Session Bean implementation class FuncionalidadBean
 */
@Stateless
public class FuncionalidadBean implements FuncionalidadBeanRemote {
	
	@EJB
	private FuncionalidadDaoLocal funcionalidadDao;

    /**
     * Default constructor. 
     */
    public FuncionalidadBean() {
        // TODO Auto-generated constructor stub
    }

}
