package com.asiainfo.huxin.webservice.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Person")
public class Person {
	private long id;
	private String name;
	private int age;
	private Person dad;

	public Person getDad() {
		return dad;
	}

	public void setDad(Person dad) {
		this.dad = dad;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", dad=" + dad + ", getDad()=" + getDad()
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
