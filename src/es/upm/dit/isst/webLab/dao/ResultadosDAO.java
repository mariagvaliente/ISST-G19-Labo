package es.upm.dit.isst.webLab.dao;

import java.util.ArrayList;
import java.util.Collection;

import es.upm.dit.isst.webLab.model.Resultados;

public interface ResultadosDAO{
	
	void insertar(Resultados a);
	
	void modificar(Resultados a);
	
	void eliminar(Resultados a);
		
	Collection<Resultados> obtenerTodos();
	
	Resultados obtener(String id);

	ArrayList<Resultados> partidosPorProvinciaAnno(String id_caso);
	
	Resultados getEscanosPartido(String partido, String id_caso);

}