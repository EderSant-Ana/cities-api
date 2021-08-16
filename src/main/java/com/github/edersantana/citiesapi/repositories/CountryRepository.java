package com.github.edersantana.citiesapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.edersantana.citiesapi.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{


}
