package database;

import java.util.List;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import main.*;

public class DbHandler {
	
	public List<Student> verifyUser(String tableName, String username, String password) {
		
		List<Student> foundStudents = null;
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Essay.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			foundStudents = session.createQuery("from Student").getResultList();
			foundStudents = session.createQuery("from " + tableName + " s where s.uName='" + username + "'" + " AND s.password='" + password + "'").getResultList();

			session.getTransaction().commit();
			session.close();

			System.out.println("Done!");
		} finally {
			factory.close();
		}

		return foundStudents;
	}
	
	public List<Essay> viewEssays(boolean type){
		List<Essay> foundEssays = null;
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Essay.class).addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			foundEssays = session.createQuery("from Essay").getResultList();
			foundEssays = session.createQuery("from Essay e where e.type = " + type).getResultList();
			
			session.getTransaction().commit();
			session.close();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
		
		return foundEssays;
	}
	
	public List<Essay> getEssayDetails(String title) {
		List<Essay> requestedEssay = null;
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Essay.class).addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			requestedEssay = session.createQuery("from Essay").getResultList();
			requestedEssay = session.createQuery("from Essay e where e.title = '" + title +"'").getResultList();
			
			session.getTransaction().commit();
			session.close();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
		
		return requestedEssay;
	}
}
