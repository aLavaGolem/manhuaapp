package com.manhua.app.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manhua.app.entity.Link;
import com.manhua.app.repository.LinkRepository;

@RestController
@RequestMapping("/app") 
public class Controller {
	
	@Resource
	private LinkRepository linkRepository;

	@GetMapping("/manhua")
	public Iterable<Link>  getManHua() {
		return linkRepository.getManHua();
	}
	@GetMapping("/manhua/{id}")
	public Iterable<Link>  getManHuaById(@PathVariable Long id) {
		return linkRepository.getManHuaById(id);
	}

	@GetMapping("/manhuaban/{id}")
	public Iterable<Link>  getManHuaBanById(@PathVariable Long id) {
		return linkRepository.getManHuaBanById(id);
	}
	
}