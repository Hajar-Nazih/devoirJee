package com.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.bibliodao;

/**
 * Servlet implementation class addUser
 */
@WebServlet("/addUser")
public class addUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       bibliodao um; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addUser() {
        super();
       
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		um=new bibliodao(); 
	}
  
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 try (PrintWriter out = response.getWriter()) {
		} 
		   String prm=request.getParameter("prenom");
		   String nm=request.getParameter("nom");
		   String lg=request.getParameter("log");
		   String ps=request.getParameter("pass");
		   String rl=request.getParameter("role");
		   
		   int nb = um.adduser(prm,nm,lg, ps, rl);
		   response.sendRedirect("User");
	}

}
