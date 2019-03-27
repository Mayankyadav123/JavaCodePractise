package com.coding.sorting;

import java.util.Comparator;

public class NameCompare implements Comparator<Movie>{

	@Override
	public int compare(Movie ob1, Movie ob2) {
		// TODO Auto-generated method stub
		return ob1.getName().compareTo(ob2.getName());
	}

}
