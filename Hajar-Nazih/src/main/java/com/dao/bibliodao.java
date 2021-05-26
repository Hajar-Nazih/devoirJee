package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.user;
import com.model.livre;
import com.util.DBinteraction;


public class bibliodao implements Ibiblio{

	
	public int adduser(user u) {
		DBinteraction.connect();
		int nb=DBinteraction.Maj("insert into user values(null,'"+u.getNOM()+"','"+u.getPrenom()+"','"+u.getLogin()+"','"+u.getPassword()+"','"+u.getrole()+"')");
		DBinteraction.disconnect();
		return nb;
	}


	public int adduser(String nom,String prenom, String log, String pass, String role) {
		DBinteraction.connect();
		int nb=DBinteraction.Maj("insert into user values(null,'"+nom+"','"+prenom+"','"+log+"','"+pass+"','"+role+"')");
		DBinteraction.disconnect();
		return nb;
	}


	public user authentification(String Login, String Password) {
		user u=null;
		DBinteraction.connect();
		ResultSet res = DBinteraction.select("SELECT * FROM user where log='"+Login+"' and pass='"+Password+"'");
		try {
			if(res.next())
			{
		 u=new user( res.getInt(1),res.getString(4), res.getString(2), res.getString(3),res.getString(4),res.getString(5) );
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	
	public livre findlivreByAuteur(String Auteur) {
		livre b=null;
		DBinteraction.connect();
		ResultSet res = DBinteraction.select("SELECT * FROM livre where Auteur="+Auteur);
		try {
			if(res.next())
			{
				b=new livre(res.getInt(1),res.getString(2), res.getString(3), res.getString(4),res.getString(5));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
    
	
	public livre findlivreByCatégorie(String Catégorie) {
		livre b=null;
		DBinteraction.connect();
		ResultSet res = DBinteraction.select("SELECT * FROM livre where Catégorie="+Catégorie);
		try {
			if(res.next())
			{
			 b=new livre(res.getInt(1),res.getString(2), res.getString(3), res.getString(4),res.getString(5));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	
	
	
	public List<livre> alllivre() {
		List<livre>  livre=new ArrayList<livre>();
		DBinteraction.connect();
		ResultSet res = DBinteraction.select("select * from livre ");
		try {
			while(res.next())
			{
				livre b=new livre(res.getInt(1),res.getString(2), res.getString(3), res.getString(4),res.getString(5));
				livre.add(b);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return livre;
	}

	
}


