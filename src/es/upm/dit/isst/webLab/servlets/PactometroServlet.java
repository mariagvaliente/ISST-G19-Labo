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
import es.upm.dit.isst.webLab.logic.Dhont;
import es.upm.dit.isst.webLab.model.Resultados;

@WebServlet("/PactometroServlet")
public class PactometroServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id_caso = "2016-28";
		ResultadosDAO resultadoDAO = ResultadosDAOImplementation.getInstance();
		List<Resultados> lista_pactometro = new ArrayList<Resultados>();
		lista_pactometro = resultadoDAO.partidosPorProvinciaAnno(id_caso);
		req.getSession().setAttribute("lista_pactometro", lista_pactometro);
		getServletContext().getRequestDispatcher("/pactometro.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	

		// para pintar el mapa
		
		String anno = "2016";
		
		if (req.getSession().getAttribute("anno") != null) {
			anno = (String) req.getSession().getAttribute("anno");		
		}

		String codeProvincia= "00";

		if(req.getParameter("code-provincia") != null) {
			codeProvincia =req.getParameter("code-provincia");

		}else {
			codeProvincia = "00";
		}

		
		
		String id_caso = anno + "-" + codeProvincia;
		ResultadosDAO resultadoDAO2 = ResultadosDAOImplementation.getInstance();
		List<Resultados> lista_resultados = new ArrayList<Resultados>();
		List<Resultados> lista_resultados2 = new ArrayList<Resultados>();
		List<Resultados> lista_resultados_top = new ArrayList<Resultados>();
		List<Resultados> aux = new ArrayList<Resultados>();
		lista_resultados = resultadoDAO2.partidosPorProvinciaAnno(id_caso);

		for(int i = 1; i <= 52 ;i++ ){	
			aux = resultadoDAO2.partidosPorProvinciaAnno(anno + "-" + i);
			lista_resultados_top.add(aux.get(0));	
		}

		// hasta aqui pintar

		// creamos la nueva lista de pactometro
		List<Resultados> lista_pactometro = new ArrayList<Resultados>(); // aqui estarán los partidos de tipo Resultado a pactar
		String[] partidos = req.getParameterValues("chkBox");
		ResultadosDAO partido = ResultadosDAOImplementation.getInstance();


		// añadimos los casos a a la lista
		for(int i = 0; i< partidos.length; i++) {
			lista_pactometro.add(partido.getEscanosPartido(partidos[i], id_caso));
		}

		
		// Eliminamos los partidos que han de pactar de la lista de resultados para evitar futuras duplicidades, 
		// ya que esta es la que se pasará a mapa3.jsp
		// y los partidos los tenemos en lista_pactometro. Despues se sumaran los votos y se cambiara todo
		for(Resultados partidosAPactar: lista_pactometro){	
			//System.out.println(lista_pactometro.size());
			for(int i = 0; i< lista_resultados.size(); i++) {
				if(partidosAPactar.getPartido().equals(lista_resultados.get(i).getPartido())) {
					//System.out.println("el partido de la lista global es" + lista_resultados.get(i).getPartido());
					lista_resultados.remove(lista_resultados.get(i));
				}
			}
		}
		
		/*
		for(int i = 0; i< lista_resultados.size(); i++) {
				System.out.println(lista_resultados.get(i).getPartido());
			}
		
		for(int i = 0; i< lista_pactometro.size(); i++) {
			System.out.println(lista_pactometro.get(i).getPartido());
		}*/
		
		int votos = 0;
		int escanos = 0;
		int primeraVez = 0;
		Resultados partidoFicticio = new Resultados();
		for(int i = 0; i< lista_pactometro.size(); i++) {
			
			if(primeraVez == 0) {
				partidoFicticio.setPartido(lista_pactometro.get(i).getPartido());
				primeraVez++;
			}else {
				partidoFicticio.setPartido(partidoFicticio.getPartido() + "+" + lista_pactometro.get(i).getPartido());

			}
			votos = votos + Integer.parseInt(lista_pactometro.get(i).getVotos());
			partidoFicticio.setVotos(String.valueOf(votos));
			escanos = escanos + Integer.parseInt(lista_pactometro.get(i).getEscanos());
			partidoFicticio.setEscanos(String.valueOf(escanos));
			String id = lista_pactometro.get(i).getId();
			partidoFicticio.setColors("#000000");
		}
		
		int k = 0;
		while(Integer.parseInt(lista_resultados.get(k).getVotos()) > Integer.parseInt(partidoFicticio.getVotos())) {
			k++;
		}


		lista_resultados.add(k, partidoFicticio);
		
		Dhont dhont = new Dhont();
		
		ArrayList<Integer>  scannosSaint = dhont.calculaScannosDhont(lista_resultados);
		ArrayList<String> partidosSaint =  dhont.calculaPartidoDhont(lista_resultados);
		ArrayList<String> colorsSaint =  dhont.calculaColorsDhont(lista_resultados);


		for(int i = 0; i < scannosSaint.size() ;i++ ) {

			Resultados resultado = new Resultados();
			System.out.println(partidosSaint.get(i));
			System.out.println(Integer.toString(scannosSaint.get(i)));
			resultado.setPartido(partidosSaint.get(i));
			resultado.setEscanos(Integer.toString(scannosSaint.get(i)));
			resultado.setColors(colorsSaint.get(i));

			lista_resultados2.add(resultado);

			// System.out.println("Esto son lo que queremos " + lista_resultados2.get(i).escanos);
			// System.out.println("Esto son lo que queremos " + lista_resultados2.get(i).partido);

		}

		/*
		System.out.println("El id_caso = " + id_caso);
		System.out.println(lista_resultados.size());
		System.out.println(lista_resultados.get(0).getPartido());*/
		
		req.getSession().setAttribute("lista_resultados2", lista_resultados2); // Para el PieChart (escaños)
		req.getSession().setAttribute("lista_resultados", lista_resultados); // Para el BarChart (votos)
		req.getSession().setAttribute("lista_resultados_top", lista_resultados_top);
		getServletContext().getRequestDispatcher("/mapa3.jsp").forward(req, resp);
	}

}
