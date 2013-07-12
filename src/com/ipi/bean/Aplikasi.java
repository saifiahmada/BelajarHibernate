package com.ipi.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/** @author Saifi Ahmada Jul 11, 2013 2:44:02 PM  **/
@Entity
@Table(name="APLIKASI")
public class Aplikasi {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="APLIKASI_ID")
	private int aplikasiId;
	
	@Column(name="APLIKASI_NAME")
	private String aplikasiName;
	
	@ManyToOne
	@JoinColumn(name="ADMIN_ID", referencedColumnName="ADMIN_ID", insertable=false, updatable=false)
	private Admin admin;
	
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public int getAplikasiId() {
		return aplikasiId;
	}
	public void setAplikasiId(int aplikasiId) {
		this.aplikasiId = aplikasiId;
	}
	public String getAplikasiName() {
		return aplikasiName;
	}
	public void setAplikasiName(String aplikasiName) {
		this.aplikasiName = aplikasiName;
	}
	
	
}

