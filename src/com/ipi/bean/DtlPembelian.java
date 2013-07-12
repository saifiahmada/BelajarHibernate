package com.ipi.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/** @author Saifi Ahmada Jul 12, 2013 10:12:46 AM  **/
@Entity
@Table(name="DTL_PEMBELIAN")
public class DtlPembelian implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private DtlPembelianPK dtlPembelianPK;
	@Column(name="QTY")
	private int qty;
	
	@ManyToOne
	@JoinColumn(name="PEMBELIAN_ID", referencedColumnName="PEMBELIAN_ID", insertable=false, updatable=false)
	private Pembelian pembelian;
	
	public DtlPembelian() {
	
	}
	
	public DtlPembelian(String pembelianId, String barang) {
		this.dtlPembelianPK = new DtlPembelianPK(pembelianId, barang);
	}

	public Pembelian getPembelian() {
		return pembelian;
	}

	public void setPembelian(Pembelian pembelian) {
		this.pembelian = pembelian;
	}

	public DtlPembelianPK getDtlPembelianPK() {
		return dtlPembelianPK;
	}

	public void setDtlPembelianPK(DtlPembelianPK dtlPembelianPK) {
		this.dtlPembelianPK = dtlPembelianPK;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dtlPembelianPK == null) ? 0 : dtlPembelianPK.hashCode());
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
		DtlPembelian other = (DtlPembelian) obj;
		if (dtlPembelianPK == null) {
			if (other.dtlPembelianPK != null)
				return false;
		} else if (!dtlPembelianPK.equals(other.dtlPembelianPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DtlPembelian [dtlPembelianPK=" + dtlPembelianPK + "]";
	}
	
}

