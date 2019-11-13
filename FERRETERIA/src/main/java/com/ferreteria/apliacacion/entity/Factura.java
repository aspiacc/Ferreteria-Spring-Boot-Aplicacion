package com.ferreteria.apliacacion.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Factura implements Serializable {
	
	private static final long serialVersionUID = -7774749909743592630L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long factura_id;
	
	//id cliente fk
	@Column
	private Date fechaEmicion;
	@Column
	private Date fechaVencimiento;
	@Column
	private Date factSubTotal;
	@Column
	private String estado;

}
