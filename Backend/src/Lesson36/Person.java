package Lesson36;

import java.util.Objects;

public class Person {
	String name;
	String surName;
	
	public Person(String name, String surName) {
		this.name = name;
		this.surName = surName;
}

	@Override
	public int hashCode() {
		return Objects.hash(name, surName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name) && Objects.equals(surName, other.surName);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surName=" + surName + "]";
	}
	
	
	
}
