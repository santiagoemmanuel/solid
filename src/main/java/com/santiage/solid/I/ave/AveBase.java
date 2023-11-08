package com.santiage.solid.I.ave;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class AveBase{
	
	public String nombre;
	
	public AveBase(String nombre) {
		this.nombre = nombre;		
	}

	protected abstract String comer();
}
