package com.coding.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortingMainMethod {

//  If sorting of objects needs to be based on natural order then use 
//	Comparable whereas if you sorting needs to be done on attributes of different objects, 
//	then use Comparator in Java.

//for int variables -1,0,1 for string variable ob1.getName().compareTo(ob2.getName())	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie> movie=new ArrayList<Movie>();
		movie.add(new Movie(8.3,"abc",1994));
		movie.add(new Movie(2.3, "def", 1992));
		movie.add(new Movie(4.6,"xyz",2020));
		movie.add(new Movie(4.6,"sda",2020));

		
		Collections.sort(movie);
		movie.forEach(o->System.out.println(o.toString()));
		
		System.out.println("Sortby rating");
		RatingCompare rc=new RatingCompare();
		Collections.sort(movie, rc);
		movie.forEach(o->System.out.println(o.toString()));
		
		System.out.println("Sortby name");
		NameCompare nc=new NameCompare();
		Collections.sort(movie, nc);
		movie.forEach(o->System.out.println(o.toString()));
		
		System.out.println("Sort by multiple fields");
		MovieMultipleComparator mmc=new MovieMultipleComparator();
		Collections.sort(movie, mmc);
		movie.forEach(o->System.out.println(o.toString()));
		
	}
}
