package com.model;

import com.model.livre;


public class livre {
	 
	int id ; 
	String Etat;
	String Titre;
	String Catégorie;
	String Auteur;


	public int getid() {
		return id;
	}
	
	
	public void setid(int id) {
		this.id = id;
	}
	public String getEtat() {
		return Etat;
	}
	
	
	public void setEtat(String Etat) {
		this.Etat = Etat;
	}


	public String getTitre() {
		return Titre;
	}


	public void setTitre(String Titre) {
		this.Titre = Titre;
	}
	
	
	public String getCatégorie() {
		return Catégorie;
	}
	
	
	public void setCatégorie(String Catégorie) {
		this.Catégorie = Catégorie;
	}
	
	
	public String getAuteur() {
		return Auteur;
	}
	
	
	
	public void setAuteur(String Auteur) {
		this.Auteur = Auteur;
	}
	
	public livre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public livre(String Titre , String Catégorie, String Auteur, String Etat) {
		super();
		this.Titre = Titre;
		this.Catégorie= Catégorie;
		this.Auteur = Auteur;
		this.Etat = Etat;

	}
	
	public livre(int id, String  Titre, String Catégorie, String Auteur , String Etat) {
		super();
		this.id = id;
		this.Titre = Titre;
		this.Catégorie = Catégorie;
		this.Auteur = Auteur;
		this.Etat = Etat;
	}


	public String Affiche(){
		return this.Titre+" | "+this.Auteur+" | "+this.Catégorie+" | "+this.Etat ;
		}
}