package com.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.persistence.UsuarioDaoLocal;

/**
 * Session Bean implementation class UsuarioBean
 */
@Stateless
public class UsuarioBean implements UsuarioBeanRemote {
	
	@EJB
	private UsuarioDaoLocal usuarioDao;

    /**
     * Default constructor. 
     */
    public UsuarioBean() {
        // TODO Auto-generated constructor stub
    }

}
