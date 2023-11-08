package com.santiage.solid.OL.figura;

public interface IFigura {		
	
	public double calcularPerimetro();					
	public double calcularArea();		
	
	public int calcularLados();	//sobrecarga o ambiguedad de metodos ya que se define tambien en la clase base como metodo/funcion abstracto 	

}
