package Lesson36;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Sabir", "Mirzaliyev");
		Person person2 = new Person("Umud", "Iskenderov");
		
		List<Person> personList = new ArrayList<>();
		personList.add(person);
		personList.add(person2);
		System.out.println(personList);
	}

}
