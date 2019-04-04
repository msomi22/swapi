package com.swapi.clinet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swapi.clinet.entity.StarShip;

@Repository
public interface StarShipRepository  extends CrudRepository<StarShip, Long>{

}
