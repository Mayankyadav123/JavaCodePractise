package com.coding.sorting;

import java.util.Comparator;

public class MovieMultipleComparator implements Comparator<Movie>{

	//first compare by name if no difference then compare by 
	//rating if no difference then compare by year
	
	@Override
	public int compare(Movie ob1, Movie ob2) {
		// TODO Auto-generated method stub
		int compareName=ob1.getName().compareTo(ob2.getName());
		if(compareName!=0) {
			return compareName;
		}
		int compareRating=ob1.getRating()>ob2.getRating()?1:-1;
		if(ob1.getRating()==ob2.getRating()) {
			compareRating=0;
		}
		if(compareRating!=0) {
			return compareRating;
		}
		int compareYear=ob1.getYear()-ob2.getYear();
		return compareYear;
	}

}
