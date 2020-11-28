package com.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.entities.Casilla;
import com.entities.Tipos;
import com.persistence.CasillaDaoLocal;

/**
 * Session Bean implementation class CasillaBean
 */
@Stateless
public class CasillaBean implements CasillaBeanRemote {
	
	@EJB
	private CasillaDaoLocal casillaDao;

    /**
     * Default constructor. 
     */
    public CasillaBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean create(Casilla o) {
		return casillaDao.create(o);
	}

	@Override
	public Casilla read(Long id) {
		return casillaDao.read(id);
	}

	@Override
	public List<Casilla> readAll() {
		return casillaDao.readAll();
	}

	@Override
	public boolean update(Casilla o) {
		return casillaDao.update(o);
	}

	@Override
	public boolean delete(Long id) {
		return casillaDao.delete(id);
	}

	@Override
	public void createDefault() {
		// Casilla Metodo de Muestreo
		Casilla metodoMuestreo = new Casilla();
		metodoMuestreo.setParametro("Método de muestreo");
		metodoMuestreo.setUnidadMedida("");
		metodoMuestreo.setDescripcion("");
		metodoMuestreo.setTipo(Tipos.STRING);
		casillaDao.create(metodoMuestreo);
		
		// Casilla Estación de Muestreo
		Casilla estacionMuestreo = new Casilla();
		estacionMuestreo.setParametro("Estación de Muestreo"); 
		estacionMuestreo.setUnidadMedida("");
		estacionMuestreo.setDescripcion("");
		estacionMuestreo.setTipo(Tipos.STRING);
		casillaDao.create(estacionMuestreo);
		
		// Casilla Departamento
		Casilla departamento = new Casilla();
		departamento.setParametro("Departamento");
		departamento.setUnidadMedida("");
		departamento.setDescripcion("");
		departamento.setTipo(Tipos.STRING);
		casillaDao.create(departamento);
		
		// Casilla Ubicacion
		Casilla ubicacion = new Casilla();
		ubicacion.setParametro("Ubicación");
		ubicacion.setUnidadMedida("");
		ubicacion.setDescripcion("");
		ubicacion.setTipo(Tipos.DOUBLE);
		casillaDao.create(ubicacion);
		
		// Casilla Imagen
		Casilla imagen = new Casilla();
		imagen.setParametro("Imágen");
		imagen.setUnidadMedida("");
		imagen.setDescripcion("");
		imagen.setTipo(Tipos.STRING);
		casillaDao.create(imagen);
		
	}

}
