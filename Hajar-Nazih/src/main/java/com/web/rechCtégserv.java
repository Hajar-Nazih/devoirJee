package com.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.bibliodao;
import com.model.livre;

/**
 * Servlet implementation class rechlivreserv
 */
@WebServlet("/rechCt�gserv")
public class rechCt�gserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
    bibliodao  bk; 
    int cpt ; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public rechCt�gserv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
	// TODO Auto-generated method stub
		bk= new bibliodao() ; 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Titre =request.getParameter("Titre");
		String Cat�gorie =request.getParameter("Cat�gorie");
		String Auteur =request.getParameter("Auteur");
		String Etat =request.getParameter("Etat");
		livre b = bk.findlivreByCat�gorie(Cat�gorie);
		if(b!=null)
		{
			HttpSession ses = request.getSession(true);
			ses.setAttribute("livre", b);
			response.sendRedirect("livre");
		}else
		{
			cpt++;
			request.setAttribute("msg", "Cat�gorie n'existe pas");
			request.setAttribute("cpt", cpt);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Cat�gorie.jsp");
			dispatcher.forward(request, response);
	//		response.sendRedirect("Cat�gorie.jsp");
			
		}
	}

}
