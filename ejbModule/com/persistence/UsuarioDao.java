package com.persistence;

import java.util.List;

import javax.ejb.Singleton;

import com.entities.Usuario;

/**
 * Session Bean implementation class UsuarioDao
 */
@Singleton
public class UsuarioDao implements UsuarioDaoLocal {

    /**
     * Default constructor. 
     */
    public UsuarioDao() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void create(Usuario o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario read(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Usuario o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
