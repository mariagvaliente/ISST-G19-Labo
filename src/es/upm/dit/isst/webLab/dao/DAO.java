package es.upm.dit.isst.webLab.dao;

import java.util.ArrayList;
import java.util.Collection;

import es.upm.dit.isst.webLab.model.Resultados;

public interface DAO<T, K> {
	
	void insertar(T a);
	
	void modificar(T a);
	
	void eliminar(T a);
	
	Collection<T> obtenerTodos();
	
	T obtener(K id);

	ArrayList<Resultados> partidosPorProvinciaAnno(String id_caso);

}
