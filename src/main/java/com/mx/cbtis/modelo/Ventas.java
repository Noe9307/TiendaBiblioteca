package com.mx.cbtis.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ventas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_venta;
	@Column(name="producto")
	private String producto;
	@Column(name="cantidad")
	private Integer cantidad;
	@Column(name="total")
	private Float total;
	@Column(name="direccion")
	private String direccion;
	
	
	public Ventas() {
		super();
	}

	public Ventas(Integer id_venta, String producto, Integer cantidad, Float total, String direccion) {
		this.id_venta = id_venta;
		this.producto = producto;
		this.cantidad = cantidad;
		this.total = total;
		this.direccion = direccion;
	}


	public Integer getId_venta() {
		return id_venta;
	}
	public void setId_venta(Integer id_venta) {
		this.id_venta = id_venta;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
