package com.tuempresa.facturacion.modelo;

import javax.persistence.*;

import lombok.*;

@Embeddable @Getter @Setter 
public class Direccion {
	
	@Column(length = 30)
	String Ciudad;
	
	@Column(length = 30)
	String Compania;
	
	@Column(length = 5)
	int codigoPostal;
}
