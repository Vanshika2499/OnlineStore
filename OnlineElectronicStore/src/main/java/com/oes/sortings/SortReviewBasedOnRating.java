package com.oes.sortings;

import java.util.Comparator;

import com.oes.entity.Review;

public class SortReviewBasedOnRating implements Comparator<Review> {
	
	@Override
	public int compare(Review r1, Review r2)
	{
		return r1.getRating()- r2.getRating();
	}

}
