package com.model;

import com.model.livre;


public class livre {
	 
	int id ; 
	String Etat;
	String Titre;
	String Cat�gorie;
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
	
	
	public String getCat�gorie() {
		return Cat�gorie;
	}
	
	
	public void setCat�gorie(String Cat�gorie) {
		this.Cat�gorie = Cat�gorie;
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
	
	public livre(String Titre , String Cat�gorie, String Auteur, String Etat) {
		super();
		this.Titre = Titre;
		this.Cat�gorie= Cat�gorie;
		this.Auteur = Auteur;
		this.Etat = Etat;

	}
	
	public livre(int id, String  Titre, String Cat�gorie, String Auteur , String Etat) {
		super();
		this.id = id;
		this.Titre = Titre;
		this.Cat�gorie = Cat�gorie;
		this.Auteur = Auteur;
		this.Etat = Etat;
	}


	public String Affiche(){
		return this.Titre+" | "+this.Auteur+" | "+this.Cat�gorie+" | "+this.Etat ;
		}
}