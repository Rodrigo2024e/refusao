package com.smartprocessrefusao.refusao.entities;



import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="tb_cad_ligas")
public class CadastroLiga {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String liga;
	private String si;
	private String fe;
	private String cu;
	private String mn;
	private String mg;
	private String cr;
	private String ni;
	private String na;
	private String zn;
	private String ti;
	private String b;
	private String pb;
	private String al;
	
	
	@OneToMany(mappedBy = "liga")
	private List<Produto> produto = new ArrayList<>();
	
	public CadastroLiga () {
		
	}


	/**
	 * @param id
	 * @param liga
	 * @param si
	 * @param fe
	 * @param cu
	 * @param mn
	 * @param mg
	 * @param cr
	 * @param ni
	 * @param na
	 * @param zn
	 * @param ti
	 * @param b
	 * @param pb
	 * @param al
	 */
	public CadastroLiga(Long id, String liga, String si, String fe, String cu, String mn, String mg, String cr,
			String ni, String na, String zn, String ti, String b, String pb, String al) {
		this.id = id;
		this.liga = liga;
		si = si;
		fe = fe;
		cu = cu;
		mn = mn;
		mg = mg;
		cr = cr;
		ni = ni;
		na = na;
		zn = zn;
		ti = ti;
		b = b;
		pb = pb;
		al = al;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLiga() {
		return liga;
	}


	public void setLiga(String liga) {
		this.liga = liga;
	}


	public String getSi() {
		return si;
	}


	public void setSi(String si) {
		si = si;
	}


	public String getFe() {
		return fe;
	}


	public void setFe(String fe) {
		fe = fe;
	}


	public String getCu() {
		return cu;
	}


	public void setCu(String cu) {
		cu = cu;
	}


	public String getMn() {
		return mn;
	}


	public void setMn(String mn) {
		mn = mn;
	}


	public String getMg() {
		return mg;
	}


	public void setMg(String mg) {
		mg = mg;
	}


	public String getCr() {
		return cr;
	}


	public void setCr(String cr) {
		cr = cr;
	}


	public String getNi() {
		return ni;
	}


	public void setNi(String ni) {
		ni = ni;
	}


	public String getNa() {
		return na;
	}


	public void setNa(String na) {
		na = na;
	}


	public String getZn() {
		return zn;
	}


	public void setZn(String zn) {
		zn = zn;
	}


	public String getTi() {
		return ti;
	}


	public void setTi(String ti) {
		ti = ti;
	}


	public String getB() {
		return b;
	}


	public void setB(String b) {
		b = b;
	}


	public String getPb() {
		return pb;
	}


	public void setPb(String pb) {
		pb = pb;
	}


	public String getAl() {
		return al;
	}


	public void setAl(String al) {
		al = al;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastroLiga other = (CadastroLiga) obj;
		return Objects.equals(id, other.id);
	}
	
	
			
	
}
