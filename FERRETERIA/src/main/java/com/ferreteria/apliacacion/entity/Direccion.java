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
public class Direccion implements Serializable {
	
	private static final long serialVersionUID = 6011336464696523866L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long direccion_id;	
	
	@Column
	private String provincia;
	@Column
	private String localidad;
	@Column
	private String calle;
	@Column
	private int numero;
	@Column
	private String codigoPosta;
	
	@OneToMany(mappedBy="direccion")
	private Set <Cliente> cliente;

	//GETTERS & SETTERS
	
	public Long getDireccion_id() {
		return direccion_id;
	}

	public void setDireccion_id(Long direccion_id) {
		this.direccion_id = direccion_id;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCodigoPosta() {
		return codigoPosta;
	}

	public void setCodigoPosta(String codigoPosta) {
		this.codigoPosta = codigoPosta;
	}

	public Set<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(Set<Cliente> cliente) {
		this.cliente = cliente;
	}	

}
