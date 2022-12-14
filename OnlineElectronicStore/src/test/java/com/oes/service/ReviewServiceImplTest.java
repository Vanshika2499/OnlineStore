package com.oes.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.oes.entity.Review;
import com.oes.repository.ReviewRepository;
@SpringBootTest
class ReviewServiceImplTest {
	
	@Mock
	ReviewRepository  reviewRepository;

	@InjectMocks
	ReviewServiceImpl reviewService;
	
	@Test
	@DisplayName("Test - to verify the insert operation")
	//@Disabled
	void testAddReview() {
		

		  // given
		  Review sampleInput = new Review("Abc","11-09-2016","vansh","Mobile","Good",5);
		  Review expectedOutput = new Review("Def","12-09-2016","vanshika","Fan","bad",6);
		    //Object obj = new Object();
		  
		  BDDMockito.given(reviewService.addReview(sampleInput)).willReturn(expectedOutput); 
		    // when 
		  Review actualOutput = reviewService.addReview(sampleInput);
		    
		    // verify 
		    assertEquals(expectedOutput, actualOutput);
		   }
	

	@Test
	@Disabled
	void testGetAllReviewbyUser() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testSortReviewBasedOnRating() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testSortReviewsBasedOnName() {
		fail("Not yet implemented");
	}

}
