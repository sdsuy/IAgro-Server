package com.service;

import javax.ejb.Remote;

import com.entities.Casilla;

@Remote
public interface CasillaBeanRemote extends IBean<Casilla> {
	
	void createDefault();

}
