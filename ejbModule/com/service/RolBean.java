package com.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.persistence.RolDaoLocal;

/**
 * Session Bean implementation class RolBean
 */
@Stateless
public class RolBean implements RolBeanRemote {
	
	@EJB
	private RolDaoLocal rolDao;

    /**
     * Default constructor. 
     */
    public RolBean() {
        // TODO Auto-generated constructor stub
    }

}
