package com.product.rating.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.rating.dao.RatingRepository;
import com.product.rating.entity.RatingDetails;

@Service
public class RatingDetailsServiceImpl implements RatingDetailsService{

	@Autowired
	private RatingRepository ratingRepository;

		 
	@Override
	public List<RatingDetails> getRatingDetails(long productId) {
		
		System.out.println("From RatingDetailsServiceImpl : "+productId);
		 List<RatingDetails> ratingdetailsList = new ArrayList<RatingDetails>(); 
		 
		
		 ratingdetailsList =  ratingRepository.findByProductId(productId); 
	  return ratingdetailsList; 
	}
	 
	

}