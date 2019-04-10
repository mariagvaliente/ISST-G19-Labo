package es.upm.dit.isst.webLab.dao;

import java.util.Collection;

public interface DAO<T, K> {
	
	void insertar(T a);
	
	void modificar(T a);
	
	void eliminar(T a);
	
	Collection<T> obtenerTodos();
	
	T obtener(K id);

}
