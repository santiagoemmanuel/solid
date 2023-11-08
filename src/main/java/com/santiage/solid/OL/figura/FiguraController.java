package com.santiage.solid.OL.figura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/ws")
@RestController
public class FiguraController {
	
	@Autowired
	FiguraSrvImp carroSrv;

	
	//http://localhost:8091/solid/ws/test
	@GetMapping("/figura")
	public String test() {
		System.out.println("test test ");
		carroSrv.crearFiguras();
		return "camb";												
	}

}
