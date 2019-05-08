package es.upm.dit.isst.webLab.dao;

import java.util.Collection;

import java.util.ArrayList;
import java.util.Collection;

import es.upm.dit.isst.webLab.model.Encuestas;
import es.upm.dit.isst.webLab.model.Resultados;

public interface EncuestasDAO {
	
	void insertar(Encuestas String);
	
	void modificar(Encuestas String);
	
	void eliminar(Encuestas String);
				
	ArrayList<Encuestas> partidosPorEncuestas(int id);
	
	ArrayList<Encuestas> obtenerTodos();

}