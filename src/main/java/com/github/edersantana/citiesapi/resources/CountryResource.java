package com.github.edersantana.citiesapi.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.edersantana.citiesapi.entities.Country;
import com.github.edersantana.citiesapi.repositories.CountryRepository;

@RestController
@RequestMapping("/countries")
public class CountryResource {

	@Autowired
	private CountryRepository countryRepository;

	 @GetMapping(value="/list") 
	 public List<Country> list(){ 
		 return countryRepository.findAll();
	 }
		
	@GetMapping
	public Page<Country> findAll(Pageable pageable){
		return countryRepository.findAll(pageable);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Country> getOne(@PathVariable Long id) {
		Optional<Country> obj = countryRepository.findById(id);
		
		if(obj.isPresent()) {
			return ResponseEntity.ok(obj.get());
		}
		return ResponseEntity.notFound().build();
	}
	
}
