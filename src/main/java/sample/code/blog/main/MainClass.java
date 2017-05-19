package sample.code.blog.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sample.code.blog.Person;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Hibernate one to one (Annotation)");
		Session session = getSessionFactory().openSession();

		session.beginTransaction();

		Person person = new Person();
		person.setAge(21);
		person.setAdress("My Address");
		person.setCountry("SL");
		person.setName("Nirmal");

		session.save(person);
		session.getTransaction().commit();

		System.out.println("Done");
	}

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			return new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		// Close caches and connection pools
		getSessionFactory().close();
	}
}
