package com.santiage.solid.OL.figura;

import org.springframework.stereotype.Service;


@Service
public class FiguraSrvImp {
	
	 
	public void crearFiguras() {
		
		FiguraBase[] carrosArray = {
				new Circulo   ("circulo1", 3),				
				new Rectangulo("rectang1",2,3),
		};		
		recorrerFoguiras(carrosArray);
	}	
	
	
	public void recorrerFoguiras(FiguraBase[] figuras){
		for (FiguraBase figura : figuras) {			
			System.out.println(figura.getNombre() + " " + figura.calcularLados() + " " + figura.getNombreMayusculas() +" "+ figura.calcularArea() +" "+figura.calcularPerimetro() );
			// Principio de sustitucion, ya que las subclases (circulo, rectangulo )
			// pueden se sustituidad por la super clase Figura ,
			// mo importa que subclase se esta iterando, solo se llama la funcines definidas en la superclase sin importar que subclase es
  
		}		
	}		
}
