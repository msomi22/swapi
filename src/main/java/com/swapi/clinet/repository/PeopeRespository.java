package com.swapi.clinet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swapi.clinet.entity.People;

@Repository
public interface PeopeRespository extends CrudRepository<People, Long>{

}
