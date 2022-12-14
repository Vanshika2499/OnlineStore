package com.oes.sortings;

import java.util.Comparator;

import com.oes.entity.OnlineOrder;
import com.oes.entity.Review;

public class SortReviewsBasedOnName implements Comparator<Review> {

	@Override
    public int compare(Review r1, Review r2) {
        // TODO Auto-generated method stub
        return r2.getUserName().compareTo(r1.getUserName());
    }
}
