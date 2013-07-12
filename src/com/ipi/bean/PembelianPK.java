package com.ipi.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/** @author Saifi Ahmada Jul 12, 2013 10:07:21 AM  **/
@Embeddable
public class PembelianPK implements Serializable {

	private static final long serialVersionUID = 1L;
	@Column(name="PEMBELIAN_ID")
	private String pembelianId;
	
	public PembelianPK() {
	
	}
	
	public PembelianPK(String pembelianId) {
		this.pembelianId = pembelianId;
	}

	public String getPembelianId() {
		return pembelianId;
	}

	public void setPembelianId(String pembelianId) {
		this.pembelianId = pembelianId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		PembelianPK other = (PembelianPK) obj;
		if (pembelianId == null) {
			if (other.pembelianId != null)
				return false;
		} else if (!pembelianId.equals(other.pembelianId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PembelianPK [pembelianId=" + pembelianId + "]";
	}
	
	

}

