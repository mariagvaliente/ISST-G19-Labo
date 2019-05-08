package es.upm.dit.isst.webLab.dao;

import java.util.ArrayList;

import java.util.Collection;

import org.hibernate.Session;

import es.upm.dit.isst.webLab.model.Encuestas;
import es.upm.dit.isst.webLab.model.Resultados;

public class EncuestasDAOImplementation implements EncuestasDAO {

	private static EncuestasDAOImplementation instancia = null;
	private EncuestasDAOImplementation() {}
	public static EncuestasDAOImplementation getInstance() {
		if (null == instancia)
			instancia = new EncuestasDAOImplementation();
		return instancia;
	}

	@Override
	public void insertar(Encuestas resultado) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.save( resultado );
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			session.close();
		}	
	}

	@Override
	public void modificar(Encuestas resultado) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate( resultado );
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			session.close();
		}	
	}

	@Override
	public void eliminar(Encuestas resultado) {

		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.delete( resultado );
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			session.close();
		}
	}

	@Override
	public  ArrayList <Encuestas>  obtenerTodos() {
		
		ArrayList<Encuestas> encuestas = new ArrayList<>();
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			encuestas.addAll( 
					session.createQuery("FROM Encuestas").list()
				);
			session.getTransaction().commit();
		}
		catch (Exception e){
			System.out.println(e.getMessage());

		}finally {
			session.close();
		}
		return encuestas;
	}

	@Override
	public ArrayList <Encuestas> partidosPorEncuestas (int id) {
		ArrayList<Encuestas> partidosPorEncuestas = new ArrayList<>();
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			partidosPorEncuestas.addAll(
				session.createQuery("FROM Encuestas u WHERE u.id = :id ").setParameter("id",id).list()
			);
			session.getTransaction().commit();
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			
		}finally {
			session.close();
		}
		return partidosPorEncuestas;
	}
}
