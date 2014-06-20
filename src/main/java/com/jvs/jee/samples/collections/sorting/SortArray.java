package com.jvs.jee.samples.collections.sorting;

import java.util.Arrays;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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
}

public class SortArray {

	public static void main(String[] args) {
		String[] fruits = new String[] { "Pineapple", "Apple", "Orange", "Banana" };
		int[] numbers = new int[] { 1, 5, 8, 3, 4, 2 };

		Person[] persons = new Person[3];
		persons[0] = new Person("Jorge", 35);
		persons[1] = new Person("Silvia", 37);
		persons[2] = new Person("Didier", 34);
		
		Arrays.sort(fruits);
		Arrays.sort(numbers);
		Arrays.sort(persons);

		int i = 0;
		for (String temp : fruits) {
			System.out.println("fruits " + ++i + " : " + temp);
		}

		i = 0;
		for (int temp : numbers) {
			System.out.println("numbers " + ++i + " : " + temp);
		}
	}
}
