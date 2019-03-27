package com.coding.sorting;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie>{

	@Override
	public int compare(Movie ob1, Movie ob2) {
		// TODO Auto-generated method stub
		if(ob1.getRating()>ob2.getRating()) {
			return 1;
		}else if(ob1.getRating()<ob2.getRating()) {
			return -1;
		}
		return 0;
	}

}
