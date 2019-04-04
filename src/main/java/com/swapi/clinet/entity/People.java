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
@Table(name = "people")
public class People implements Serializable{

	@Id
	private Long id;

	@Column(columnDefinition = "name")
	private String name;
	private String height;
	private String mass;
	private String hair_color;
	private String skin_color;
	private String eye_color;
	private String birth_year;
	private String gender;
	private String homeworld;
	@ElementCollection(targetClass = String.class )
	private List<String> films = null;
	@ElementCollection(targetClass = String.class )
	private List<String> species = null;
	@ElementCollection(targetClass = String.class )
	private List<Object> vehicles = null;
	@ElementCollection(targetClass = String.class )
	private List<Object> starships = null;
	private String created;
	private String edited;
	private String url;


	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public People() {
	}

	/**
	 * 
	 * @param edited
	 * @param starships
	 * @param birthYear
	 * @param species
	 * @param films
	 * @param hairColor
	 * @param skinColor
	 * @param url
	 * @param mass
	 * @param height
	 * @param created
	 * @param eyeColor
	 * @param name
	 * @param gender
	 * @param homeworld
	 * @param vehicles
	 */
	public People(String name, String height, String mass, String hairColor, String skinColor, String eyeColor, String birthYear, String gender, String homeworld, List<String> films, List<String> species, List<Object> vehicles, List<Object> starships, String created, String edited, String url) {
		super();
		this.name = name;
		this.height = height;
		this.mass = mass;
		this.hair_color = hairColor;
		this.skin_color = skinColor;
		this.eye_color = eyeColor;
		this.birth_year = birthYear;
		this.gender = gender;
		this.homeworld = homeworld;
		this.films = films;
		this.species = species;
		this.vehicles = vehicles;
		this.starships = starships;
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

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getMass() {
		return mass;
	}

	public void setMass(String mass) {
		this.mass = mass;
	}

	public String getHairColor() {
		return hair_color;
	}

	public void setHairColor(String hairColor) {
		this.hair_color = hairColor;
	}

	public String getSkinColor() {
		return skin_color;
	}

	public void setSkinColor(String skinColor) {
		this.skin_color = skinColor;
	}

	public String getEyeColor() {
		return eye_color;
	}

	public void setEyeColor(String eyeColor) {
		this.eye_color = eyeColor;
	}

	public String getBirthYear() {
		return birth_year;
	}

	public void setBirthYear(String birthYear) {
		this.birth_year = birthYear;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHomeworld() {
		return homeworld;
	}

	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}

	public List<String> getFilms() {
		return films;
	}

	public void setFilms(List<String> films) {
		this.films = films;
	}

	public List<String> getSpecies() {
		return species;
	}

	public void setSpecies(List<String> species) {
		this.species = species;
	}

	public List<Object> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Object> vehicles) {
		this.vehicles = vehicles;
	}

	public List<Object> getStarships() {
		return starships;
	}

	public void setStarships(List<Object> starships) {
		this.starships = starships;
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
		return "People [name=" + name + ", height=" + height + ", mass=" + mass + ", hair_color=" + hair_color
				+ ", skin_color=" + skin_color + ", eye_color=" + eye_color + ", birth_year=" + birth_year + ", gender="
				+ gender + ", homeworld=" + homeworld + ", films=" + films + ", species=" + species + ", vehicles="
				+ vehicles + ", starships=" + starships + ", created=" + created + ", edited=" + edited + ", url=" + url
				+ "]";
	}



}