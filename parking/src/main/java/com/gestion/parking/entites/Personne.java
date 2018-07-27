package com.gestion.parking.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Personne implements Serializable {

	@Id
	@GeneratedValue
	private long id ;
	private String nom ;
	private String prenom;
	private String matriculeVoiture ;
	private String poste;
	private String contact ;

	
	
	
	public Personne() {
		super();
	}
	public Personne(long id, String nom, String prenom, String matriculeVoiture, String poste, String contact) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.matriculeVoiture = matriculeVoiture;
		this.poste = poste;
		this.contact = contact;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getmatriculeVoiture() {
		return matriculeVoiture;
	}
	public void setmatriculeVoiture(String matriculeVoiture) {
		this.matriculeVoiture = matriculeVoiture;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
}
