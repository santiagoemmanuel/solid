package com.santiage.solid.I.ave;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/ws")
@RestController
public class AveController {
	
	@Autowired
	AveSrvImp aveSrv;

	
	//http://localhost:8091/solid/ws/test
	@GetMapping("/ave")
	public String test() {
		System.out.println("test test ");
		aveSrv.crearAves();
		return "camb";												
	}

}
