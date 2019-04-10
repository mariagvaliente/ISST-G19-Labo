package es.upm.dit.isst.webLab.dao;

import java.util.Collection;

import org.hibernate.Session;

import es.upm.dit.isst.webLab.model.Resultados;

public class ResultadosDAOImplementation implements ResultadosDAO {

	private static ResultadosDAOImplementation instancia = null;
	private ResultadosDAOImplementation() {}
	public static ResultadosDAOImplementation getInstance() {
		if (null == instancia)
			instancia = new ResultadosDAOImplementation();
		return instancia;
	}
	
	@Override
	public void insertar(Resultados resultado) {
		Session session = SessionFactoryService.get().openSession();
		try {
		  session.beginTransaction();
			session.save( resultado );
		  session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
		  session.close();
		}	
	}

	@Override
	public void modificar(Resultados resultado) {
		Session session = SessionFactoryService.get().openSession();
		try {
		  session.beginTransaction();
		  session.saveOrUpdate( resultado );
		  session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
		  session.close();
		}	
	}

	@Override
	public void eliminar(Resultados resultado) {
		
		Session session = SessionFactoryService.get().openSession();
		try {
		  session.beginTransaction();
		  session.delete( resultado );
		  session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
		  session.close();
		}
	}

	@Override
	public Collection<Resultados> obtenerTodos() {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		Collection<Resultados> resultado = session.createQuery("from Resultados").list();
		session.getTransaction().commit();
		session.close();
		return resultado;
	}

	@Override
	public Resultados obtener(String id) {
		
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		Resultados resultado = session.load( Resultados.class, id );
		session.getTransaction().commit();
		session.close();
		return resultado;	
	}
	
}
