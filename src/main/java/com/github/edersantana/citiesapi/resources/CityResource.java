package com.github.edersantana.citiesapi.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.edersantana.citiesapi.entities.City;
import com.github.edersantana.citiesapi.repositories.CityRepository;

@RestController
@RequestMapping("/cities")
public class CityResource {

	@Autowired
	private CityRepository cityRepository;

	/*
	 * @GetMapping public Page<State>states(Pageable page){ return
	 * stateRepository.findAll(page); }
	 */
		
	 @GetMapping
	 public Page<City> cities(Pageable page){ 
		 return cityRepository.findAll(page);
	 }	
}
