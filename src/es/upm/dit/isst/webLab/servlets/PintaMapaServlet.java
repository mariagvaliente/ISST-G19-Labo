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


import es.upm.dit.isst.webLab.dao.ResultadosDAO;
import es.upm.dit.isst.webLab.dao.ResultadosDAOImplementation;
import es.upm.dit.isst.webLab.model.Resultados;


@WebServlet("/PintaMapaServlet")
public class PintaMapaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String anno = (String) req.getSession().getAttribute("anno");		

		String codeProvincia= "";

		if(codeProvincia !="") {
			codeProvincia = "";
		}else {
			codeProvincia =req.getParameter("code-provincia");
		}

		if (codeProvincia==null) {
			codeProvincia = "00";
		}

		String id_caso = anno + "-" + codeProvincia;
		ResultadosDAO resultadoDAO = ResultadosDAOImplementation.getInstance();
		List<Resultados> lista_resultados = new ArrayList<Resultados>();
		List<Resultados> lista_resultados_top = new ArrayList<Resultados>();
		List<Resultados> aux = new ArrayList<Resultados>();
		lista_resultados = resultadoDAO.partidosPorProvinciaAnno(id_caso);
		
		for(int i = 1; i <= 52 ;i++ ){	
			aux = resultadoDAO.partidosPorProvinciaAnno(anno + "-" + i);
			lista_resultados_top.add(aux.get(0));	
		}
		
		req.getSession().setAttribute("lista_resultados", lista_resultados);
		req.getSession().setAttribute("lista_resultados_top", lista_resultados_top);
		req.getSession().setAttribute("provincia", lista_resultados.get(0).provincia);
		getServletContext().getRequestDispatcher("/mapa.jsp").forward(req, resp);
		/*
		System.out.println("El id_caso = " + id_caso);
		System.out.println(lista_resultados.size());
		System.out.println(lista_resultados.get(0).getPartido());*/
	}
}