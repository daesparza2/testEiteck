package com.example.panaderiaTest.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Imagen")
public class Imagen {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idi;
	private String ruta;
	
	@ManyToOne
    @JoinColumn(name="caja_id", nullable=false)
	@JsonIgnore
	private Caja caja;

	public Long getIdi() {
		return idi;
	}

	public void setIdi(Long idi) {
		this.idi = idi;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public Caja getCaja() {
		return caja;
	}

	public void setCaja(Caja caja) {
		this.caja = caja;
	}
	
	
}
