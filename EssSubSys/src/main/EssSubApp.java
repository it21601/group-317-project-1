package main;

import java.text.ParseException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import main.Student;

public class EssSubApp {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Essay.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			// create the student object
			String jdate = "2020-01-30";
            Date sqldate = DateFormat.parseDate(jdate);
			
            Student student = new Student("George", "Andrikopoulos", "it21601", "pass", "it21601@hua.gr", sqldate, Department.INFORMATICS.name(), "", 7, 20, false);
            Student student1 = new Student("Thanos", "Arapakis", "it21603", "pass2", "it21603@hua.gr", sqldate, Department.INFORMATICS.name(), "yolo", 7, 25, false);
            Student student2 = new Student("Nikos", "Vidalis", "it21610", "pass3", "it21610@hua.gr", sqldate, Department.INFORMATICS.name(), "nicktaspy", 7, 40, false);

            Essay essay = new Essay("Javascript", sqldate, "-Must have experience with Javascript", "Quisque quis aliquet pellentesque congue\r\n" + 
            		"Ut ad orci habitant ultricies\r\n" + 
            		"Aenean hac quisque turpis odio mattis sapien facilisis\r\n" + 
            		"Quam eu porttitor mauris curabitur nisi primis semper iaculis erat scelerisque cubilia nam nec\r\n"+
            		"Lectus nisl sed venenatis etiam mauris sapien\r\n "+ 
            		"Mollis risus nisl molestie porta nulla hac aenean\r\n","javascript, code, web development", false);
            Essay essay1 = new Essay("Informatics and Society", sqldate, "-Interest in Sociology", "Quisque quis aliquet pellentesque congue\r\n" + 
            		"Ut ad orci habitant ultricies\r\n" + 
            		"Aenean hac quisque turpis odio mattis sapien facilisis\r\n" + 
            		"Quam eu porttitor mauris curabitur nisi primis semper iaculis erat scelerisque cubilia nam nec\r\n"+
            		"Lectus nisl sed venenatis etiam mauris sapien\r\n "+ 
            		"Mollis risus nisl molestie porta nulla hac aenean\r\n","technology, informatics, communications, web", false);
            Essay essay2 = new Essay("Modern and Future OS's", sqldate, "-Linux Mastery", "Quisque quis aliquet pellentesque congue\r\n" + 
            		"Ut ad orci habitant ultricies\r\n" + 
            		"Aenean hac quisque turpis odio mattis sapien facilisis\r\n" + 
            		"Quam eu porttitor mauris curabitur nisi primis semper iaculis erat scelerisque cubilia nam nec\r\n"+
            		"Lectus nisl sed venenatis etiam mauris sapien\r\n "+ 
            		"Mollis risus nisl molestie porta nulla hac aenean\r\n","macOS, Windows, Linux, bash", true);
            
			session.beginTransaction();

			session.save(student);
			session.save(student1);
			session.save(student2);
			session.save(essay);
			session.save(essay1);
			session.save(essay2);
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}

}
