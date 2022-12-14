package com.oes.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.oes.entity.Review;
import com.oes.exception.EntityNotFoundException;
import com.oes.dto.*;

@Service
public interface ReviewService {
	
    public Review addReview(Review review);
	
	public List<Review> getAllReviewbyUser(String username)throws Exception;

	public List<Review> SortReviewBasedOnRating();

	public List<Review> SortReviewsBasedOnName();

	public List<Review> SortReviewsBasedOnProductName();

	public List<Review> filterAllReviewsByProductName(String productName)throws Exception;

	

	
	
}