


package com.gestion.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestion.parking.dao.IPersonneDao;
import com.gestion.parking.entites.Personne;

import com.gestion.parking.services.IPersonneService;

@Transactional
public class PersonneServiceImpl implements IPersonneService {
	
	private IPersonneDao dao;
	
	public void setDao(IPersonneDao dao) {
		this.dao = dao;
	}

	@Override
	public Personne save(Personne entity) {
		return dao.save(entity);
	}

	@Override
	public Personne update(Personne entity) {
		return dao.update(entity);
	}

	@Override
	public List<Personne> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Personne> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Personne getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Personne findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Personne findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

	
}
