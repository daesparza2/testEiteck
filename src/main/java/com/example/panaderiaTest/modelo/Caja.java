package com.example.panaderiaTest.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Caja")
public class Caja {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idc;
	private String nombre;
	private Double precio;
	private Integer cantidad;
	private String descripcion;
	
	@OneToMany(mappedBy="caja")
	private List<Imagen> imagenes;
	
	@ManyToMany(mappedBy = "cajas")
	@JsonIgnore
	private List<Pedido> pedidos;

	public Long getIdc() {
		return idc;
	}

	public void setIdc(Long idc) {
		this.idc = idc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Imagen> getImagenes() {
		return imagenes;
	}

	public void setImagenes(List<Imagen> imagenes) {
		this.imagenes = imagenes;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	
}
