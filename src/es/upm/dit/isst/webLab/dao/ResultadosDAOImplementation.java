package es.upm.dit.isst.webLab.dao;

import java.util.ArrayList;

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
	
	@Override
	public ArrayList <Resultados> partidosPorProvinciaAnno (String id_caso) {

		ArrayList<Resultados> partidosPorProvinciaAnno = new ArrayList<>();
		
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			partidosPorProvinciaAnno.addAll(
				session.createQuery("FROM Resultados u WHERE  u.id_caso = :id_caso order by u.votos DESC").setParameter("id_caso",id_caso).list()
			);
						
			session.getTransaction().commit();
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			
		}finally {
			session.close();
		}
		return partidosPorProvinciaAnno;
	}
	
	
	public Resultados getEscanosPartido(String partido, String id_caso) {
		ArrayList<Resultados> partidosPorProvinciaAnno = new ArrayList<>();
		
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			partidosPorProvinciaAnno.addAll(
				session.createQuery("FROM Resultados u WHERE  u.id_caso = :id_caso and u.partido = :partido").setParameter("id_caso",id_caso).setParameter("partido",partido).list()
			);
						
			session.getTransaction().commit();
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			
		}finally {
			session.close();
		}
		return partidosPorProvinciaAnno.get(0);
	}
	
}
