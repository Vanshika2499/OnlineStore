package com.oes.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oes.entity.OnlineOrder;
import com.oes.entity.Review;
import com.oes.repository.ReviewRepository;
import com.oes.repository.UserRepository;
import com.oes.sortings.SortReviewBasedOnRating;
import com.oes.sortings.sortOnlineOrderbyHightoLow;
import com.oes.sortings.SortReviewsBasedOnName;
import com.oes.sortings.SortReviewsBasedOnProductName;
@Service
public class ReviewServiceImpl implements ReviewService{

	@Autowired
	ReviewRepository reviewRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserService userService;
	
	@Override
	public Review addReview(Review review) {
		Review savedPost = reviewRepository.save(review);
		return savedPost;
	}

	@Override
	public List<Review> getAllReviewbyUser(String username) throws Exception {

		User user = (User) userRepository.getUsersByUsername(username);
		
		
		return null;
	}

	@Override
	public List<Review> SortReviewBasedOnRating() {
		List<Review> list= reviewRepository.findAll();
        List<Review> review = new ArrayList<>();
        Collections.sort(list, new SortReviewBasedOnRating());
        return list;
	}

	@Override
	public List<Review> SortReviewsBasedOnName() {
		List<Review> list= reviewRepository.findAll();
        List<Review> review = new ArrayList<>();
        Collections.sort(list, new SortReviewsBasedOnName());
        // TODO Auto-generated method stub
        return list;
	}
	
	@Override
	public List<Review> SortReviewsBasedOnProductName() {
		List<Review> list= reviewRepository.findAll();
        List<Review> review = new ArrayList<>();
        Collections.sort(list, new SortReviewsBasedOnProductName());
        // TODO Auto-generated method stub
        return list;
	}

	@Override
	public List<Review> filterAllReviewsByProductName(String productName) throws Exception {
		List<Review> output= userService.getAllReviews(productName).stream().filter((iss)->iss.getProductName().equals(productName)).collect(Collectors.toList());
		return output;
	}

	
	
}