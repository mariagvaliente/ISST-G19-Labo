package es.upm.dit.isst.webLab.dao;

import es.upm.dit.isst.webLab.model.Caso;

public interface CasoDAO {
	
	public void create(Caso caso);

	public int read(int anno, String partido);

	public void update(Caso caso);

	public void delete(Caso caso);

}
