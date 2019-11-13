package com.ferreteria.apliacacion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	
	//id direccion FK

}
