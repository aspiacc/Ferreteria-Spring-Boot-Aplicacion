package com.ferreteria.apliacacion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	
	
	

}
