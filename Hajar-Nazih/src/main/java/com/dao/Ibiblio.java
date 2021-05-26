package com.dao;

import java.util.List;

import com.model.user;
import com.model.livre;

public interface Ibiblio {

	public int adduser(user u);
	public user authentification(String log,String pass);
	public int adduser(String nom,String prenom, String log, String pass, String role);
	
	
	public livre findlivreByAuteur(String Auteur);
	public livre findlivreByCatégorie(String Catégorie);
	public List<livre> alllivre();
	
	
}
