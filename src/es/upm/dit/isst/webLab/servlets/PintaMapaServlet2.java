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
import es.upm.dit.isst.webLab.logic.SaintLey;



@WebServlet("/PintaMapaServlet2")
public class PintaMapaServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String anno = (String) req.getSession().getAttribute("anno");				
		String codeProvincia= "";
		
		if(codeProvincia !="") {
			codeProvincia = "";
		} else {
			codeProvincia =req.getParameter("code-provincia");
		}

		if (codeProvincia==null) {
			codeProvincia = "00";
		}

		String id_caso = anno + "-" + codeProvincia;

		ResultadosDAO resultadoDAO = ResultadosDAOImplementation.getInstance();
		// Ley d'Hont
		List<Resultados> lista_resultados = new ArrayList<Resultados>();
		List<Resultados> lista_resultados_top = new ArrayList<Resultados>();
		
		List<Resultados> aux = new ArrayList<Resultados>();
		// Ley Saint Lague
		List<Resultados> lista_resultados2 = new ArrayList<Resultados>();
		List<Resultados> lista_resultados_top2 = new ArrayList<Resultados>();

		SaintLey ley = new SaintLey();

		lista_resultados = resultadoDAO.partidosPorProvinciaAnno(id_caso);

		for(int i = 1; i <= 52 ;i++ ){	
			aux = resultadoDAO.partidosPorProvinciaAnno(anno + "-" + i);
			lista_resultados_top.add(aux.get(0));	

		}

		req.getSession().setAttribute("lista_resultados", lista_resultados);
		req.getSession().setAttribute("lista_resultados_top", lista_resultados_top);

		ArrayList<Integer>  scannosSaint = ley.calculaScannosSaintLague(lista_resultados);
		ArrayList<String> partidosSaint =  ley.calculaPartidoSaintLague(lista_resultados);

		for(int i = 0; i < scannosSaint.size() ;i++ ) {

			Resultados resultado = new Resultados();
			resultado.setPartido(partidosSaint.get(i));
			resultado.setEscanos(Integer.toString(scannosSaint.get(i)));

			lista_resultados2.add(resultado);

			// System.out.println("Esto son lo que queremos " + lista_resultados2.get(i).escanos);
			// System.out.println("Esto son lo que queremos " + lista_resultados2.get(i).partido);

		}

		req.getSession().setAttribute("lista_resultados2", lista_resultados2);
		req.getSession().setAttribute("lista_resultados_top2", lista_resultados_top2);
		req.getSession().setAttribute("provincia", lista_resultados.get(0).provincia);


		getServletContext().getRequestDispatcher("/mapa2.jsp").forward(req, resp);
	}


}
