package com.santiage.solid.OL.figura;

public  class Rectangulo extends FiguraBase {

	private double alto;
	private double ancho; 
	
	public Rectangulo(String string, double alto, double ancho) {
		super(string);
		this.alto = alto;
		this.ancho = ancho;
	}

	@Override
	public int calcularLados() { return 2; }

	@Override
	public double calcularPerimetro() {
		return 2* alto +2*ancho;
		
	}

	@Override
	public double calcularArea() { 
		return  alto *ancho ;
	}
} 
