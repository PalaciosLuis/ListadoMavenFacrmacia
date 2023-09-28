package com.cibertec.modelo;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicamento")
public class Medicamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_medicamento;
	
	private String nombre;
	private String descripcion;
	private String categoria;
	private String precio;
	private String stock;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha_Vencimiento;
	private String proveedor;
	
	
	



	public Medicamento(int idMedicamento, String nombre, String descripcion, String categoria, String precio, String stock,
			Date fechaVencimiento, String proveedor) {
		super();
		this.id_medicamento = idMedicamento;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
		this.fecha_Vencimiento = fechaVencimiento;
		this.proveedor = proveedor;
	}


	public Medicamento() {
		super();
	}


	public int getIdMedicamento() {
		return id_medicamento;
	}



	public void setIdMedicamento(int idMedicamento) {
		this.id_medicamento = idMedicamento;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	public String getPrecio() {
		return precio;
	}



	public void setPrecio(String precio) {
		this.precio = precio;
	}



	public String getStock() {
		return stock;
	}



	public void setStock(String stock) {
		this.stock = stock;
	}



	public Date getFechaVencimiento() {
		return fecha_Vencimiento;
	}



	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fecha_Vencimiento = fechaVencimiento;
	}



	public String getProveedor() {
		return proveedor;
	}



	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}



	@Override
	public String toString() {
		return "Medicamento [idMedicamento=" + id_medicamento + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", categoria=" + categoria + ", precio=" + precio + ", stock=" + stock + ", fechaVencimiento="
				+ fecha_Vencimiento + ", proveedor=" + proveedor + "]";
	}
	
	
	
	

}
