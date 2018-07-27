package com.gestion.parking.controlleur;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.gestion.parking.entites.Personne;
import com.gestion.parking.services.IPersonneService;




@Controller
@RequestMapping(value = "/personne")
public class PersonneController {
	
	@Autowired
	private IPersonneService catService;
	
	@RequestMapping(value = "/")
	public String Personne(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<Personne> personnes = catService.selectAll();
		if (personnes == null) {
			personnes = new ArrayList<Personne>();
		}
		model.addAttribute("personnes", personnes);
		return "personne/personne";
	}
	
	@RequestMapping(value = "/nouveau", method = RequestMethod.GET)
	public String ajouterPersonne(Model model) {
		Personne personnes = new Personne();
		model.addAttribute("personnes", personnes);
		return "personne/ajouterPersonne";
	}
	
	@RequestMapping(value = "/enregistrer")
	public String enregistrerPersonne(Model model, Personne personne) {
	
		if (personne != null) {
			if (personne.getId() > 0) {
				catService.update(personne);
			} else {
				catService.save(personne);
			}
		}
			
		
		return "redirect:/personne/";
	}
	@RequestMapping(value = "/modifier/{id}")
	public String modifierPersonne(Model model, @PathVariable Long id) {
		if (id != null) {
			Personne personne = catService.getById(id);
			if (personne != null) {
				catService.update(personne);
				model.addAttribute("personnes", personne);
			}
		}
		return "personne/ajouterPersonne";
	
}
	
	
	/*	*/
	
	
	
	
	@RequestMapping(value = "/supprimer/{idPersonne}")
	
	
	public String supprimerPersonne(Model model, @PathVariable Long idPersonne) {
			if (idPersonne != null) {
				Personne personne = catService.getById(idPersonne);
				if (personne != null) {
					//TODO Verification avant suppression
					catService.remove(idPersonne);
				}
			}
			return "redirect:/personne/";
		}}








