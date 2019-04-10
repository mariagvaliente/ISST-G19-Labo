package es.upm.dit.isst.webLab.dao;

import java.util.Collection;
import java.util.List;

import org.hibernate.Session;

import es.upm.dit.isst.webLab.model.Caso;

public class CasoDAOImplementation implements CasoDAO{
	
	private static CasoDAOImplementation instancia = null;
	private CasoDAOImplementation() {}
	public static CasoDAOImplementation getInstance() {
		if (null == instancia)
			instancia = new CasoDAOImplementation();
		return instancia;
	}

	@Override
	public void insertar(Caso caso) {
		Session session = SessionFactoryService.get().openSession();
		try {
		  session.beginTransaction();
			session.save( caso );
		  session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
		  session.close();
		}	
	}

	@Override
	public void modificar(Caso caso) {
		
		Session session = SessionFactoryService.get().openSession();
		try {
		  session.beginTransaction();
		  session.saveOrUpdate( caso );
		  session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
		  session.close();
		}	
		
	}

	@Override
	public void eliminar(Caso caso) {
		
		Session session = SessionFactoryService.get().openSession();
		try {
		  session.beginTransaction();
		  session.delete( caso );
		  session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
		  session.close();
		}
	}

	@Override
	public Collection <Caso> obtenerTodos() {
		
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		Collection<Caso> caso = session.createQuery("from Caso").list();
		session.getTransaction().commit();
		session.close();
		return caso;
	}

	@Override
	public Caso obtener(String id) {
		
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		Caso caso = session.load( Caso.class, id );
		session.getTransaction().commit();
		session.close();
		return caso;
		
	}

}
