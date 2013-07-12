package com.ipi.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/** @author Saifi Ahmada Jul 12, 2013 11:42:13 AM  **/
@Embeddable
public class ServiceDtlPK implements Serializable {

	private static final long serialVersionUID = 1L;
	@Column(name="SERVICE_ID")
	private String serviceId;
	@Column(name="JOD_ID")
	private String jobId;
	
	public ServiceDtlPK() {
	}
	
	public ServiceDtlPK(String serviceId, String jobId) {
		this.serviceId = serviceId;
		this.jobId = jobId;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jobId == null) ? 0 : jobId.hashCode());
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
		ServiceDtlPK other = (ServiceDtlPK) obj;
		if (jobId == null) {
			if (other.jobId != null)
				return false;
		} else if (!jobId.equals(other.jobId))
			return false;
		if (serviceId == null) {
			if (other.serviceId != null)
				return false;
		} else if (!serviceId.equals(other.serviceId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ServiceDtlPK [serviceId=" + serviceId + ", jobId=" + jobId
				+ "]";
	}
	
}

