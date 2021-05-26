package com.model;

 public class user {
	int id;
	 String nom,prenom,log,pass,role; 
	 


	public user() {
			super();
			// TODO Auto-generated constructor stub
		}
		public user(String nom,String prenom, String log, String pass,String role) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.log = log;
			this.pass = pass;
			this.role = role;
		}
		public user(int id,String nom,String prenom, String log, String pass,String role) {
			super();
			this.id = id;
			this.nom = nom;
			this.prenom = prenom;
			this.log = log;
			this.pass = pass;
			this.role = role;
		}
		
public String getNOM() {
	return nom;
}
public void setNOM(String nom) {
	this.nom=nom; 
}
public String getLogin() {
	return log;
}
public void setLogin(String log) {
	this.log=log;
	}
public String getPassword() {
	return pass;
}
public void setPassword(String pass) {
	this.pass=pass; }
public String getrole() {
	return role;
}
public void setrole(String role) {
	this.role=role; 
	}
public String getPrenom() {
	
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom=prenom; 
}

}

 