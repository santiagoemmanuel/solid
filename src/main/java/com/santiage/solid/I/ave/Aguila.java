package com.santiage.solid.I.ave;

public class Aguila extends AveBase implements IAveVoladora {
			
	public Aguila(String nombre) {
		super(nombre);				
	}

	@Override
	public String comer() {
		return "aguila come su presa";		
	}

	@Override
	public String volar() {
		return "aguila vuela por los cielos";		
	}
	
}
	

