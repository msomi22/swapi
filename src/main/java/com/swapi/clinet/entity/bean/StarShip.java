
package com.swapi.clinet.entity.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class StarShip {

	@JsonIgnore
	private String name;
	@JsonIgnore
	private String model;
	@JsonIgnore
	private String manufacturer;
	@JsonIgnore
	private String cost_in_credits;
	@JsonIgnore
	private String length;
	@JsonIgnore
	private String maxAtmospheringSpeed;
	@JsonIgnore
	private String crew;
	@JsonIgnore
	private String passengers;
	@JsonIgnore
	private String cargoCapacity;
	@JsonIgnore
	private String consumables;
	@JsonIgnore
	private String hyperdriveRating;
	@JsonIgnore
	private String mGLT;
	@JsonIgnore
	private String starshipClass;
	@JsonIgnore
	private List<Object> pilots = null;
	@JsonIgnore
	private List<String> films = null;
	@JsonIgnore
	private String created;
	@JsonIgnore
	private String edited;
	@JsonIgnore
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
		this.maxAtmospheringSpeed = maxAtmospheringSpeed;
		this.crew = crew;
		this.passengers = passengers;
		this.cargoCapacity = cargoCapacity;
		this.consumables = consumables;
		this.hyperdriveRating = hyperdriveRating;
		this.mGLT = mGLT;
		this.starshipClass = starshipClass;
		this.pilots = pilots;
		this.films = films;
		this.created = created;
		this.edited = edited;
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCostInCredits() {
		return cost_in_credits;
	}

	public void setCostInCredits(String costInCredits) {
		this.cost_in_credits = costInCredits;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getMaxAtmospheringSpeed() {
		return maxAtmospheringSpeed;
	}

	public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
		this.maxAtmospheringSpeed = maxAtmospheringSpeed;
	}

	public String getCrew() {
		return crew;
	}

	public void setCrew(String crew) {
		this.crew = crew;
	}

	public String getPassengers() {
		return passengers;
	}

	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}

	public String getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(String cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public String getConsumables() {
		return consumables;
	}

	public void setConsumables(String consumables) {
		this.consumables = consumables;
	}

	public String getHyperdriveRating() {
		return hyperdriveRating;
	}

	public void setHyperdriveRating(String hyperdriveRating) {
		this.hyperdriveRating = hyperdriveRating;
	}

	public String getMGLT() {
		return mGLT;
	}

	public void setMGLT(String mGLT) {
		this.mGLT = mGLT;
	}

	public String getStarshipClass() {
		return starshipClass;
	}

	public void setStarshipClass(String starshipClass) {
		this.starshipClass = starshipClass;
	}

	public List<Object> getPilots() {
		return pilots;
	}

	public void setPilots(List<Object> pilots) {
		this.pilots = pilots;
	}

	public List<String> getFilms() {
		return films;
	}

	public void setFilms(List<String> films) {
		this.films = films;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getEdited() {
		return edited;
	}

	public void setEdited(String edited) {
		this.edited = edited;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StarShip [name=" + name + ", model=" + model + ", manufacturer=" + manufacturer + ", costInCredits="
				+ cost_in_credits + ", length=" + length + ", maxAtmospheringSpeed=" + maxAtmospheringSpeed + ", crew="
				+ crew + ", passengers=" + passengers + ", cargoCapacity=" + cargoCapacity + ", consumables="
				+ consumables + ", hyperdriveRating=" + hyperdriveRating + ", mGLT=" + mGLT + ", starshipClass="
				+ starshipClass + ", pilots=" + pilots + ", films=" + films + ", created=" + created + ", edited="
				+ edited + ", url=" + url + "]";
	}

}