package com.ipi.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/** @author Saifi Ahmada Jul 12, 2013 10:12:34 AM  **/
@Embeddable
public class DtlPembelianPK implements Serializable {

	private static final long serialVersionUID = 1L;
	@Column(name="PEMBELIAN_ID")
	private String pembelianId;
	@Column(name="BARANG")
	private String barang;
	
	public DtlPembelianPK() {
	}
	
	public DtlPembelianPK(String pembelianId, String barang) {
		this.pembelianId = pembelianId;
		this.barang = barang;
	}

	public String getPembelianId() {
		return pembelianId;
	}

	public void setPembelianId(String pembelianId) {
		this.pembelianId = pembelianId;
	}

	public String getBarang() {
		return barang;
	}

	public void setBarang(String barang) {
		this.barang = barang;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((barang == null) ? 0 : barang.hashCode());
		result = prime * result
				+ ((pembelianId == null) ? 0 : pembelianId.hashCode());
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
		DtlPembelianPK other = (DtlPembelianPK) obj;
		if (barang == null) {
			if (other.barang != null)
				return false;
		} else if (!barang.equals(other.barang))
			return false;
		if (pembelianId == null) {
			if (other.pembelianId != null)
				return false;
		} else if (!pembelianId.equals(other.pembelianId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DtlPembelianPK [pembelianId=" + pembelianId + ", barang="
				+ barang + "]";
	}
	
}

