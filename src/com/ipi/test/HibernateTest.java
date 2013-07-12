package com.ipi.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ipi.bean.Person;
import com.ipi.bean.Vehicle;

/** @author Saifi Ahmada Jul 11, 2013 1:54:18 PM  **/

public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Person person = new Person();
		
		Vehicle vehicle = new Vehicle();
		
		person.setPersonName("Saifi Ahmada");
		
		vehicle.setVehicleName("Beat Motor");
		
		person.setVehicle(vehicle);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(person);
		session.save(vehicle);
		session.getTransaction().commit();
		
		session.close();

	}

}

