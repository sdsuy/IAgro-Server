package com.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.entities.Usuario;
import com.persistence.UsuarioDao;
import com.persistence.UsuarioDaoLocal;

/**
 * Session Bean implementation class UsuarioBean
 */
@Stateless
public class UsuarioBean implements UsuarioBeanRemote {
	
	@EJB
	private UsuarioDaoLocal usuarioDao;

    /**
     * Default constructor. 
     */
    public UsuarioBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void create(Usuario o) {
		
		usuarioDao.create(o);
		
	}

	@Override
	public Usuario read(Long id) {
		
		return usuarioDao.read(id);
	}

	@Override
	public List<Usuario> readAll() {
		
		return usuarioDao.readAll();
	}

	@Override
	public void update(Usuario o) {
		
		usuarioDao.update(o);
		
	}

	@Override
	public void delete(Long id) {
		
		usuarioDao.delete(id);
		
	}

}
