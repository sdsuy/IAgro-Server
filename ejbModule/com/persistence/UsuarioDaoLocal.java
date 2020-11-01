package com.persistence;

import javax.ejb.Local;

import com.entities.Usuario;

@Local
public interface UsuarioDaoLocal extends IDao<Usuario> {

}
