package es.upm.dit.isst.webLab.servlets;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.webLab.dao.CasoDAO;
import es.upm.dit.isst.webLab.dao.CasoDAOImplementation;
import es.upm.dit.isst.webLab.dao.ResultadosDAO;
import es.upm.dit.isst.webLab.dao.ResultadosDAOImplementation;


@WebServlet("/AnnoConsultaServlet")
public class AnnoConsultaServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		CasoDAO casoDAO = CasoDAOImplementation.getInstance();
		String ano_votacion = req.getParameter("ano_votacion");


	}
	
}