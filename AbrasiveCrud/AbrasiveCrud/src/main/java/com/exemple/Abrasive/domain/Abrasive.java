package com.exemple.Abrasive.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Abrasive {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod;
	private int abrasivecod;
	private String typematerial;
	private String application;
	private int grain;
	public Abrasive() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Abrasive(Long cod, int abrasivecod, String typematerial, String application, int grain) {
		super();
		this.cod = cod;
		this.abrasivecod = abrasivecod;
		this.typematerial = typematerial;
		this.application = application;
		this.grain = grain;
	}
	public Long getCod() {
		return cod;
	}
	public void setCod(Long cod) {
				this.cod = cod;
	}
	public int getAbrasivecod() {
		return abrasivecod;
	}
	public void setAbrasivecod(int abrasivecod) {
		this.abrasivecod = abrasivecod;
	}
	
		public String getTypematerial() {
		return typematerial;
	}
	public void setTypematerial(String typematerial) {
		this.typematerial = typematerial;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public int getGrain() {
		return grain;
	}
	public void setGrain(int grain) {
		this.grain = grain;
	}
}	


