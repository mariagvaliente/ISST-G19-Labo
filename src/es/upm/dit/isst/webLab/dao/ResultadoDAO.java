package es.upm.dit.isst.webLab.dao;

import es.upm.dit.isst.webLab.model.Resultado;

public interface ResultadoDAO {
	
	public void create(Resultado resultado);

	public int read(int votos, int escannos);

	public void update(Resultado resultado);

	public void delete(Resultado resultado);

}