package com.jts.Spring.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jts.Spring.project.entity.Load;
import com.jts.Spring.project.service.LoadService;

@RestController
@RequestMapping("/api")
public class LoadController {
	
	@Autowired
	private LoadService loadService;
	
	@PostMapping("/save")
	public Load save(@RequestBody Load load) {
		return loadService.saveload(load);
	}
	
	@GetMapping("/findAll")
	public List<Load> FindAll(){
		return loadService.findAll();
	}
	
	@GetMapping("/findById")
	public Load findById(@RequestParam Long id) {
		return loadService.findById(id);
	}
	
	@PutMapping("/update")
	public Load update(@RequestBody Load load) {
		return loadService.updateload(load);
	}
	
	@DeleteMapping("/deleteById")
	public void delete(@RequestParam int id) {
		loadService.deleteload(id);
	}
	
}


