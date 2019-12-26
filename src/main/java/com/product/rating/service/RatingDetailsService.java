package com.product.rating.service;

import java.util.List;

import com.product.rating.entity.RatingDetails;

public interface RatingDetailsService {

	//RatingDetails getRatingDetails(long ratingId) ;
	 public List<RatingDetails> getRatingDetails(long productId) ;
}
