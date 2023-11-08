package com.santiage.solid.S.producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/ws")
@RestController
public class ProductoController {
	
	@Autowired
	@Qualifier("imprimeCanon")
	IProductoImpresion prodImpresionSrv;
	
	
	
	//http://localhost:8091/solid/ws/producto
	@GetMapping("/producto")
	public Producto test() {
		System.out.println("test test producto");
		var prod = new Producto("20202");
		prodImpresionSrv.imprimir(new Producto("P-2023"));
		return prod;												
	}

}
