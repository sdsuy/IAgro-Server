package com.persistence;

import javax.ejb.Local;

import com.entities.Casilla;

@Local
public interface CasillaDaoLocal extends IDao<Casilla> {

}
