package es.upm.dit.isst.webLab.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.webLab.dao.EncuestasDAO;
import es.upm.dit.isst.webLab.dao.EncuestasDAOImplementation;
import es.upm.dit.isst.webLab.model.Encuestas;
import es.upm.dit.isst.webLab.logic.SaintLey;

@WebServlet("/ConsultaEncuestaServlet")
public class ConsultaEncuestaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		EncuestasDAO encuestasDAO = EncuestasDAOImplementation.getInstance();
		List<Encuestas> lista_encuestas = new ArrayList<Encuestas>();
		lista_encuestas =  encuestasDAO.obtenerTodos();
		req.getSession().setAttribute("lista_encuestas", lista_encuestas);
		getServletContext().getRequestDispatcher("/estimacion.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		EncuestasDAO encuestasDAO = EncuestasDAOImplementation.getInstance();
		List<Encuestas> resultado = new ArrayList<Encuestas>();
		resultado = encuestasDAO.partidosPorEncuestas(Integer.parseInt(req.getParameter("ConsultaEncuesta")));	
		req.getSession().setAttribute("resultado", resultado.get(0));
		getServletContext().getRequestDispatcher("/estimacion.jsp").forward(req, resp);
	}
}


