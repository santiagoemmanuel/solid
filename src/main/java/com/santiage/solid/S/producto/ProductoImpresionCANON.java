package com.santiage.solid.S.producto;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Qualifier("imprimeCanon")
public class ProductoImpresionCANON implements IProductoImpresion  {	
	
	public void imprimir(Producto prod) {
		System.out.println("Implementacion codigo para imprimir producto impresora marca CANON");
	} 
}
