package com.gestion.parking.services;

import java.util.List;

import com.gestion.parking.entites.Personne;

public interface IPersonneService {
	
	public Personne save(Personne entity);
	
	public Personne update(Personne entity);

	public List<Personne> selectAll();

	public List<Personne> selectAll(String sortField, String sort);

	public Personne getById(Long id);

	public void remove(Long id);

	public Personne findOne(String paramName, Object paramValue);

	public Personne findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);

}
