
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
import com.model.user;
/**
 * Servlet implementation class User
 */
@WebServlet("/User")
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
	bibliodao em;
	int cpt=0;

    /**
     * Default constructor. 
     */
    public User () {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		em=new bibliodao();
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String log=request.getParameter("Login");
		String pass=request.getParameter("Password");
		user u = em.authentification(log, pass);
		if(u!=null)
		{
			HttpSession ses = request.getSession(true);
			ses.setAttribute("user", u);
			response.sendRedirect("user");
		}else
		{
			cpt++;
			request.setAttribute("msg", "Login ou password incorrect");
			request.setAttribute("cpt", cpt);
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
	//		response.sendRedirect("login.jsp");
			
		}
	}

}
