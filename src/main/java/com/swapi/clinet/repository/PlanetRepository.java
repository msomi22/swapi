package com.swapi.clinet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swapi.clinet.entity.Planet;

@Repository
public interface PlanetRepository  extends CrudRepository<Planet, Long>{

}
