package com.persistence;

import javax.ejb.Local;


import com.entities.Informacion;

@Local
public interface InformacionDaoLocal extends IDao<Informacion> {

}
