package es.upm.dit.isst.webLab.servlets;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.webLab.dao.ResultadosDAO;
import es.upm.dit.isst.webLab.dao.ResultadosDAOImplementation;


@WebServlet("/AnnoConsultaServlet2")
public class AnnoConsultaServlet2 extends HttpServlet{
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		   
		String anno;
		
        if (req.getParameter("1977") != null) {
        	anno= "1977";
        } else if (req.getParameter("1979") != null) {
        	anno= "1979";
        } else if (req.getParameter("1982") != null) {
        	anno= "1982";
        } else if (req.getParameter("1986") != null) {
        	anno= "1986";
        } else if (req.getParameter("1989") != null) {
        	anno= "1989";
        } else if (req.getParameter("1993") != null) {
        	anno= "1993";
        } else if (req.getParameter("1996") != null) {
        	anno= "1996";
        } else if (req.getParameter("2000") != null) {
        	anno= "2000";
        } else if (req.getParameter("2004") != null) {
        	anno= "2004";
        } else if (req.getParameter("2008") != null) {
        	anno= "2008";
        } else if (req.getParameter("2011") != null) {
        	anno= "2011";
        } else if (req.getParameter("2015") != null) {
        	anno= "2015";
        } else if (req.getParameter("2016") != null) {
        	anno= "2016";
        } else {
        	anno = null;
        }


		req.getSession().setAttribute("anno", anno);
		
		resp.sendRedirect(req.getContextPath() + "/PintaMapaServlet2");

    	//req.getRequestDispatcher("mapa.jsp").forward(req, resp);
	}

}
