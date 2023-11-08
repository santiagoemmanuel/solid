package com.santiage.solid.OL.figura;

public class Circulo extends FiguraBase {

	
	private double radio;
	
	public Circulo(String nombre, double radio) {
		super(nombre);
		this.radio = radio;		
	}
	
	@Override
	public int calcularLados() { return 0; }

	
	@Override
	public double calcularPerimetro() {
		return 2 *Math.PI* radio;
	}

	@Override
	public double calcularArea() {
		return  Math.PI * Math.pow(radio, 2);

		
	}
	// SOLID 
	// O
	// OPEN/CLOSE-> ABIERTO/CERRADO 
	// circulo y rectangulo se crean a apartir de la  clase abstracta e interfaz 
	// si necesito por ejemplo triangulo,cuadrado , exagano etc, estos exteienden de lo abstracto  
	// cerrado la modificacion de los ya existente ya funcionales
} 
