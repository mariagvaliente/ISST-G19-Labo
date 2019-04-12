package es.upm.dit.isst.webLab.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;


@Entity
public class Resultados implements Serializable {

	@Id
	public String id;
	public String id_caso;
	public String partido;
	public String escanos;
	public String votos;

	/*
	 * @ManyToOne// poner id caso del resultado private Caso caso;
	 */

	public Resultados(){	// falta constructor con las variables de resultado https://www.arquitecturajava.com/jpa-manytoone/

	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getId_caso() {
		return id_caso;
	}


	public void setId_caso(String id_caso) {
		this.id_caso = id_caso;
	}


	public String getPartido() {
		return partido;
	}


	public void setPartido(String partido) {
		this.partido = partido;
	}


	public String getEscanos() {
		return escanos;
	}


	public void setEscanos(String escanos) {
		this.escanos = escanos;
	}


	public String getVotos() {
		return votos;
	}


	public void setVotos(String votos) {
		this.votos = votos;
	}

	
	

}