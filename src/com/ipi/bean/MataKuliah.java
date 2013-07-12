package com.ipi.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/** @author Saifi Ahmada Jul 12, 2013 2:22:16 PM  **/
@Entity
@Table(name="MATA_KULIAH")
public class MataKuliah implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="KODE")
	private String kode;
	@Column(name="MATA_KULIAH")
	private String mataKuliah;
	
	@ManyToOne
	@JoinColumn(name="nim")
	private Mahasiswa mahasiswa;
	
	public MataKuliah() {
	
	}
	
	public MataKuliah(String kode){
		this.kode = kode;
	}

	public Mahasiswa getMahasiswa() {
		return mahasiswa;
	}

	public void setMahasiswa(Mahasiswa mahasiswa) {
		this.mahasiswa = mahasiswa;
	}

	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public String getMataKuliah() {
		return mataKuliah;
	}

	public void setMataKuliah(String mataKuliah) {
		this.mataKuliah = mataKuliah;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kode == null) ? 0 : kode.hashCode());
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
		MataKuliah other = (MataKuliah) obj;
		if (kode == null) {
			if (other.kode != null)
				return false;
		} else if (!kode.equals(other.kode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MataKuliah [kode=" + kode + "]";
	}
	
}

