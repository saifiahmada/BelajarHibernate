package com.ipi.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/** @author Saifi Ahmada Jul 12, 2013 11:41:08 AM  **/
@Entity
@Table(name="SERVICE_DTL")
public class ServiceDtl implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ServiceDtlPK serviceDtlPK;
	@Column(name="HARGA")
	private Integer harga;
	
	@ManyToOne
	@JoinColumn(name="SERVICE_ID", referencedColumnName="SERVICE_ID", insertable=false, updatable=false)
	private Service service;
	
	public ServiceDtl() {
	
	}
	
	public ServiceDtl(ServiceDtlPK serviceDtlPK) {
		this.serviceDtlPK = serviceDtlPK;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public ServiceDtlPK getServiceDtlPK() {
		return serviceDtlPK;
	}

	public void setServiceDtlPK(ServiceDtlPK serviceDtlPK) {
		this.serviceDtlPK = serviceDtlPK;
	}

	public Integer getHarga() {
		return harga;
	}

	public void setHarga(Integer harga) {
		this.harga = harga;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((serviceDtlPK == null) ? 0 : serviceDtlPK.hashCode());
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
		ServiceDtl other = (ServiceDtl) obj;
		if (serviceDtlPK == null) {
			if (other.serviceDtlPK != null)
				return false;
		} else if (!serviceDtlPK.equals(other.serviceDtlPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ServiceDtl [serviceDtlPK=" + serviceDtlPK + "]";
	}
	
}

