package com.swapi.clinet.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(
		value = {"created","edited"},
		allowGetters = true
		)
@Entity
@Table(name = "starShip")
public class StarShip implements Serializable{

	@Id
	private Long id;

	@Column(columnDefinition = "name")
	private String name;
	private String model;
	private String manufacturer;
	private String cost_in_credits;
	private String length;
	private String max_atmosphering_speed;
	private String crew;
	private String passengers;
	private String cargo_capacity;
	private String consumables;
	private String hyperdrive_rating;
	private String mGLT;
	private String starship_class;
	@ElementCollection(targetClass = String.class )
	private List<Object> pilots = null;
	@ElementCollection(targetClass = String.class )
	private List<String> films = null;
	private String created;
	private String edited;
	private String url;
	
	

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public StarShip() {
	}

	/**
	 * 
	 * @param edited
	 * @param model
	 * @param cargoCapacity
	 * @param crew
	 * @param films
	 * @param url
	 * @param starshipClass
	 * @param passengers
	 * @param pilots
	 * @param created
	 * @param consumables
	 * @param hyperdriveRating
	 * @param manufacturer
	 * @param costInCredits
	 * @param mGLT
	 * @param name
	 * @param length
	 * @param maxAtmospheringSpeed
	 */
	public StarShip(String name, String model, String manufacturer, String costInCredits, String length, String maxAtmospheringSpeed, String crew, String passengers, String cargoCapacity, String consumables, String hyperdriveRating, String mGLT, String starshipClass, List<Object> pilots, List<String> films, String created, String edited, String url) {
		super();
		this.name = name;
		this.model = model;
		this.manufacturer = manufacturer;
		this.cost_in_credits = costInCredits;
		this.length = length;
		this.max_atmosphering_speed = maxAtmospheringSpeed;
		this.crew = crew;
		this.passengers = passengers;
		this.cargo_capacity = cargoCapacity;
		this.consumables = consumables;
		this.hyperdrive_rating = hyperdriveRating;
		this.mGLT = mGLT;
		this.starship_class = starshipClass;
		this.pilots = pilots;
		this.films = films;
		this.created = created;
		this.edited = edited;
		this.url = url;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * @return the cost_in_credits
	 */
	public String getCost_in_credits() {
		return cost_in_credits;
	}

	/**
	 * @param cost_in_credits the cost_in_credits to set
	 */
	public void setCost_in_credits(String cost_in_credits) {
		this.cost_in_credits = cost_in_credits;
	}

	/**
	 * @return the length
	 */
	public String getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(String length) {
		this.length = length;
	}

	/**
	 * @return the max_atmosphering_speed
	 */
	public String getMax_atmosphering_speed() {
		return max_atmosphering_speed;
	}

	/**
	 * @param max_atmosphering_speed the max_atmosphering_speed to set
	 */
	public void setMax_atmosphering_speed(String max_atmosphering_speed) {
		this.max_atmosphering_speed = max_atmosphering_speed;
	}

	/**
	 * @return the crew
	 */
	public String getCrew() {
		return crew;
	}

	/**
	 * @param crew the crew to set
	 */
	public void setCrew(String crew) {
		this.crew = crew;
	}

	/**
	 * @return the passengers
	 */
	public String getPassengers() {
		return passengers;
	}

	/**
	 * @param passengers the passengers to set
	 */
	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}

	/**
	 * @return the cargo_capacity
	 */
	public String getCargo_capacity() {
		return cargo_capacity;
	}

	/**
	 * @param cargo_capacity the cargo_capacity to set
	 */
	public void setCargo_capacity(String cargo_capacity) {
		this.cargo_capacity = cargo_capacity;
	}

	/**
	 * @return the consumables
	 */
	public String getConsumables() {
		return consumables;
	}

	/**
	 * @param consumables the consumables to set
	 */
	public void setConsumables(String consumables) {
		this.consumables = consumables;
	}

	/**
	 * @return the hyperdrive_rating
	 */
	public String getHyperdrive_rating() {
		return hyperdrive_rating;
	}

	/**
	 * @param hyperdrive_rating the hyperdrive_rating to set
	 */
	public void setHyperdrive_rating(String hyperdrive_rating) {
		this.hyperdrive_rating = hyperdrive_rating;
	}

	/**
	 * @return the mGLT
	 */
	public String getmGLT() {
		return mGLT;
	}

	/**
	 * @param mGLT the mGLT to set
	 */
	public void setmGLT(String mGLT) {
		this.mGLT = mGLT;
	}

	/**
	 * @return the starship_class
	 */
	public String getStarship_class() {
		return starship_class;
	}

	/**
	 * @param starship_class the starship_class to set
	 */
	public void setStarship_class(String starship_class) {
		this.starship_class = starship_class;
	}

	/**
	 * @return the pilots
	 */
	public List<Object> getPilots() {
		return pilots;
	}

	/**
	 * @param pilots the pilots to set
	 */
	public void setPilots(List<Object> pilots) {
		this.pilots = pilots;
	}

	/**
	 * @return the films
	 */
	public List<String> getFilms() {
		return films;
	}

	/**
	 * @param films the films to set
	 */
	public void setFilms(List<String> films) {
		this.films = films;
	}

	/**
	 * @return the created
	 */
	public String getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(String created) {
		this.created = created;
	}

	/**
	 * @return the edited
	 */
	public String getEdited() {
		return edited;
	}

	/**
	 * @param edited the edited to set
	 */
	public void setEdited(String edited) {
		this.edited = edited;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StarShip [name=" + name + ", model=" + model + ", manufacturer=" + manufacturer + ", cost_in_credits="
				+ cost_in_credits + ", length=" + length + ", max_atmosphering_speed=" + max_atmosphering_speed
				+ ", crew=" + crew + ", passengers=" + passengers + ", cargo_capacity=" + cargo_capacity
				+ ", consumables=" + consumables + ", hyperdrive_rating=" + hyperdrive_rating + ", mGLT=" + mGLT
				+ ", starship_class=" + starship_class + ", pilots=" + pilots + ", films=" + films + ", created="
				+ created + ", edited=" + edited + ", url=" + url + "]";
	}

	
}