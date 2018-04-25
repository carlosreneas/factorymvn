package ufps.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ufps.model.Participante;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");
		
		Participante p = (Participante) request.getSession().getAttribute("participante");
		
		if(p.getEmail().contentEquals(usuario) && 
				p.getTelefono().contentEquals(clave) && 
				p.getEstado().contentEquals("Activo")){
			RequestDispatcher rd = request.getRequestDispatcher("sucess.jsp");
			rd.forward(request, response);
			
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
		
	}

}
