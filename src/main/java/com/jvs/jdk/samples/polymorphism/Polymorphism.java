package com.jvs.jdk.samples.polymorphism;

import java.util.ArrayList;
import java.util.List;

class Animal {
	public void eat() {
		System.out.println("The ANIMAL is eatting...");
	}

	public static void animalEat(Animal animal) {
		animal.eat();
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("The dog is eatting...");
	}
}

class Cow extends Animal {
	public void eat() {
		System.out.println("The cow is eatting...");
	}
}

// ------------------------------------------------------------------

public class Polymorphism {
	public static void main(String[] args) {
		Animal dog, cow, genericAnimal;

		dog = new Dog();
		cow = new Cow();
		genericAnimal = new Animal();
				
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(dog);
		animalList.add(cow);
		animalList.add(genericAnimal);

		// Traversing a List with Polymorphism
		for (Animal animal : animalList) {
			animal.eat();
		}

		System.out.println("\n");

		// Executing child methods through Polymorphism
		Animal.animalEat(dog);
		Animal.animalEat(cow);
		Animal.animalEat(genericAnimal);
	}
}
