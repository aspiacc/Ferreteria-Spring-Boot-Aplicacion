package com.ferreteria.apliacacion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class DetalleFactura implements Serializable {
	
	private static final long serialVersionUID = 5229295178074368473L;
	//idFactura FK
	//idProducto FK
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	
	@Column
	private float importeNeto;
	@Column
	private int cantidad;
	@Column
	private float montoIVA;
	
	
	

}
