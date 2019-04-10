package es.upm.dit.isst.webLab.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;


@Entity
public class Caso implements Serializable {

@Id
private String id;
private String codigo_provincia;
private String nombre_provincia;
private String censo_provincia;
private String votos_validados;
private String votos_blanco;
private String votos_nulo;
private String ano_resultado;

 
@OneToMany(mappedBy = "id_caso", fetch=FetchType.EAGER) // poner id caso del resultado
private Collection<Resultados> resultados;


public Caso(){	// falta constructor con las variables de resultado https://www.arquitecturajava.com/jpa-manytoone/
		
}


public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


public String getCodigo_provincia() {
	return codigo_provincia;
}


public void setCodigo_provincia(String codigo_provincia) {
	this.codigo_provincia = codigo_provincia;
}


public String getNombre_provincia() {
	return nombre_provincia;
}


public void setNombre_provincia(String nombre_provincia) {
	this.nombre_provincia = nombre_provincia;
}


public String getCenso_provincia() {
	return censo_provincia;
}


public void setCenso_provincia(String censo_provincia) {
	this.censo_provincia = censo_provincia;
}


public String getVotos_validados() {
	return votos_validados;
}


public void setVotos_validados(String votos_validados) {
	this.votos_validados = votos_validados;
}


public String getVotos_blanco() {
	return votos_blanco;
}


public void setVotos_blanco(String votos_blanco) {
	this.votos_blanco = votos_blanco;
}


public String getVotos_nulo() {
	return votos_nulo;
}


public void setVotos_nulo(String votos_nulo) {
	this.votos_nulo = votos_nulo;
}


public String getAno_resultado() {
	return ano_resultado;
}


public void setAno_resultado(String ano_resultado) {
	this.ano_resultado = ano_resultado;
}


public Collection<Resultados> getResultado() {
	return resultados;
}


public void setResultado(Collection<Resultados> resultados) {
	this.resultados = resultados;
}




}