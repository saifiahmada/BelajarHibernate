package com.ipi.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** @author Saifi Ahmada Jul 11, 2013 7:57:58 PM  **/
@Entity
@Table(name="HDR_JUAL")
public class HdrJual implements Serializable {
	
	private static final long serialVersionUID = 1L;
	//@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private String id;
	
	@Temporal(TemporalType.DATE)
	private Date tgl;
	
	@OneToMany(mappedBy="jual", cascade= CascadeType.ALL)
	private List<DtlJual> dtlJualList = new ArrayList<DtlJual>();
	
	
	public List<DtlJual> getDtlJualList() {
		return dtlJualList;
	}
	public void setDtlJualList(List<DtlJual> dtlJualList) {
		this.dtlJualList = dtlJualList;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getTgl() {
		return tgl;
	}
	public void setTgl(Date tgl) {
		this.tgl = tgl;
	}
	
	
	
	
	
}

