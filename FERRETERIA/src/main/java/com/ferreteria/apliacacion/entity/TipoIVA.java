package com.ferreteria.apliacacion.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class TipoIVA implements Serializable {
	
	private static final long serialVersionUID = -8508388822670579729L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long tipoiva_id;
	
	@Column
	private String descripcion;
	@Column
	private float alicuota;
	
	@OneToMany(mappedBy="tipoIVA")
	private Set <Producto> producto;

	//GETTERS & SETTERS
	
	public Long getTipoiva_id() {
		return tipoiva_id;
	}

	public void setTipoiva_id(Long tipoiva_id) {
		this.tipoiva_id = tipoiva_id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getAlicuota() {
		return alicuota;
	}

	public void setAlicuota(float alicuota) {
		this.alicuota = alicuota;
	}

	public Set<Producto> getProducto() {
		return producto;
	}

	public void setProducto(Set<Producto> producto) {
		this.producto = producto;
	}
	
}
