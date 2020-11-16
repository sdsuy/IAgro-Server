package com.persistence;

import javax.ejb.Remote;

import com.entities.Casilla;

@Remote
public interface CasillaDaoRemote extends IDao<Casilla> {

}
