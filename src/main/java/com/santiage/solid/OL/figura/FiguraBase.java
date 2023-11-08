package com.santiage.solid.OL.figura;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class FiguraBase implements IFigura {
	
	public String nombre;
	
	public FiguraBase(String nombre) {
		this.nombre = nombre;		
	}
	
	public String getNombreMayusculas() {
		return nombre.toUpperCase();
	}
	
	public abstract int calcularLados();
	
	// SOLID 
	// S
	// SINGLE RESPOSABILITY
	// el metodo guardarAbaseDAtos comentado abajo Viola el principio de resposablidada unica,
	// agregar el metodo para guardar en base de datos en esta misma clase agrega logia de otro proposito de la clase figuraGeometrica
	
	
	//public void guardarAbaseDAtos (figura Figura) {}

}
