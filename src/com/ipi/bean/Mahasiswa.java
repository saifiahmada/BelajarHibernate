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

/** @author Saifi Ahmada Jul 12, 2013 2:20:28 PM  **/
@Entity
@Table(name="MAHASISWA")
public class Mahasiswa implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	 @Column(name="NIM")
	private String nim;
	@Column(name="NAMA")
	private String nama;
	@OneToMany(mappedBy="mahasiswa", cascade=CascadeType.ALL)
	private Set<MataKuliah> mataKuliahs = new HashSet<MataKuliah>();
	
	public Mahasiswa() {
	
	}
	
	public Mahasiswa(String nim) {
		this.nim = nim;
	}

	public Set<MataKuliah> getMataKuliahs() {
		return mataKuliahs;
	}

	public void setMataKuliahs(Set<MataKuliah> mataKuliahs) {
		this.mataKuliahs = mataKuliahs;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nim == null) ? 0 : nim.hashCode());
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
		Mahasiswa other = (Mahasiswa) obj;
		if (nim == null) {
			if (other.nim != null)
				return false;
		} else if (!nim.equals(other.nim))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Mahasiswa [nim=" + nim + "]";
	}
	
}

