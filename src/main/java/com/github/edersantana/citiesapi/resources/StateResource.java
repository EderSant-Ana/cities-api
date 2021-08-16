package com.github.edersantana.citiesapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.edersantana.citiesapi.entities.State;
import com.github.edersantana.citiesapi.repositories.StateRepository;

@RestController
@RequestMapping("/states")
public class StateResource {

	@Autowired
	private StateRepository stateRepository;

	/*
	 * @GetMapping public Page<State>states(Pageable page){ return
	 * stateRepository.findAll(page); }
	 */
		
	 @GetMapping
	 public List<State> states(){ 
		 return stateRepository.findAll();
	 }	
}
