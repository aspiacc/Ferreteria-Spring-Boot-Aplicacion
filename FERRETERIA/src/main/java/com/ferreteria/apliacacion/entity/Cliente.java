package com.ferreteria.apliacacion.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 3628642872890539116L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long cliente_id;
	
	@Column
	private String razonSocial;
	@Column
	private String CUIT;
	@Column
	private String telefono;
	
	@ManyToOne
	@JoinColumn(name="direccion_id", nullable=false)
	private Direccion direccion;
	
	@OneToMany(mappedBy="cliente")
	private Set <Factura> factura;
	
	//CONSTRUCTOR VACIO
	public Cliente() {
		
	}
	
	//GETTERS & SETTERS
	
	public Long getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(Long cliente_id) {
		this.cliente_id = cliente_id;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getCUIT() {
		return CUIT;
	}

	public void setCUIT(String cUIT) {
		CUIT = cUIT;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

}
