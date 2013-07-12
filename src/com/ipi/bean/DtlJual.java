package com.ipi.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/** @author Saifi Ahmada Jul 11, 2013 8:00:01 PM  **/
@Entity
@Table(name="DTL_JUAL")
public class DtlJual implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="id_jual")
	private HdrJual jual;
	
	private String barang;

	public String getBarang() {
		return barang;
	}

	public void setBarang(String barang) {
		this.barang = barang;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public HdrJual getJual() {
		return jual;
	}

	public void setJual(HdrJual jual) {
		this.jual = jual;
	}
	
	
	
	
}

