package com.jvs.jdk.samples.immutable;

import java.util.Date;

/**
 * Benefits of Immutable Classes in Java
 * <p>
 * 1) Immutable objects are by default thread safe, can be shared without
 * synchronization in concurrent environment.
 * <p>
 * 2) Immutable object simplifies development, because its easier to share
 * between multiple threads without external synchronization.
 * <p>
 * 3) Immutable object boost performance of Java application by reducing
 * synchronization in code.
 * <p>
 * 4) Another important benefit of Immutable objects is reusability, you can
 * cache Immutable object and reuse them, much like String literals and
 * Integers. You can use static factory methods to provide methods like
 * valueOf(), which can return an existing Immutable object from cache, instead
 * of creating a new one.
 * 
 * 
 * We make immutableClass final to avoid putting immutability at risk due to
 * Inheritance and Polymorphism. This Java class is immutable, because its state
 * can not be changed once created.
 * 
 * @author jorgevs
 * 
 */
public final class ImmutableClass {

	// All fields of Immutable class should be final.
	private final String name;
	private final String lastName;
	private final int age;

	// Object should be final in order to restrict sub-class
	// for altering immutability of parent class.
	private final Date remindingDate;

	// Object must be properly constructed i.e. object reference must not leak
	// during construction process.
	public ImmutableClass(Date remDate) {
		name = "Jorge";
		lastName = "Vazquez";
		age = 35;

		if (remDate.getTime() < System.currentTimeMillis()) {
			throw new IllegalArgumentException("Can not set reminder for past time: " + remDate);
		}
		this.remindingDate = new Date(remDate.getTime());
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	/**
	 * Internals of Date can be modified by client code, so by returning clone()
	 * or copy of remindingDate, we avoid that danger and preserves immutability
	 * of class.
	 */
	public Date getRemindingDate() {
		return (Date) remindingDate.clone();
	}

}
