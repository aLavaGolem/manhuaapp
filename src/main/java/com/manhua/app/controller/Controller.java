package com.manhua.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app") 
public class Controller {

	@GetMapping("/manhua")
	public String  getManHua() {
		return "helow";
	}
	@GetMapping("/manhua/{id}")
	public String  getManHuaById(@PathVariable String id) {
		return "helow";
	}

	@GetMapping("/manhuaban/{id}")
	public String  getManHuaBanById(@PathVariable String id) {
		return "helow";
	}
}