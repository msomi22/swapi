package com.swapi.clinet.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(
		value = {"created","edited"},
		allowGetters = true
		)
@Entity
@Table(name = "people")
public class People implements Serializable{

	@Id
	//@GeneratedValue
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Integer id; 

	//@Column(columnDefinition = "name")
	private String name;
	
	//@Column(columnDefinition = "height")
	private String height;
	
	//@Column(columnDefinition = "mass")
	private String mass;
	
	//@Column(columnDefinition = "hairColor")
	private String hair_color;
	
	//@Column(columnDefinition = "skinColor")
	private String skin_color;
	
	//@Column(columnDefinition = "eyeColor")
	private String eye_color;
	
	//@Column(columnDefinition = "birthYear")
	private String birth_year;
	
	//@Column(columnDefinition = "gender")
	private String gender;
	
	//@Column(columnDefinition = "homeworld")
	private String homeworld;
	
//	@JsonIgnore
//	@ElementCollection(targetClass = String.class )
//	private List<String> films = null;
//	@JsonIgnore
//	@ElementCollection(targetClass = String.class )
//	private List<String> species = null;
//	@JsonIgnore
//	@ElementCollection(targetClass = String.class )
//	private List<Object> vehicles = null;
//	@JsonIgnore
//	@ElementCollection(targetClass = String.class )
//	private List<Object> starships = null;
	
	//@Column(columnDefinition = "created")
	private String created;
	
	//@Column(columnDefinition = "edited")
	private String edited;
	
	//@Column(columnDefinition = "url")
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
//		this.films = films;
//		this.species = species;
//		this.vehicles = vehicles;
//		this.starships = starships;
		this.created = created;
		this.edited = edited;
		this.url = url;
	}


	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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

//	public List<String> getFilms() {
//		return films;
//	}
//
//	public void setFilms(List<String> films) {
//		this.films = films;
//	}
//
//	public List<String> getSpecies() {
//		return species;
//	}
//
//	public void setSpecies(List<String> species) {
//		this.species = species;
//	}
//
//	public List<Object> getVehicles() {
//		return vehicles;
//	}
//
//	public void setVehicles(List<Object> vehicles) {
//		this.vehicles = vehicles;
//	}
//
//	public List<Object> getStarships() {
//		return starships;
//	}
//
//	public void setStarships(List<Object> starships) {
//		this.starships = starships;
//	}

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
		return "People [id=" + id + ", name=" + name + ", height=" + height + ", mass=" + mass + ", hair_color="
				+ hair_color + ", skin_color=" + skin_color + ", eye_color=" + eye_color + ", birth_year=" + birth_year
				+ ", gender=" + gender + ", homeworld=" + homeworld + ", created=" + created + ", edited=" + edited
				+ ", url=" + url + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	//@Override
//	public String toString() {
//		return "People [name=" + name + ", height=" + height + ", mass=" + mass + ", hair_color=" + hair_color
//				+ ", skin_color=" + skin_color + ", eye_color=" + eye_color + ", birth_year=" + birth_year + ", gender="
//				+ gender + ", homeworld=" + homeworld + ", films=" + films + ", species=" + species + ", vehicles="
//				+ vehicles + ", starships=" + starships + ", created=" + created + ", edited=" + edited + ", url=" + url
//				+ "]";
//	}



}