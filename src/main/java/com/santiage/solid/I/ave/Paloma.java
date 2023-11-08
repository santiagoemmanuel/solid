package com.santiage.solid.I.ave;

public  class Paloma extends AveBase implements IAveVoladora {	 
	
	public Paloma(String string) {
		super(string);	
	}

	@Override
	public String  comer() {
		return "paloma come en bajas alturas";		
	}

	@Override
	public String volar() {
		return "paloma vuela en bajas alturas";
	}

} 
