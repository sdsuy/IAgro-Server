package com.service;

import javax.ejb.Remote;

import com.entities.Usuario;

@Remote
public interface AuthBeanRemote {
	
	void bootstrap();
	void login(String username, String password);
	Usuario getAuthUser();
	void logout();

}
