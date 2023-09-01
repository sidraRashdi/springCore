package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class employee {
  private String name;
  private List<String> Address;
  private Set<String> Phones;
  private Map<String,String> courses;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getAddress() {
	return Address;
}
public void setAddress(List<String> address) {
	Address = address;
}
public Set<String> getPhones() {
	return Phones;
}
public void setPhones(Set<String> phones) {
	Phones = phones;
}
public Map<String, String> getCourses() {
	return courses;
}
public void setCourses(Map<String, String> courses) {
	this.courses = courses;
}
public employee(String name, List<String> address, Set<String> phones, Map<String, String> courses) {
	super();
	this.name = name;
	Address = address;
	Phones = phones;
	this.courses = courses;
}
public employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "employee [name=" + name + ", Address=" + Address + ", Phones=" + Phones + ", courses=" + courses + "]";
}

}