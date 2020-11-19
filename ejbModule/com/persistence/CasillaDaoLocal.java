package com.persistence;

import javax.ejb.Local;
import javax.ejb.Remote;

import com.entities.Casilla;

@Local
public interface CasillaDaoLocal extends IDao<Casilla> {

}
