package com.service;

import javax.ejb.EJB;
import javax.ejb.Stateful;

import com.entities.Usuario;
import com.persistence.AuthDaoLocal;

/**
 * Session Bean implementation class AuthBean
 */
@Stateful
public class AuthBean implements AuthBeanRemote {
	
	@EJB
	private AuthDaoLocal authDao;
	
	private Usuario authUser;

    /**
     * Default constructor. 
     */
    public AuthBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void login(String username, String password) {
		authUser = authDao.login(username, password);
	}

	@Override
	public Usuario getAuthUser() {
		return authUser;
	}

	@Override
	public void logout() {
		authUser = null;
	}

}
