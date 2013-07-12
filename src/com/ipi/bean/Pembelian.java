package com.ipi.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** @author Saifi Ahmada Jul 12, 2013 10:06:12 AM  **/
@Entity
@Table(name="PEMBELIAN")
public class Pembelian {
	
	@EmbeddedId
	private PembelianPK pembelianPK;
	
	@Temporal(TemporalType.DATE)
	@Column(name="TGL")
	private Date tgl;
	
	@OneToMany(mappedBy="pembelian", cascade=CascadeType.ALL)
	private Set<DtlPembelian> dtlPembelians = new HashSet<DtlPembelian>();
	
	public Pembelian() {
	
	}
	
	public Pembelian(String pembelianId) {
		this.pembelianPK = new PembelianPK(pembelianId);
	}

	public Set<DtlPembelian> getDtlPembelians() {
		return dtlPembelians;
	}

	public void setDtlPembelians(Set<DtlPembelian> dtlPembelians) {
		this.dtlPembelians = dtlPembelians;
	}

	public PembelianPK getPembelianPK() {
		return pembelianPK;
	}

	public void setPembelianPK(PembelianPK pembelianPK) {
		this.pembelianPK = pembelianPK;
	}

	public Date getTgl() {
		return tgl;
	}

	public void setTgl(Date tgl) {
		this.tgl = tgl;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((pembelianPK == null) ? 0 : pembelianPK.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pembelian other = (Pembelian) obj;
		if (pembelianPK == null) {
			if (other.pembelianPK != null)
				return false;
		} else if (!pembelianPK.equals(other.pembelianPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pembelian [pembelianPK=" + pembelianPK + "]";
	}
	
}

