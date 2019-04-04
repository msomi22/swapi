package com.swapi.clinet.model;

import javax.ws.rs.core.HttpHeaders;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.swapi.clinet.entity.People;
import com.swapi.clinet.entity.Planet;
import com.swapi.clinet.entity.StarShip;
import com.swapi.clinet.repository.PeopeRespository;
import com.swapi.clinet.repository.PlanetRepository;
import com.swapi.clinet.repository.StarShipRepository;

public class APIClient {

	private static String BASE_URI  = "https://swapi.co/api/";
	
	@Autowired
	private PeopeRespository peopleRepo;
	@Autowired
	private PlanetRepository planetRepo;
	@Autowired
	private StarShipRepository starShipRepo;

	public static void main(String[] args) {

		APIClient clinet = new APIClient();
		//clinet.getPeople(3);
		//clinet.getPlanet(4);
		clinet.getStarship(3);


	}

	public Object getPeople(int num) {
		
		String url = BASE_URI + "people/" + num;
		
		Client restClient = Client.create();
		WebResource webResource = restClient.resource(url);
		ClientResponse resp = webResource
				.header(HttpHeaders.USER_AGENT, "Mozilla/5.0 Firefox/26.0") 
				.accept("application/json")
				.get(ClientResponse.class);


		if(resp.getStatus() != 200){
			System.err.println("Unable to connect to the server");
		}

		String output = resp.getEntity(String.class);
		
		//System.out.println(output);

		Gson g = new Gson(); 
		People person = g.fromJson(output, People.class);
		System.out.println(person);
		peopleRepo.save(person);
		
		return person;
	}

	public Object getPlanet(int num) {
		
		String url = BASE_URI + "planets/" + num;
		
		Client restClient = Client.create();
		WebResource webResource = restClient.resource(url);
		ClientResponse resp = webResource
				.header(HttpHeaders.USER_AGENT, "Mozilla/5.0 Firefox/26.0") 
				.accept("application/json")
				.get(ClientResponse.class);


		if(resp.getStatus() != 200){
			System.err.println("Unable to connect to the server");
		}

		String output = resp.getEntity(String.class);
		
		//System.out.println(output);
		
		Gson g = new Gson(); 
		Planet planet = g.fromJson(output, Planet.class);
		System.out.println(planet);
		
		planetRepo.save(planet);

		return planet;
	}

	public Object getStarship(int num) {
		
		String url = BASE_URI + "starships/" + num;
		
		Client restClient = Client.create();
		WebResource webResource = restClient.resource(url);
		ClientResponse resp = webResource
				.header(HttpHeaders.USER_AGENT, "Mozilla/5.0 Firefox/26.0") 
				.accept("application/json")
				.get(ClientResponse.class);


		if(resp.getStatus() != 200){
			System.err.println("Unable to connect to the server");
		}

		String output = resp.getEntity(String.class);
		
		//System.out.println(output);
		
		Gson g = new Gson(); 
		StarShip starShip = g.fromJson(output, StarShip.class);
		System.out.println(starShip);
		
		starShipRepo.save(starShip);

		return starShip;
	}

}
