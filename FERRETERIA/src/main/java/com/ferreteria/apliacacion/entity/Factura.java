package com.ferreteria.apliacacion.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Factura implements Serializable {
	
	private static final long serialVersionUID = -7774749909743592630L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long factura_id;
	
	@ManyToOne
	@JoinColumn(name="cliente_id", nullable=false)
	private Cliente cliente;
	
	@Column
	private Date fechaEmicion;
	@Column
	private Date fechaVencimiento;
	@Column
	private Date factSubTotal;
	@Column
	private String estado;
	
	
	//GETTERS & SETTERS
	
	public Long getFactura_id() {
		return factura_id;
	}
	
	public void setFactura_id(Long factura_id) {
		this.factura_id = factura_id;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Date getFechaEmicion() {
		return fechaEmicion;
	}
	
	public void setFechaEmicion(Date fechaEmicion) {
		this.fechaEmicion = fechaEmicion;
	}
	
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	public Date getFactSubTotal() {
		return factSubTotal;
	}
	public void setFactSubTotal(Date factSubTotal) {
		this.factSubTotal = factSubTotal;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
