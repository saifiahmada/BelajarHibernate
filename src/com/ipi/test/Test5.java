package com.ipi.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ipi.bean.DtlPembelian;
import com.ipi.bean.Pembelian;

/** @author Saifi Ahmada Jul 12, 2013 11:19:43 AM  **/

public class Test5 {
	
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session ses = sf.openSession();
		
		ses.beginTransaction();
		
		String pembelianId = "P/2013/01/0001";
		Pembelian p = new Pembelian(pembelianId);
		p.setTgl(new Date());
		
		DtlPembelian dtl1 = new DtlPembelian(pembelianId, "BRG01");
		dtl1.setQty(1);
		dtl1.setPembelian(p);

		DtlPembelian dtl2 = new DtlPembelian(pembelianId, "BRG02");
		dtl2.setQty(2);
		dtl2.setPembelian(p);
		
		DtlPembelian dtl3 = new DtlPembelian(pembelianId, "BRG03");
		dtl3.setQty(3);
		dtl3.setPembelian(p);
		
		DtlPembelian dtl4 = new DtlPembelian(pembelianId, "BRG04");
		dtl4.setQty(4);
		dtl4.setPembelian(p);
		
		p.getDtlPembelians().add(dtl1);
		p.getDtlPembelians().add(dtl2);
		p.getDtlPembelians().add(dtl3);
		p.getDtlPembelians().add(dtl4);

		ses.save(p);
		
		ses.getTransaction().commit();
		
		ses.close();
		
	}

}

