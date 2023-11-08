package com.santiage.solid.I.ave;

public  class Pinguino extends AveBase implements IAveNadadora {	 
	
	public Pinguino(String string) {
		super(string);	
	}

	@Override
	public String  comer() {
		return "paloma come en bajas alturas";		
	}

	@Override
	public String nadar() {	
		return "pinguino nada en aguas frias";
	}	

} 
