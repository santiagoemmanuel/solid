package com.santiage.solid.S.producto;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Qualifier("imprimeEmpson")
//@Primary 

public class ProductoImpresionEPSON implements IProductoImpresion  {	
	
	public void imprimir(Producto prod) {
		System.out.println("Implementacion codigo para imprimir producto impresora marca EPSON");
	} 
}
 //Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed