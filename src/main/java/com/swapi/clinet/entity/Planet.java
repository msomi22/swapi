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
@Table(name = "planet")
public class Planet implements Serializable{

	@Id
	private Long id;

	@Column(columnDefinition = "name")
	private String name;
	private String rotation_period;
	private String orbital_period;
	private String diameter;
	private String climate;
	private String gravity;
	private String terrain;
	private String surface_water;
	private String population;
	@ElementCollection(targetClass = String.class )
	private List<Object> residents = null;
	@ElementCollection(targetClass = String.class )
	private List<String> films = null;
	private String created;
	private String edited;
	private String url;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Planet() {
	}

	/**
	 * 
	 * @param edited
	 * @param terrain
	 * @param diameter
	 * @param orbitalPeriod
	 * @param films
	 * @param url
	 * @param created
	 * @param rotationPeriod
	 * @param name
	 * @param surfaceWater
	 * @param climate
	 * @param gravity
	 * @param population
	 * @param residents
	 */
	public Planet(String name, String rotationPeriod, String orbitalPeriod, String diameter, String climate, String gravity, String terrain, String surfaceWater, String population, List<Object> residents, List<String> films, String created, String edited, String url) {
		super();
		this.name = name;
		this.rotation_period = rotationPeriod;
		this.orbital_period = orbitalPeriod;
		this.diameter = diameter;
		this.climate = climate;
		this.gravity = gravity;
		this.terrain = terrain;
		this.surface_water = surfaceWater;
		this.population = population;
		this.residents = residents;
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
	 * @return the rotation_period
	 */
	public String getRotation_period() {
		return rotation_period;
	}

	/**
	 * @param rotation_period the rotation_period to set
	 */
	public void setRotation_period(String rotation_period) {
		this.rotation_period = rotation_period;
	}

	/**
	 * @return the orbital_period
	 */
	public String getOrbital_period() {
		return orbital_period;
	}

	/**
	 * @param orbital_period the orbital_period to set
	 */
	public void setOrbital_period(String orbital_period) {
		this.orbital_period = orbital_period;
	}

	/**
	 * @return the diameter
	 */
	public String getDiameter() {
		return diameter;
	}

	/**
	 * @param diameter the diameter to set
	 */
	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	/**
	 * @return the climate
	 */
	public String getClimate() {
		return climate;
	}

	/**
	 * @param climate the climate to set
	 */
	public void setClimate(String climate) {
		this.climate = climate;
	}

	/**
	 * @return the gravity
	 */
	public String getGravity() {
		return gravity;
	}

	/**
	 * @param gravity the gravity to set
	 */
	public void setGravity(String gravity) {
		this.gravity = gravity;
	}

	/**
	 * @return the terrain
	 */
	public String getTerrain() {
		return terrain;
	}

	/**
	 * @param terrain the terrain to set
	 */
	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	/**
	 * @return the surface_water
	 */
	public String getSurface_water() {
		return surface_water;
	}

	/**
	 * @param surface_water the surface_water to set
	 */
	public void setSurface_water(String surface_water) {
		this.surface_water = surface_water;
	}

	/**
	 * @return the population
	 */
	public String getPopulation() {
		return population;
	}

	/**
	 * @param population the population to set
	 */
	public void setPopulation(String population) {
		this.population = population;
	}

	/**
	 * @return the residents
	 */
	public List<Object> getResidents() {
		return residents;
	}

	/**
	 * @param residents the residents to set
	 */
	public void setResidents(List<Object> residents) {
		this.residents = residents;
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
		return "Planet [name=" + name + ", rotation_period=" + rotation_period + ", orbital_period=" + orbital_period
				+ ", diameter=" + diameter + ", climate=" + climate + ", gravity=" + gravity + ", terrain=" + terrain
				+ ", surface_water=" + surface_water + ", population=" + population + ", residents=" + residents
				+ ", films=" + films + ", created=" + created + ", edited=" + edited + ", url=" + url + "]";
	}


}