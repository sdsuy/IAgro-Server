package com.service;

import javax.ejb.Remote;

import com.entities.Usuario;

@Remote
public interface UsuarioBeanRemote extends IBean<Usuario> {

}
