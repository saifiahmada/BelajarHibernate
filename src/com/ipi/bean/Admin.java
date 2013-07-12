package com.ipi.bean;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/** @author Saifi Ahmada Jul 11, 2013 2:41:05 PM  **/
@Entity
@Table(name="ADMIN")
public class Admin {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ADMIN_ID")
	private int adminId;
	@Column(name="ADMIN_NAME")
	private String adminName;
	
	@OneToMany(mappedBy="admin")
	private Collection<Aplikasi> aplikasis = new ArrayList<Aplikasi>();
	
	public Collection<Aplikasi> getAplikasis() {
		return aplikasis;
	}
	public void setAplikasis(Collection<Aplikasi> aplikasis) {
		this.aplikasis = aplikasis;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
}

