package com.mx.cbtis.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Productos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_prod;
	@Column(name="categoria")
	private String categoria;
	@Column(name="nombre")
	private String nombre;
	@Column(name="precio")
	private Float precio;
	@Column(name="existencia")
	private Integer existencia;
	@Column(name="img")
	private String img;
	
	
	public Productos() {
		super();
	}
	
	public Productos(Integer id_prod, String categoria, String nombre, Float precio, Integer existencia, String img) {
		super();
		this.id_prod = id_prod;
		this.categoria = categoria;
		this.nombre = nombre;
		this.precio = precio;
		this.existencia = existencia;
		this.img = img;
	}
	public Integer getId_prod() {
		return id_prod;
	}
	public void setId_prod(Integer id_prod) {
		this.id_prod = id_prod;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public Integer getExistencia() {
		return existencia;
	}
	public void setExistencia(Integer existencia) {
		this.existencia = existencia;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
}
