package ufps.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import convencion.dao.ParticipanteDao;
import convencion.dao.ParticipanteDaoImp;
import convencion.model.Participante;


/**
 * Servlet implementation class RegistroServlet
 */
@WebServlet("/RegistroServlet")
public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Haciendo nada: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nombre = request.getParameter("nombre");
		String telefono = request.getParameter("telefono");
		String email = request.getParameter("email");
		
		Participante part = new Participante(nombre, email, telefono, "activo", 0);
		
		ParticipanteDao pd = new ParticipanteDaoImp();
		pd.insertar(part);
		
		HttpSession session = request.getSession();
		
		session.setAttribute("participante", part);
		
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
		
		response.getWriter().append("<br/>Nombre: ").append(nombre);
		response.getWriter().append("<br/>Email: ").append(email);
		response.getWriter().append("<br/>Telefono: ").append(telefono);

		
		
	}

}
