//Program to demonstrate Person entity using Comparator interface

package com.tnsif.collectioncomparableandcomparator;

import java.util.Comparator;

public class PersonJava {
	private String name;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}

	public PersonJava(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public PersonJava() {
		super();
		// TODO Auto-generated constructor stub
	}
}

class SortByName implements Comparator<PersonJava> {
	@Override
	public int compare(PersonJava p1, PersonJava p2) {

		return p1.getName().compareTo(p2.getName());
	}
}

class SortByCity implements Comparator<PersonJava> {
	@Override
	public int compare(PersonJava p1, PersonJava p2) {
		return p1.getCity().compareTo(p2.getCity());
	}
}