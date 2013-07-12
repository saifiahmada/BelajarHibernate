package com.ipi.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/** @author Saifi Ahmada Jul 12, 2013 11:35:55 AM  **/
@Entity
@Table(name="SERVICE")
public class Service implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id @Column(name="SERVICE_ID")
	private String serviceId;
	@Column(name="SERVICE_NAMA")
	private String serviceNama;
	@Column(name="NOPOL")
	private String nopol;
	
	@OneToMany(mappedBy="service", cascade= CascadeType.ALL)
	private Set<ServiceDtl> serviceDtlSet = new HashSet<ServiceDtl>();
	
	public Service() {
	
	}
	
	public Service(String serviceId) {
		this.serviceId = serviceId;
	}

	public Set<ServiceDtl> getServiceDtlSet() {
		return serviceDtlSet;
	}

	public void setServiceDtlSet(Set<ServiceDtl> serviceDtlSet) {
		this.serviceDtlSet = serviceDtlSet;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceNama() {
		return serviceNama;
	}

	public void setServiceNama(String serviceNama) {
		this.serviceNama = serviceNama;
	}

	public String getNopol() {
		return nopol;
	}

	public void setNopol(String nopol) {
		this.nopol = nopol;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((serviceId == null) ? 0 : serviceId.hashCode());
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
		Service other = (Service) obj;
		if (serviceId == null) {
			if (other.serviceId != null)
				return false;
		} else if (!serviceId.equals(other.serviceId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Service [serviceId=" + serviceId + "]";
	}
	
}

