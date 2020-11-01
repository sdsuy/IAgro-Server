package com.persistence;

import javax.ejb.Local;

import com.entities.Usuario;

@Local
public interface AuthDaoLocal {
	
	Usuario login(String username, String password);

}
