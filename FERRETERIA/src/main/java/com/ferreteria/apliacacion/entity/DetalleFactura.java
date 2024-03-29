package com.ferreteria.apliacacion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class DetalleFactura implements Serializable {
	
	private static final long serialVersionUID = 5229295178074368473L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long detallefactura_id;
//	
//	@EmbeddedId
//	private DetalleFactura id;
//	
	@ManyToOne
    @MapsId("producto_id")
    @JoinColumn(name = "producto_id", nullable=false)
    private Producto producto;
	
	@ManyToOne
    @MapsId("factura_id")
    @JoinColumn(name = "factura_id", nullable=false)
    private Factura factura;
	
	@Column
	private float importeNeto;
	@Column
	private float precioFinal;
	@Column
	private int cantidad;
	@Column
	private float montoIVA;
	

}
