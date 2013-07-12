package com.ipi.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ipi.bean.DtlJual;
import com.ipi.bean.HdrJual;

/** @author Saifi Ahmada Jul 11, 2013 8:05:48 PM  **/

public class TestHdrDtl {
	
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		HdrJual jual = new HdrJual();
		jual.setId("NSC/01/2005");
		jual.setTgl(new Date());
		
		DtlJual dtl1 = new DtlJual();
		dtl1.setBarang("shampoo");
		dtl1.setJual(jual);
		
		DtlJual dtl2 = new DtlJual();
		dtl2.setBarang("sabun cair");
		dtl2.setJual(jual);

		DtlJual dtl3 = new DtlJual();
		dtl3.setBarang("dettol");
		dtl3.setJual(jual);
		
		DtlJual dtl4 = new DtlJual();
		dtl4.setBarang("pantene");
		dtl4.setJual(jual);
		
		jual.getDtlJualList().add(dtl1);
		jual.getDtlJualList().add(dtl2);
		jual.getDtlJualList().add(dtl3);
		jual.getDtlJualList().add(dtl4);
		
		session.save(jual);
		
		session.getTransaction().commit();
		session.close();
		
	}

}

