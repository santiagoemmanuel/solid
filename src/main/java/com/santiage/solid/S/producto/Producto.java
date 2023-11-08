package com.santiage.solid.S.producto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Producto {
	private final String codigo;
	private String nombre;
	private double precio;
	private double cantidad;
	
	
	
	public double getPrecioTotal(){		 
		return precio *cantidad;		
	}
		
	
	//los metodos abajo comentariados tienen responabilidades diferentes a la clase producto , por tanto se envia a nuevas clases
	
	/*	
	public void guardarBd() {
		//implementacion guardar a BD
	}	
	public void imprimir() {
		//implementacion guardar a BD
	}		
	*/
	
	
}
