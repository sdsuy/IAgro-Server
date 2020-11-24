package com.service;

import javax.ejb.EJB;
import javax.ejb.Stateful;

import com.entities.Roles;
import com.entities.Usuario;
import com.persistence.AuthDaoLocal;
import com.persistence.UsuarioDaoLocal;

/**
 * Session Bean implementation class AuthBean
 */
@Stateful
public class AuthBean implements AuthBeanRemote {
	
	private static final String NOMBRE = "JUAN";
	private static final String APELLIDO = "PEREZ";
	private static final String DOCUMENTO = "12345678";
	private static final String EMAIL = "admin@utec";
	private static final String NICKNAME = "admin";
	private static final String CLAVE = "1234";
//	private static final String ROL = "ADMINISTRADOR";
//	private static final String DESCRIPCION = "USUARIO CON SUPER PODERES";

	@EJB
	private AuthDaoLocal authDao;
	
	@EJB
	private UsuarioDaoLocal usuarioDao;
	
	private Usuario authUser;

    /**
     * Default constructor. 
     */
    public AuthBean() {
        
    }

	@Override
	public void bootstrap() {
//    	Rol bootAdminRol = new Rol();
//    	bootAdminRol.setNombre(ROL);
//    	bootAdminRol.setDescripcion(DESCRIPCION);
    	
//    	rolDao.create(bootAdminRol); // se debe crear primero el rol antes del usuario
    	
    	Usuario bootUser = new Usuario();
    	bootUser.setNombre(NOMBRE);
    	bootUser.setApellido(APELLIDO);
    	bootUser.setDocumento(DOCUMENTO);
    	bootUser.setEmail(EMAIL);
    	bootUser.setNickname(NICKNAME);
    	bootUser.setClave(CLAVE);
    	bootUser.setRol(Roles.ADMINISTRADOR);
    	
    	usuarioDao.create(bootUser); // creo el usuario
	}

	@Override
	public void login(String username, String password) {
		authUser = authDao.login(username, password);
	}

	@Override
	public Usuario getAuthUser() {
		return authUser;
	}

	@Override
	public void logout() {
		authUser = null;
	}

}
