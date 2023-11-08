package com.santiage.solid.I.ave;

import org.springframework.stereotype.Service;


@Service
public class AveSrvImp {
	
	 
	public void crearAves() {
		
		AveBase[] carrosArray = {
				new Aguila   ("Aguila1"),				
				new Paloma("paloma1"),
				new Pinguino("pinguino"),
		};		
		recorrerAves(carrosArray);
	}	
	
	
	public void recorrerAves(AveBase[] aves){
		for (AveBase ave: aves) {			
			System.out.println(ave.getNombre() + " "  + ave.comer());  
		}		
	}		
}
