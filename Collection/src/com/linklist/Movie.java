package com.linklist;

// by comparable
import java.util.*;
import java.util.Collections;

public class Movie implements Comparable<Movie> {

	int id;
	String name;
	float rating;

	public Movie(int id, String name, float rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}

	@Override
	public int compareTo(Movie o) {
		//return Float.compare(this.rating,o.rating);
		//return (int)(o.rating-this.rating);
		return (int) (this.rating-o.rating);
	}

	public static void main(String[] args) {

		ArrayList<Movie> al = new ArrayList<>();
		al.add(new Movie(101, "RRR", 9.1f));
		al.add(new Movie(102, "Arrow", 6.5f));
		al.add(new Movie(103, "War", 8.4f));

		for (Movie m : al) {
			System.out.println(m);
		}

		

		System.out.println("....................................................................");
		
		Collections.sort(al);
		for (Movie m : al) {
			System.out.println(m);
		}
	}

	
}
