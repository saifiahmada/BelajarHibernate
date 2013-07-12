package com.ipi.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ipi.bean.Admin;
import com.ipi.bean.Aplikasi;

/** @author Saifi Ahmada Jul 11, 2013 2:58:15 PM  **/

public class HibernateTest2 {
	
	
	
	public static void main(String[] args) {
		
		
		Admin admin = new Admin();
		admin.setAdminName("Admin Saya");
		
		Aplikasi a1 = new Aplikasi();
		a1.setAplikasiName("Ahmids");
		a1.setAdmin(admin);
		Aplikasi a2 = new Aplikasi();
		a2.setAplikasiName("DIMS");
		a2.setAdmin(admin);
		admin.getAplikasis().add(a1);
		admin.getAplikasis().add(a2);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session ses = sf.openSession();
		ses.beginTransaction();
		
		ses.save(admin);
		
		ses.getTransaction().commit(); 
		
		ses.close();
		
	}
	

	
	

}

