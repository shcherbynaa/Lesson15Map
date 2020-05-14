package com.java.l15.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Zooclub {

	private Map<Person, List<Animal>> map = new HashMap<>();

	public Map<Person, List<Animal>> getMap() {
		return map;
	}

	public void setMap(Map<Person, List<Animal>> map) {
		this.map = map;
	}

	public void addMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of the member");
		String name = sc.next();

		System.out.println("Enter age of the member");
		int age = sc.nextInt();
		map.put(new Person(name, age), new ArrayList<>());
	}

	public void addAnimal() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name of member");
		String name = sc.next();

		System.out.println("Enter type of animal");
		String type = sc.next();

		System.out.println("Enter name of animal");
		String nameAnimal = sc.next();

		Animal animal = new Animal(type, nameAnimal);

		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(name)) {
				next.getValue().add(animal);
			}
		}
	}

	public void removeAnimal() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name of member");
		String name = sc.next();

		System.out.println("Enter name of animal");
		String nameAnimal = sc.next();

		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(name)) {
				Iterator<Animal> iterator2 = next.getValue().iterator();
				while (iterator2.hasNext()) {
					if (iterator2.next().getName().equals(nameAnimal)) {
						iterator2.remove();
					}
				}
			}
		}
	}

	public void removeMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of member");
		String name = sc.next();
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(name)) {
				iterator.remove();
			}
		}
	}

	public void removeAnimalFromClub() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter type of animal");
		String type = sc.next();

		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			Iterator<Animal> iterator2 = next.getValue().iterator();
			if (iterator2.next().getType().equals(type)) {
				iterator2.remove();
			}
		}
	}

	public void showClub() {
		for (Entry<Person, List<Animal>> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "---" + entry.getValue());
		}
	}
}
