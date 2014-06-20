package com.jvs.jee.samples.collections.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class SortLinkedList {

	public static void main(String args[]) {

		// Create and initialize linked list
		LinkedList ll = new LinkedList();
		ll.add(new Integer(-8));
		ll.add(new Integer(20));
		ll.add(new Integer(-20));
		ll.add(new Integer(8));

		// Sort list
		Collections.sort(ll);
		// Get iterator
		Iterator li = ll.iterator();
		System.out.print("List sorted: ");
		while (li.hasNext()) {
			System.out.print(li.next() + " ");
		}

		System.out.println();
		// Create a reverse order comparator
		Comparator r = Collections.reverseOrder();
		// Sort list by using the comparator
		Collections.sort(ll, r);
		// Get iterator
		li = ll.iterator();
		System.out.print("List sorted in reverse: ");
		while (li.hasNext()) {
			System.out.print(li.next() + " ");
		}

		System.out.println();
		Collections.shuffle(ll);
		// display randomized list
		li = ll.iterator();
		System.out.print("List shuffled: ");
		while (li.hasNext()) {
			System.out.print(li.next() + " ");
		}

		System.out.println();
		System.out.println("Minimum: " + Collections.min(ll));

		System.out.println("Maximum: " + Collections.max(ll));
	}
}