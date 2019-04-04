package com.swapi.clinet.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swapi.clinet.model.APIClient;


@RestController()
//@RequestMapping("/swapi") 
public class ClientAPI {
	
	private APIClient client = new APIClient();
	
	@RequestMapping(path="/starship", method=RequestMethod.GET)
	public Object GetStarShip(@RequestParam(value="num", defaultValue="3") int num) {
		return client.getStarship(num); 
	}
	
	@RequestMapping(path="/peope", method=RequestMethod.GET)
	public Object GetPeople(@RequestParam(value="num", defaultValue="3") int num) {
		return client.getPeople(num);  
	}
	
	@RequestMapping(path="/planet", method=RequestMethod.GET)
	public Object GetPlanet(@RequestParam(value="num", defaultValue="3") int num) {
		return client.getPlanet(num); 
	}
	
	

}
