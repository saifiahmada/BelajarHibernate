package com.ipi.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ipi.bean.Mahasiswa;
import com.ipi.bean.MataKuliah;

/** @author Saifi Ahmada Jul 12, 2013 2:27:34 PM  **/

public class Test7 {
	
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session ses = sf.openSession();
		
		ses.beginTransaction();
		
		String nim = "0034";
		Mahasiswa mhs = new Mahasiswa(nim);
		mhs.setNama("Ahmada");
		
		MataKuliah mtk1 = new MataKuliah("MTK01");
		mtk1.setMataKuliah("Java Pro1");
		mtk1.setMahasiswa(mhs);
		
		MataKuliah mtk2 = new MataKuliah("MTK02");
		mtk2.setMataKuliah("Java Pro2");
		mtk2.setMahasiswa(mhs);
		
		MataKuliah mtk3 = new MataKuliah("MTK03");
		mtk3.setMataKuliah("Java Pro3");
		mtk3.setMahasiswa(mhs);
		
		MataKuliah mtk4 = new MataKuliah("MTK04");
		mtk4.setMataKuliah("Java Pro4");
		mtk4.setMahasiswa(mhs);
		
		MataKuliah mtk5 = new MataKuliah("MTK05");
		mtk5.setMataKuliah("Java Pro5");
		mtk5.setMahasiswa(mhs);
		
		MataKuliah mtk6 = new MataKuliah("MTK06");
		mtk6.setMataKuliah("Java Pro6");
		mtk6.setMahasiswa(mhs);
		
		mhs.getMataKuliahs().add(mtk1);
		mhs.getMataKuliahs().add(mtk2);
		mhs.getMataKuliahs().add(mtk3);
		mhs.getMataKuliahs().add(mtk4);
		mhs.getMataKuliahs().add(mtk5);
		mhs.getMataKuliahs().add(mtk6);
		
		ses.save(mhs);
		
		ses.getTransaction().commit();
		
		ses.close();
		
	}

}

